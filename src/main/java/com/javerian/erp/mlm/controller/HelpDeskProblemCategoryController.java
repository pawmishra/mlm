package com.javerian.erp.mlm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.model.workflow.HelpDeskProblemCategory;
import com.javerian.erp.mlm.service.workflow.HelpDeskProblemCategoryService;

@Controller
public class HelpDeskProblemCategoryController {

	@Autowired
	HelpDeskProblemCategoryService helpDeskProblemCategoryService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@RequestMapping(value = { "/add_problemtype" }, method = RequestMethod.GET)
	public String addbankdetails(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "add_problemtype";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new HelpDeskProblemCategory());

		List<HelpDeskProblemCategory> listOfHelpDeskProblemCategory = helpDeskProblemCategoryService
				.findAllHelpDeskProblemCategory();
		model.addAttribute("listOfHelpDeskProblemCategory", listOfHelpDeskProblemCategory);
	}

	@RequestMapping(value = "/save_problemtype", method = RequestMethod.POST)
	public String addBankDetails(@ModelAttribute HelpDeskProblemCategory helpDeskProblemCategory, BindingResult result,
			ModelMap model) {

		System.out.println(helpDeskProblemCategory);

		addModelAttr(model);

		return "add_problemtype";
	}

	@RequestMapping(value = "/save_problemtype", method = RequestMethod.GET)
	public String addBankDetails(ModelMap model) {
		return "add_problemtype";
	}
}
