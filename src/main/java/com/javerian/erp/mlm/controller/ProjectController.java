package com.javerian.erp.mlm.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.model.auth.User;
import com.javerian.erp.mlm.model.workflow.Category;
import com.javerian.erp.mlm.model.workflow.Organisation;
import com.javerian.erp.mlm.model.workflow.ProjectWorkDetails;
import com.javerian.erp.mlm.service.auth.UserService;
import com.javerian.erp.mlm.service.workflow.CategoryService;
import com.javerian.erp.mlm.service.workflow.OrganisationService;
import com.javerian.erp.mlm.service.workflow.ProjectWorkDetailsService;
import com.javerian.erp.mlm.util.Config;
import com.javerian.erp.mlm.util.FileValidator;
import com.javerian.erp.mlm.util.Util;

@Controller
public class ProjectController {

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

	@Autowired
	UserService userService;

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
		List<Category> listOfAllCat = categoryService.findAllCategory();
		List<Category> listOfCat = new ArrayList<>();
		List<Category> listOfSubCat = new ArrayList<>();
		for (Category cat : listOfAllCat) {
			if (cat.getCategoryType().equalsIgnoreCase("category")) {
				listOfCat.add(cat);
			} else {
				listOfSubCat.add(cat);
			}
		}
		model.addAttribute("listOfCat", listOfCat);
		model.addAttribute("listOfSubCat", listOfSubCat);
	}

	@RequestMapping(value = "/saveProjectWork", method = RequestMethod.POST)
	public String saveProjectWorkDetails(@Valid ProjectWorkDetails projectWorkDetails, BindingResult result,
			ModelMap model) {

		String userName = authenticationTrustResolver.getPrincipal();
		User user = userService.findBySSO(userName);
		projectWorkDetails.setUser_id(user.getId());
		try {
			String ticketId = Util.generateTicketId("REQ");
			String documentId = ticketId + "_"
					+ Util.getFileNameWithoutExt(projectWorkDetails.getFile().getOriginalFilename());
			String extOfFile = StringUtils.getFilenameExtension(projectWorkDetails.getFile().getOriginalFilename());
			String fileNameWithPathAfterUpload = Config.UPLOAD_LOCATION + documentId + "." + extOfFile;
			FileCopyUtils.copy(projectWorkDetails.getFile().getBytes(), new File(fileNameWithPathAfterUpload));

			projectWorkDetails.setDocument_upload_path(fileNameWithPathAfterUpload);
			projectWorkDetails.setDocument_id(documentId);
			projectWorkDetails.setUpload_datetime_stamp(Util.getCurrentTime());
			projectWorkDetailsService.save(projectWorkDetails);
			addModelAttr(model);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "upload_project";
	}

	@RequestMapping(value = "/saveProjectWork", method = RequestMethod.GET)
	public String saveProjectWorkDetails(ModelMap model) {

		addModelAttr(model);
		return "upload_project";
	}
}
