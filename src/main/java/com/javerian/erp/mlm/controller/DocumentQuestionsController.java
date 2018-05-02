package com.javerian.erp.mlm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.model.workflow.DocumentQuestions;
import com.javerian.erp.mlm.model.workflow.ProjectWorkDetails;
import com.javerian.erp.mlm.service.workflow.DocumentQuestionsService;
import com.javerian.erp.mlm.service.workflow.ProjectWorkDetailsService;


@Controller
public class DocumentQuestionsController {

	@Autowired
	DocumentQuestionsService documentQuestionsService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	

	@RequestMapping(value = { "/document_questions" }, method = RequestMethod.GET)
	public String uploadQuestiondetails(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "document_questions";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new DocumentQuestions());

		List<DocumentQuestions> listOfdocumentQuestions = documentQuestionsService.findAllDocumentQuestions();
		model.addAttribute("listOfdocumentQuestions", listOfdocumentQuestions);

	}

	@RequestMapping(value = "/save_document_question", method = RequestMethod.POST)
	public String addQuestionDetails(@ModelAttribute DocumentQuestions documentQuestions, BindingResult result, ModelMap model) {

		documentQuestionsService.save(documentQuestions);

		addModelAttr(model);

		return "document_questions";
	}

	@RequestMapping(value = "/save_document_question", method = RequestMethod.GET)
	public String addQuestionDetails(ModelMap model) {
		return "document_questions";
	}
}
