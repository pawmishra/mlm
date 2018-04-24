package com.javerian.erp.mlm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.model.workflow.ProjectWorkDetails;
import com.javerian.erp.mlm.model.workflow.Question;
import com.javerian.erp.mlm.service.workflow.ProjectWorkDetailsService;
import com.javerian.erp.mlm.service.workflow.QuestionService;

@Controller
public class QuestionController {

	@Autowired
	QuestionService questionService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@Autowired
	ProjectWorkDetailsService projectWorkDetailsServicel;

	@RequestMapping(value = { "/add_questions" }, method = RequestMethod.GET)
	public String uploadQuestiondetails(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "add_questions";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new Question());

		List<Question> listOfQuestion = questionService.findAllQuestion();
		model.addAttribute("listOfQuestion", listOfQuestion);

		List<ProjectWorkDetails> listOfProject = projectWorkDetailsServicel.findAllProjectWorkDetails();
		model.addAttribute("listOfProject", listOfProject);

	}

	@RequestMapping(value = "/save_question", method = RequestMethod.POST)
	public String addQuestionDetails(@ModelAttribute Question question, BindingResult result, ModelMap model) {

		questionService.save(question);

		addModelAttr(model);

		return "add_questions";
	}

	@RequestMapping(value = "/save_question", method = RequestMethod.GET)
	public String addQuestionDetails(ModelMap model) {
		return "add_questions";
	}
}
