package com.javerian.erp.mlm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.model.workflow.HelpDeskProblemCategory;
import com.javerian.erp.mlm.model.workflow.HelpDeskTicket;
import com.javerian.erp.mlm.service.workflow.HelpDeskProblemCategoryService;
import com.javerian.erp.mlm.service.workflow.HelpDeskTicketService;
import com.javerian.erp.mlm.util.TicketStatus;
import com.javerian.erp.mlm.util.Util;

@Controller
public class HelpDeskController {

	@Autowired
	HelpDeskTicketService helpDeskTicketService;

	@Autowired
	HelpDeskProblemCategoryService helpDeskProblemCategoryService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@RequestMapping(value = { "/create_ticket" }, method = RequestMethod.GET)
	public String addHDTicket(ModelMap model) {
		return "create_ticket";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {

		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new HelpDeskTicket());

		List<HelpDeskProblemCategory> listOfAllCat = helpDeskProblemCategoryService.findAllHelpDeskProblemCategory();
		List<String> listOfProblemCat = new ArrayList<>();
		for (HelpDeskProblemCategory cat : listOfAllCat) {
			listOfProblemCat.add(cat.getProblem_category());
		}
		model.addAttribute("listOfProblemCat", listOfAllCat);
	}

	@RequestMapping(value = "/saveHDTicket", method = RequestMethod.POST)
	public String addOrganisation(@ModelAttribute HelpDeskTicket helpDeskTicket, BindingResult result, ModelMap model) {

		String ticketId = Util.generateTicketId("HD");
		helpDeskTicket.setTicket_id(ticketId);
		helpDeskTicket.setTicket_resolution_status(TicketStatus.OPEN.getTicketStatus());

		helpDeskTicketService.save(helpDeskTicket);

		addModelAttr(model);

		return "create_ticket";
	}

	@RequestMapping(value = "/saveHDTicket", method = RequestMethod.GET)
	public String addOrganisation(ModelMap model) {
		return "create_ticket";
	}
}
