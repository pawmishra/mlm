package com.javerian.erp.mlm.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javerian.erp.mlm.model.auth.User;
import com.javerian.erp.mlm.model.auth.UserProfile;
import com.javerian.erp.mlm.model.workflow.CappingPerLevel;
import com.javerian.erp.mlm.model.workflow.Ledger;
import com.javerian.erp.mlm.model.workflow.Registration;
import com.javerian.erp.mlm.service.auth.UserService;
import com.javerian.erp.mlm.service.workflow.CappingPerLevelService;
import com.javerian.erp.mlm.service.workflow.LedgerService;
import com.javerian.erp.mlm.service.workflow.RegistrationService;
import com.javerian.erp.mlm.util.Config;
import com.javerian.erp.mlm.util.LedgerOptions;
import com.javerian.erp.mlm.util.LevelInfo;
import com.javerian.erp.mlm.util.SendMail;
import com.javerian.erp.mlm.util.Util;
import com.javerian.erp.mlm.vo.ChangePasswordVO;

@Controller
public class UserController {

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@Autowired
	UserService userService;

	@Autowired
	CappingPerLevelService cappingPerLevelService;

	@Autowired
	LedgerService ledgerService;

	@Autowired
	RegistrationService registrationService;

	@Autowired
	SendMail sendMail;

	@RequestMapping(value = { "/add_newuser" }, method = RequestMethod.GET)
	public String addnewuser(ModelMap model) {

		return "add_newuser";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {

		User userObjOfLoggedInUser = userService.getLoggedInUser();
		if (userObjOfLoggedInUser != null) {
			model.addAttribute("loggedinuser", userObjOfLoggedInUser.getUsername());

			User user = new User();
			user.setSponser_id(userObjOfLoggedInUser.getId());
			user.setSponser_name(userObjOfLoggedInUser.getFirstName());
			model.addAttribute(user);
		}
	}

	public void addModelAttrForEditProfile(ModelMap model) {

		User userObjOfLoggedInUser = userService.getLoggedInUser();
		model.addAttribute("loggedinuser", userObjOfLoggedInUser.getUsername());
		model.addAttribute(userObjOfLoggedInUser);
	}

	@RequestMapping(value = "/save_user", method = RequestMethod.POST)
	public String addOrganisation(@ModelAttribute User user, BindingResult result, ModelMap model) {

		user.setUsername(user.getFirstName().toLowerCase() + "_" + user.getLastName().toLowerCase());
		user.setPassword("12345");

		Set<UserProfile> set = new HashSet<>();
		UserProfile userProfile = new UserProfile();
		userProfile.setId(Config.USER_PROFILE);
		set.add(userProfile);

		user.setMemberDetails(user.getMemberDetails());
		user.setEligibility_status(Boolean.FALSE);
		user.getMemberDetails().setUser(user);

		user.getMemberDetails().setAddress(user.getMemberDetails().getAddress());
		user.getMemberDetails().getAddress().setMemberDetails(user.getMemberDetails());

		user.setUserProfiles(set);

		userService.saveUser(user);

		// TODO
		// sendMail.sendMail("Testing Subject", "Dear Mail Crawler," + "\n\n No spam to
		// my email, please!",
		// user.getEmail(), "from-email@gmail.com");

		Ledger ledger = new Ledger();
		ledger.setMember_id(user.getId());

		Registration registration = registrationService.findById(1L);
		Registration nil = registrationService.findById(2L);

		ledger.setCredit(registration.getRegistration_amout());
		ledger.setDebit(nil.getRegistration_amout());
		ledger.setTransaction_date(Util.getCurrentTime());
		ledger.setTransaction_remark(LedgerOptions.REGISTRATION_AMOUNT.getLedgerOptions());

		ledgerService.save(ledger);
		// MONEY CALCULATION, BINARY PLAN
		// 1. calculate all parents and count of child
		List<User> sponsersOfChildById = userService.getSponsersOfChildById(user.getId(), Config.LEVEL_TO_BE_PROCESS);

		Ledger ledgerForLevelIncome = new Ledger();
		for (User sponser : sponsersOfChildById) {

			List<User> childsOfSponserById = userService.getChildsOfSponserById(sponser.getId(),
					Config.LEVEL_TO_BE_PROCESS);

			User sponserDetail = userService.findById(sponser.getId());
			// excluding root one, only childs
			int numberofChild = childsOfSponserById.size() - 1;

			// atleast 2 childs required to be eligible for business
			if (numberofChild == 2) {
				if (!sponserDetail.getEligibility_status()) {
					sponserDetail.setEligibility_status(Boolean.TRUE);
					userService.updateUser(sponserDetail);
				}
			}

			// Income should be calculated for members having child in ratio 2:1 and 1:2
			if (numberofChild >= 3) {
				if (!sponserDetail.getEligibility_status()) {
					sponserDetail.setEligibility_status(Boolean.TRUE);
					userService.updateUser(sponserDetail);
				}

				// 2. calculate child level
				int levelResult = numberofChild / 3;
				String levelRemarkOfMember = getLevelRemarkOfMember(levelResult);
				int levelOfMember = getLevelOfMember(levelResult);

				// 3. Count of payment made in ledger for that level for given member id.
				Long id = Long.parseLong(String.valueOf(levelOfMember + 1));
				List<Ledger> findLedgerByMemberIdAndLevel = ledgerService.findLedgerByMemberIdAndLevel(id,
						levelRemarkOfMember);

				int countOfTransactionMadePerLevel = findLedgerByMemberIdAndLevel.size();

				// 4. Payment capping for given level

				CappingPerLevel findAllCappingPerLevel = cappingPerLevelService.findById(id);
				int payment_capping_per_level = findAllCappingPerLevel.getPayment_capping_per_level();

				if (countOfTransactionMadePerLevel <= payment_capping_per_level) {
					// 4. FINAL Payment calculation:
					final double levelPayment = registration.getRegistration_amout() * 0.1;
					ledgerForLevelIncome.setMember_id(sponser.getId());
					ledgerForLevelIncome.setCredit(levelPayment);
					ledgerForLevelIncome.setDebit(nil.getRegistration_amout());
					ledgerForLevelIncome.setTransaction_date(Util.getCurrentTime());
					ledgerForLevelIncome.setTransaction_remark(levelRemarkOfMember);

					ledgerService.update(ledgerForLevelIncome);
				}
			}
		}

		addModelAttr(model);

		return "add_newuser";
	}

	private String getLevelRemarkOfMember(int eligibilityLevel) {

		if (eligibilityLevel == 0) {
			return LevelInfo.LEVEL1_INCOME.getLevelInfo();
		} else if (eligibilityLevel >= 1 && eligibilityLevel <= 2) {
			return LevelInfo.LEVEL2_INCOME.getLevelInfo();
		} else if (eligibilityLevel >= 3 && eligibilityLevel <= 4) {
			return LevelInfo.LEVEL3_INCOME.getLevelInfo();
		} else if (eligibilityLevel >= 5 && eligibilityLevel <= 10) {
			return LevelInfo.LEVEL4_INCOME.getLevelInfo();
		} else if (eligibilityLevel >= 11 && eligibilityLevel <= 20) {
			return LevelInfo.LEVEL5_INCOME.getLevelInfo();
		} else if (eligibilityLevel >= 21 && eligibilityLevel <= 42) {
			return LevelInfo.LEVEL6_INCOME.getLevelInfo();
		} else if (eligibilityLevel >= 43 && eligibilityLevel <= 84) {
			return LevelInfo.LEVEL7_INCOME.getLevelInfo();
		} else if (eligibilityLevel >= 85 && eligibilityLevel <= 170) {
			return LevelInfo.LEVEL8_INCOME.getLevelInfo();
		} else if (eligibilityLevel >= 171 && eligibilityLevel <= 340) {
			return LevelInfo.LEVEL9_INCOME.getLevelInfo();
		} else if (eligibilityLevel >= 341 && eligibilityLevel <= 682) {
			return LevelInfo.LEVEL10_INCOME.getLevelInfo();
		} else if (eligibilityLevel >= 683 && eligibilityLevel <= 1364) {
			return LevelInfo.LEVEL11_INCOME.getLevelInfo();
		} else if (eligibilityLevel >= 1365 && eligibilityLevel <= 2730) {
			return LevelInfo.LEVEL12_INCOME.getLevelInfo();
		} else {
			return LevelInfo.LEVEL_INVALID.getLevelInfo();
		}
	}

	private int getLevelOfMember(int eligibilityLevel) {

		if (eligibilityLevel == 0) {
			return LevelInfo.LEVEL1_INCOME.getLevel();
		} else if (eligibilityLevel >= 1 && eligibilityLevel <= 2) {
			return LevelInfo.LEVEL2_INCOME.getLevel();
		} else if (eligibilityLevel >= 3 && eligibilityLevel <= 4) {
			return LevelInfo.LEVEL3_INCOME.getLevel();
		} else if (eligibilityLevel >= 5 && eligibilityLevel <= 10) {
			return LevelInfo.LEVEL4_INCOME.getLevel();
		} else if (eligibilityLevel >= 11 && eligibilityLevel <= 20) {
			return LevelInfo.LEVEL5_INCOME.getLevel();
		} else if (eligibilityLevel >= 21 && eligibilityLevel <= 42) {
			return LevelInfo.LEVEL6_INCOME.getLevel();
		} else if (eligibilityLevel >= 43 && eligibilityLevel <= 84) {
			return LevelInfo.LEVEL7_INCOME.getLevel();
		} else if (eligibilityLevel >= 85 && eligibilityLevel <= 170) {
			return LevelInfo.LEVEL8_INCOME.getLevel();
		} else if (eligibilityLevel >= 171 && eligibilityLevel <= 340) {
			return LevelInfo.LEVEL9_INCOME.getLevel();
		} else if (eligibilityLevel >= 341 && eligibilityLevel <= 682) {
			return LevelInfo.LEVEL10_INCOME.getLevel();
		} else if (eligibilityLevel >= 683 && eligibilityLevel <= 1364) {
			return LevelInfo.LEVEL11_INCOME.getLevel();
		} else if (eligibilityLevel >= 1365 && eligibilityLevel <= 2730) {
			return LevelInfo.LEVEL12_INCOME.getLevel();
		} else {
			return LevelInfo.LEVEL_INVALID.getLevel();
		}
	}

	@RequestMapping(value = "/save_user", method = RequestMethod.GET)
	public String addOrganisation(ModelMap model) {

		addModelAttr(model);
		return "add_newuser";
	}

	/**
	 * This method will provide the medium to add a new user.
	 */

	@RequestMapping(value = { "/edit_profile" }, method = RequestMethod.GET)
	public String editprofile(ModelMap model) {

		addModelAttrForEditProfile(model);
		return "edit_profile";
	}

	@RequestMapping(value = "/update_user", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute User user, BindingResult result, ModelMap model) {

		User userObjOfLoggedInUser = userService.getLoggedInUser();

		try {

			if (user.getMemberDetails().getFilePanCard() != null) {
				String panFileNameWithPathAfterUpload = Config.UPLOAD_LOCATION + userObjOfLoggedInUser.getId() + "_"
						+ user.getMemberDetails().getFilePanCard().getOriginalFilename();
				FileCopyUtils.copy(user.getMemberDetails().getFilePanCard().getBytes(),
						new File(panFileNameWithPathAfterUpload));
				user.getMemberDetails().setPath_to_pan_card_image(panFileNameWithPathAfterUpload);
			}

			if (user.getMemberDetails().getFileAadharCardFront() != null) {
				String aadharFileNameWithPathAfterUpload_Front = Config.UPLOAD_LOCATION + userObjOfLoggedInUser.getId()
						+ "_" + user.getMemberDetails().getFileAadharCardFront().getOriginalFilename();
				FileCopyUtils.copy(user.getMemberDetails().getFilePanCard().getBytes(),
						new File(aadharFileNameWithPathAfterUpload_Front));
				user.getMemberDetails().setPath_to_aadhar_front_image(aadharFileNameWithPathAfterUpload_Front);
			}
			if (user.getMemberDetails().getFileAadharCardBack() != null) {
				String aadharFileNameWithPathAfterUpload_Back = Config.UPLOAD_LOCATION + userObjOfLoggedInUser.getId()
						+ "_" + user.getMemberDetails().getFileAadharCardBack().getOriginalFilename();
				FileCopyUtils.copy(user.getMemberDetails().getFilePanCard().getBytes(),
						new File(aadharFileNameWithPathAfterUpload_Back));
				user.getMemberDetails().setPath_to_aadhar_back_image(aadharFileNameWithPathAfterUpload_Back);
			}
			userService.updateUser(user);
			addModelAttrForEditProfile(model);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "edit_profile";
	}

	@RequestMapping(value = { "/change_password" }, method = RequestMethod.GET)
	public String changepassword(ModelMap model) {

		addModelAttr(model);
		model.addAttribute(new ChangePasswordVO());
		return "change_password";
	}

	@RequestMapping(value = "/changePassword", method = RequestMethod.POST)
	public String changePassword(@ModelAttribute ChangePasswordVO changePass, BindingResult result, ModelMap model) {

		String msg = userService.changePassword(changePass);
		model.addAttribute(new ChangePasswordVO());
		model.addAttribute("message", msg);

		return "change_password";
	}

	@RequestMapping(value = { "/treeview" }, method = RequestMethod.GET)
	public String getChildOfSponserById(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());

		User loggedInUser = userService.getLoggedInUser();

		List<User> listOfImmediateChilds = userService.getChildOfSponserById(loggedInUser.getId());
		addModelAttrForEditProfile(model);
		model.addAttribute("listOfImmediateChilds", listOfImmediateChilds);

		return "treeview";
	}

	@RequestMapping(value = { "/treeview1" }, method = RequestMethod.GET)
	public String getChildOfSponserById(ModelMap model, @RequestParam("member_id") Long member_id) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());

		User loggedInUser = userService.getLoggedInUser();

		Long user_id = (member_id != null) ? member_id : loggedInUser.getId();

		List<User> listOfImmediateChilds = userService.getChildOfSponserById(user_id);
		addModelAttrForEditProfile(model);
		model.addAttribute("listOfImmediateChilds", listOfImmediateChilds);

		return "treeview";
	}

	@RequestMapping(value = { "/view_members" }, method = RequestMethod.GET)
	public String viewmembers(ModelMap model) {

		addModelAttr(model);
		User loggedInUser = userService.getLoggedInUser();
		List<User> listOfImmediateChilds = userService.getChildOfSponserById(loggedInUser.getId());
		addModelAttrForEditProfile(model);
		model.addAttribute("listOfImmediateChilds", listOfImmediateChilds);
		return "view_members";
	}

	@RequestMapping(value = { "/view_downline_members" }, method = RequestMethod.GET)
	public String viewdownlinemembers(ModelMap model) {

		addModelAttr(model);
		User loggedInUser = userService.getLoggedInUser();
		List<User> listOfImmediateChilds = userService.getChildsOfSponserById(loggedInUser.getId(),
				Config.LEVEL_TO_BE_PROCESS);
		addModelAttrForEditProfile(model);
		model.addAttribute("listOfImmediateChilds", listOfImmediateChilds);
		return "view_downline_members";
	}
}
