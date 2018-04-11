package com.javerian.erp.mlm.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.model.auth.User;
import com.javerian.erp.mlm.model.auth.UserProfile;
import com.javerian.erp.mlm.service.auth.UserService;
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

	@ModelAttribute
	public void addModelAttr(ModelMap model) {

		String userName = authenticationTrustResolver.getPrincipal();
		model.addAttribute("loggedinuser", userName);

		User user = new User();
		user.setSponser_id(1L);
		user.setSponser_name(userName);
		model.addAttribute(user);
	}

	@RequestMapping(value = "/save_user", method = RequestMethod.POST)
	public String addOrganisation(@ModelAttribute User user, BindingResult result, ModelMap model) {

		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());

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
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "edit_profile";
	}

	@RequestMapping(value = "/update_user", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute User user, BindingResult result, ModelMap model) {

		userService.updateUser(user);
		addModelAttr(model);

		return "edit_profile";
	}

	@RequestMapping(value = { "/change_password" }, method = RequestMethod.GET)
	public String changepassword(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());

		String userName = authenticationTrustResolver.getPrincipal();
		model.addAttribute("loggedinuser", userName);

		model.addAttribute(new ChangePasswordVO());
		return "change_password";
	}

	@RequestMapping(value = "/changePassword", method = RequestMethod.POST)
	public String changePassword(@ModelAttribute ChangePasswordVO changePass, BindingResult result, ModelMap model) {

		userService.changePassword(changePass);
		model.addAttribute(new ChangePasswordVO());

		return "Password Changed Successfully!";
	}

}
