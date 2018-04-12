package com.javerian.erp.mlm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.model.workflow.HelpDeskTicket;
import com.javerian.erp.mlm.service.workflow.HelpDeskTicketService;

@Controller
public class HelpDeskController {

	@Autowired
	HelpDeskTicketService helpDeskTicketService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@RequestMapping(value = { "/addHDTicket" }, method = RequestMethod.GET)
	public String addHDTicket(ModelMap model) {
		return "addHDTicket";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {

		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new HelpDeskTicket());

	}

	@RequestMapping(value = "/saveHDTicket", method = RequestMethod.POST)
	public String addOrganisation(@ModelAttribute HelpDeskTicket helpDeskTicket, BindingResult result, ModelMap model) {

		System.out.println(helpDeskTicket);
		helpDeskTicketService.save(helpDeskTicket);

		addModelAttr(model);

		return "addHDTicket";
	}

	@RequestMapping(value = "/saveHDTicket", method = RequestMethod.GET)
	public String addOrganisation(ModelMap model) {

		addModelAttr(model);

		return "addHDTicket";
	}
}
