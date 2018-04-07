package com.javerian.erp.mlm.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.javerian.erp.mlm.model.workflow.Category;
import com.javerian.erp.mlm.model.workflow.Organisation;
import com.javerian.erp.mlm.model.workflow.ProjectWorkDetails;
import com.javerian.erp.mlm.service.workflow.CategoryService;
import com.javerian.erp.mlm.service.workflow.OrganisationService;
import com.javerian.erp.mlm.service.workflow.ProjectWorkDetailsService;
import com.javerian.erp.mlm.util.FileValidator;

@Controller
public class ProjectController {

	private static String UPLOAD_LOCATION = "D://Upload//";

	@Autowired
	FileValidator fileValidator;

	@Autowired
	OrganisationService OrganisationService;

	@Autowired
	ProjectWorkDetailsService projectWorkDetailsService;

	@Autowired
	CategoryService categoryService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@InitBinder("projectWorkDetails")
	protected void initBinderFileBucket(WebDataBinder binder) {
		binder.setValidator(fileValidator);
	}

	@RequestMapping(value = { "/upload_project" }, method = RequestMethod.GET)
	public String uploadproject(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "upload_project";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {

		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(new ProjectWorkDetails());

		List<Organisation> listOfOrg = OrganisationService.findAllOrganisation();

		model.addAttribute("listOfOrg", listOfOrg);

		List<Category> listOfCat = categoryService.findAllCategory();

		model.addAttribute("listOfCat", listOfCat);
	}

	@RequestMapping(value = "/save_project_work", method = RequestMethod.POST)
	public String addOrganisation(@Valid ProjectWorkDetails projectWorkDetails, BindingResult result, ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		MultipartFile multipartFile = projectWorkDetails.getFile();

		try {
			FileCopyUtils.copy(projectWorkDetails.getFile().getBytes(),
					new File(UPLOAD_LOCATION + projectWorkDetails.getFile().getOriginalFilename()));
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(multipartFile.getOriginalFilename());

		System.out.println(projectWorkDetails);
		projectWorkDetailsService.save(projectWorkDetails);

		addModelAttr(model);

		return "upload_project";
	}

	// @RequestMapping(value = "/save_project_work", method = RequestMethod.GET)
	// public String addOrganisation(ModelMap model) {
	//
	// addModelAttr(model);
	//
	// return "upload_project";
	// }
}
