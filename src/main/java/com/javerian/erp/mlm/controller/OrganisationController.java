package com.javerian.erp.mlm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.model.workflow.Organisation;
import com.javerian.erp.mlm.service.workflow.OrganisationService;

@Controller
public class OrganisationController {

	@Autowired
	OrganisationService OrganisationService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@RequestMapping(value = { "/add_organization" }, method = RequestMethod.GET)
	public String addorganization(ModelMap model) {

		return "add_organization";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {

		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new Organisation());

		List<Organisation> listOfOrg = OrganisationService.findAllOrganisation();
		model.addAttribute("listOfOrg", listOfOrg);
	}

	@RequestMapping(value = "/save_org", method = RequestMethod.POST)
	public String addOrganisation(@ModelAttribute Organisation org, BindingResult result, ModelMap model) {

		System.out.println(org);
		OrganisationService.save(org);

		addModelAttr(model);

		return "add_organization";
	}

	@RequestMapping(value = "/save_org", method = RequestMethod.GET)
	public String addOrganisation(ModelMap model) {

		addModelAttr(model);

		return "add_organization";
	}
}
