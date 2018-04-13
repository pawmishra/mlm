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
import com.javerian.erp.mlm.model.workflow.Question;
import com.javerian.erp.mlm.service.workflow.QuestionService;

@Controller
public class QuestionController {

	@Autowired
	QuestionService questionService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@RequestMapping(value = { "/add_question" }, method = RequestMethod.GET)
	public String addbankdetails(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "add_question";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new PageIncomeTarrif());

		List<Question> listOfQuestion = questionService.findAllQuestion();
		model.addAttribute("listOfQuestion", listOfQuestion);
	}

	@RequestMapping(value = "/save_question", method = RequestMethod.POST)
	public String addBankDetails(@ModelAttribute Question question, BindingResult result, ModelMap model) {

		System.out.println(question);

		addModelAttr(model);

		return "add_question";
	}

	@RequestMapping(value = "/save_question", method = RequestMethod.GET)
	public String addBankDetails(ModelMap model) {
		return "add_question";
	}
}
