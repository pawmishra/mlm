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
public class HomeController {
 
	@Autowired
	LatestNewsService latestNewsService;

	@Autowired
	UserAuthentication authenticationTrustResolver;  
	
	@ModelAttribute
	public void addModelAttr(ModelMap model) {

		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new LatestNews());

		List<LatestNews> listOfLatestNews = latestNewsService.findAllLatestNews();
		model.addAttribute("listOfLatestNews", listOfLatestNews);
	}

}
