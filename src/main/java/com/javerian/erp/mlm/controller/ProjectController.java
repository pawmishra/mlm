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

@Controller
public class ProjectController {

	private static String UPLOAD_LOCATION = "D://Upload//";
	@Autowired
	OrganisationService OrganisationService;

	@Autowired
	ProjectWorkDetailsService projectWorkDetailsService;

	@Autowired
	CategoryService categoryService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@RequestMapping(value = { "/upload_project" }, method = RequestMethod.GET)
	public String uploadproject(ModelMap model) {

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

	@RequestMapping(value = "/save_Project_work", method = RequestMethod.POST)
	public String addOrganisation(@Valid ProjectWorkDetails prgWorkDetails, BindingResult result, ModelMap model) {

		MultipartFile multipartFile = prgWorkDetails.getFile();

		try {
			FileCopyUtils.copy(prgWorkDetails.getFile().getBytes(),
					new File(UPLOAD_LOCATION + prgWorkDetails.getFile().getOriginalFilename()));
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(multipartFile.getOriginalFilename());

		System.out.println(prgWorkDetails);
		projectWorkDetailsService.save(prgWorkDetails);

		addModelAttr(model);

		return "upload_project";
	}

	@RequestMapping(value = "/save_Project_work", method = RequestMethod.GET)
	public String addOrganisation(ModelMap model) {

		addModelAttr(model);

		return "upload_project";
	}
}
