package com.javerian.erp.mlm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.model.workflow.LatestNews;
import com.javerian.erp.mlm.service.workflow.LatestNewsService;

@Controller
public class LatestNewsController {

	@Autowired
	LatestNewsService latestNewsService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@RequestMapping(value = { "/latest_news" }, method = RequestMethod.GET)
	public String addlatestnews(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "latest_news";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {

		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new LatestNews());

		List<LatestNews> listOfLatestNews = latestNewsService.findAllLatestNews();
		model.addAttribute("listOfLatestNews", listOfLatestNews);
	}

	@RequestMapping(value = "/save_latestnews", method = RequestMethod.POST)
	public String addOrganisation(@ModelAttribute LatestNews latestNews, BindingResult result, ModelMap model) {

		System.out.println(latestNews);
		latestNewsService.save(latestNews);
		addModelAttr(model);
		return "latest_news";
	}

	@RequestMapping(value = "/save_latestnews", method = RequestMethod.GET)
	public String addnews(ModelMap model) {
		return "latest_news";
	}
}
