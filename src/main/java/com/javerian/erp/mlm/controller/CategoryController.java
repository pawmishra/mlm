package com.javerian.erp.mlm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.model.workflow.Category;
import com.javerian.erp.mlm.service.workflow.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@RequestMapping(value = { "/add_category" }, method = RequestMethod.GET)
	public String addcategory(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "add_category";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {

		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new Category());

		List<Category> listOfCategory = categoryService.findAllCategory();
		model.addAttribute("listOfCategory", listOfCategory);
	}

	@RequestMapping(value = "/save_cat", method = RequestMethod.POST)
	public String addOrganisation(@ModelAttribute Category category, BindingResult result, ModelMap model) {

		System.out.println(category);
		categoryService.save(category);

		addModelAttr(model);

		return "add_category";
	}

	@RequestMapping(value = "/save_cat", method = RequestMethod.GET)
	public String addOrganisation(ModelMap model) {

		addModelAttr(model);
		return "add_category";
	}
}
