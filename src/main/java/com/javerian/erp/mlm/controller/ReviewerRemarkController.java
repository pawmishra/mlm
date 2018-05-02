package com.javerian.erp.mlm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.javerian.erp.mlm.model.auth.User;
import com.javerian.erp.mlm.model.workflow.ProjectWorkDetails;
import com.javerian.erp.mlm.model.workflow.ReviewerRemark;
import com.javerian.erp.mlm.service.auth.UserService;
import com.javerian.erp.mlm.service.workflow.ProjectWorkDetailsService;
import com.javerian.erp.mlm.service.workflow.ReviewerRemarkService;
import com.javerian.erp.mlm.util.Util;


@Controller
public class ReviewerRemarkController {


	
	@Autowired
	ReviewerRemarkService reviewerRemarkService;

	@Autowired
	UserAuthentication authenticationTrustResolver;
	
	@Autowired
	ProjectWorkDetailsService projectWorkDetailsServicel;
	
	@Autowired
	UserService userService;

	@RequestMapping(value = { "/project_allocation" }, method = RequestMethod.GET)
	public String addcategory(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "project_allocation";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {

		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new ReviewerRemark());

		List<ReviewerRemark> listOfReviewerRemark = reviewerRemarkService.findAllReviewerRemark();
		model.addAttribute("listOfReviewerRemark", listOfReviewerRemark);
		
		List<ProjectWorkDetails> listOfProject = projectWorkDetailsServicel.findAllProjectWorkDetails();
		model.addAttribute("listOfProject", listOfProject);
		
		List<User> listOfUser = userService.findAllUsers();
		model.addAttribute("listOfUser", listOfUser);
	}

	@RequestMapping(value = "/save_project_allocation", method = RequestMethod.POST)
	public String addOrganisation(@ModelAttribute ReviewerRemark reviewerRemark, BindingResult result, ModelMap model) {
		reviewerRemark.setReview_datetime(Util.getCurrentTime());
		reviewerRemarkService.save(reviewerRemark);
		addModelAttr(model);
		return "project_allocation";
	}
		
		

	@RequestMapping(value = "/save_project_allocation", method = RequestMethod.GET)
	public String addOrganisation(ModelMap model) {

		addModelAttr(model);
		return "project_allocation";
	}
}
