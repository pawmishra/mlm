package com.javerian.erp.mlm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.model.auth.User;

@Controller
public class UserController {

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@RequestMapping(value = { "/add_newuser" }, method = RequestMethod.GET)
	public String addnewuser(ModelMap model) {
		// model.addAttribute("loggedinuser",
		// authenticationTrustResolver.getPrincipal());
		return "add_newuser";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {

		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new User());
	}

	@RequestMapping(value = "/save_user", method = RequestMethod.POST)
	public String addOrganisation(@ModelAttribute User user, BindingResult result, ModelMap model) {

		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());

		System.out.println(user);

		addModelAttr(model);

		return "upload_project";
	}
}
