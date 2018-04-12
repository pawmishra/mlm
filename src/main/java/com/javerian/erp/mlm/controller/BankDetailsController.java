package com.javerian.erp.mlm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.model.workflow.BankDetails;
import com.javerian.erp.mlm.service.workflow.BankDetailsService;

@Controller
public class BankDetailsController {

	@Autowired
	BankDetailsService bankDetailsService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@RequestMapping(value = { "/bank_details" }, method = RequestMethod.GET)
	public String addbankdetails(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "bank_details";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new BankDetails());

		List<BankDetails> listOfBankDetail = bankDetailsService.findAllBankDetails();
		model.addAttribute("listOfBankDetail", listOfBankDetail);
	}

	@RequestMapping(value = "/save_bankdetails", method = RequestMethod.POST)
	public String addBankDetails(@ModelAttribute BankDetails bankDetails, BindingResult result, ModelMap model) {

		System.out.println(bankDetails);
		bankDetailsService.save(bankDetails);

		addModelAttr(model);

		return "bank_details";
	}

	@RequestMapping(value = "/save_bankdetails", method = RequestMethod.GET)
	public String addBankDetails(ModelMap model) {
		return "bank_details";
	}
}
