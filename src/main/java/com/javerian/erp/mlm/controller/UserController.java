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
import com.javerian.erp.mlm.service.auth.UserService;
import com.javerian.erp.mlm.util.Config;
import com.javerian.erp.mlm.vo.ChangePasswordVO;

@Controller
public class UserController {

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@Autowired
	UserService userService;

	@RequestMapping(value = { "/add_newuser" }, method = RequestMethod.GET)
	public String addnewuser(ModelMap model) {

		return "add_newuser";
	}

	private User getLoggedInUser() {
		String userName = authenticationTrustResolver.getPrincipal();
		return userService.findBySSO(userName);
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {

		User userObjOfLoggedInUser = getLoggedInUser();
		model.addAttribute("loggedinuser", userObjOfLoggedInUser.getUsername());

		User user = new User();
		user.setSponser_id(userObjOfLoggedInUser.getId());
		user.setSponser_name(userObjOfLoggedInUser.getFirstName());
		model.addAttribute(user);
	}

	public void addModelAttrForEditProfile(ModelMap model) {

		User userObjOfLoggedInUser = getLoggedInUser();
		model.addAttribute("loggedinuser", userObjOfLoggedInUser.getUsername());
		model.addAttribute(userObjOfLoggedInUser);
	}

	@RequestMapping(value = "/save_user", method = RequestMethod.POST)
	public String addOrganisation(@ModelAttribute User user, BindingResult result, ModelMap model) {

		user.setUsername(user.getFirstName().toLowerCase() + "_" + user.getLastName().toLowerCase());
		user.setPassword("12345");

		Set<UserProfile> set = new HashSet<>();
		UserProfile userProfile = new UserProfile();
		userProfile.setId(1);
		set.add(userProfile);

		user.setMemberDetails(user.getMemberDetails());
		user.getMemberDetails().setUser(user);

		user.getMemberDetails().setAddress(user.getMemberDetails().getAddress());
		user.getMemberDetails().getAddress().setMemberDetails(user.getMemberDetails());

		user.setUserProfiles(set);
		userService.saveUser(user);
		addModelAttr(model);

		return "add_newuser";
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

		User userObjOfLoggedInUser = getLoggedInUser();

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

		userService.changePassword(changePass);
		model.addAttribute(new ChangePasswordVO());
		model.addAttribute("message", "Password Changed Successfully!");
		return "change_password";
	}

	@RequestMapping(value = { "/treeview" }, method = RequestMethod.GET)
	public String getChildOfSponserById(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());

		User loggedInUser = getLoggedInUser();

		List<User> listOfImmediateChilds = userService.getChildOfSponserById(loggedInUser.getId());
		addModelAttrForEditProfile(model);
		model.addAttribute("listOfImmediateChilds", listOfImmediateChilds);

		return "treeview";
	}

	@RequestMapping(value = { "/treeview1" }, method = RequestMethod.GET)
	public String getChildOfSponserById(ModelMap model, @RequestParam("member_id") Long member_id) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());

		User loggedInUser = getLoggedInUser();

		Long user_id = (member_id != null) ? member_id : loggedInUser.getId();

		List<User> listOfImmediateChilds = userService.getChildOfSponserById(user_id);
		addModelAttrForEditProfile(model);
		model.addAttribute("listOfImmediateChilds", listOfImmediateChilds);

		return "treeview";
	}

	@RequestMapping(value = { "/view_members" }, method = RequestMethod.GET)
	public String viewmembers(ModelMap model) {

		addModelAttr(model);
		User loggedInUser = getLoggedInUser();
		List<User> listOfImmediateChilds = userService.getChildOfSponserById(loggedInUser.getId());
		addModelAttrForEditProfile(model);
		model.addAttribute("listOfImmediateChilds", listOfImmediateChilds);
		return "view_members";
	}
}
