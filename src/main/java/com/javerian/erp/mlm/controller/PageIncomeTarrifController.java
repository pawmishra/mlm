package com.javerian.erp.mlm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.model.workflow.PageIncomeTarrif;
import com.javerian.erp.mlm.service.workflow.PageIncomeTarrifService;

@Controller
public class PageIncomeTarrifController {

	@Autowired
	PageIncomeTarrifService pageIncomeTarrifService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@RequestMapping(value = { "/add_pageamount" }, method = RequestMethod.GET)
	public String addperpageamount(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "add_pageamount";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new PageIncomeTarrif());

		List<PageIncomeTarrif> listOfPageIncomeTarrif = pageIncomeTarrifService.findAllPageIncomeTarrif();
		model.addAttribute("listOfPageIncomeTarrif", listOfPageIncomeTarrif);
	}

	@RequestMapping(value = "/save_pageIncomeTarrif", method = RequestMethod.POST)
	public String addPerPageAmount(@ModelAttribute PageIncomeTarrif pageIncomeTarrif, BindingResult result,
			ModelMap model) {

		System.out.println(pageIncomeTarrif);

		addModelAttr(model);

		return "add_pageamount";
	}

	@RequestMapping(value = "/save_pageIncomeTarrif", method = RequestMethod.GET)
	public String addPerPageAmount(ModelMap model) {
		return "add_pageamount";
	}
}
