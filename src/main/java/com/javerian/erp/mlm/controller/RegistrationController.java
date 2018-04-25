package com.javerian.erp.mlm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.model.workflow.Category;
import com.javerian.erp.mlm.model.workflow.Registration;
import com.javerian.erp.mlm.service.workflow.CategoryService;
import com.javerian.erp.mlm.service.workflow.RegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@RequestMapping(value = { "/registration_amount" }, method = RequestMethod.GET)
	public String addRegistration(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "registration_amount";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {

		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new Registration());

		List<Registration> listOfRegistration = registrationService.findAllRegistration();
		model.addAttribute("listOfRegistration", listOfRegistration);
	}

	@RequestMapping(value = "/save_registration_amount", method = RequestMethod.POST)
	public String addRegistration(@ModelAttribute Registration registration, BindingResult result, ModelMap model) {

		registrationService.save(registration);

		addModelAttr(model);

		return "registration_amount";
	}

	@RequestMapping(value = "/save_registration_amount", method = RequestMethod.GET)
	public String addOrganisation(ModelMap model) {

		addModelAttr(model);
		return "registration_amount";
	}
}
