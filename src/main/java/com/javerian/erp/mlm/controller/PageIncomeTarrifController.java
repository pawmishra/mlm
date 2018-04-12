package com.javerian.erp.mlm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.model.workflow.BankDetails;
import com.javerian.erp.mlm.service.workflow.PageIncomeTarrifService;

@Controller
public class PageIncomeTarrifController {

	@Autowired
	PageIncomeTarrifService pageIncomeTarrifService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@RequestMapping(value = { "/page_" }, method = RequestMethod.GET)
	public String addbankdetails(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "bank_details";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new BankDetails());

	}

	@RequestMapping(value = "/save_bankdetails", method = RequestMethod.POST)
	public String addBankDetails(@ModelAttribute BankDetails bankDetails, BindingResult result, ModelMap model) {

		System.out.println(bankDetails);

		addModelAttr(model);

		return "bank_details";
	}

	@RequestMapping(value = "/save_bankdetails", method = RequestMethod.GET)
	public String addBankDetails(ModelMap model) {
		return "bank_details";
	}
}
