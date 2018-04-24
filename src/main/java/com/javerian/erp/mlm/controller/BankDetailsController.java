package com.javerian.erp.mlm.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.model.auth.User;
import com.javerian.erp.mlm.model.workflow.BankDetails;
import com.javerian.erp.mlm.service.auth.UserService;
import com.javerian.erp.mlm.service.workflow.BankDetailsService;
import com.javerian.erp.mlm.util.Config;

@Controller
public class BankDetailsController {

	@Autowired
	BankDetailsService bankDetailsService;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	@Autowired
	UserService userService;

	@RequestMapping(value = { "/bank_details" }, method = RequestMethod.GET)
	public String addbankdetails(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "bank_details";
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {

		User userObjOfLoggedInUser = userService.getLoggedInUser();
		BankDetails bankDetails = bankDetailsService.findByCustId(userObjOfLoggedInUser.getId());

		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		model.addAttribute(bankDetails);

		// List<BankDetails> listOfBankDetail = bankDetailsService.findAllBankDetails();
		// model.addAttribute("listOfBankDetail", listOfBankDetail);
	}

	@RequestMapping(value = "/save_bankdetails", method = RequestMethod.POST)
	public String addBankDetails(@ModelAttribute BankDetails bankDetails, BindingResult result, ModelMap model) {

		User userObjOfLoggedInUser = userService.getLoggedInUser();
		bankDetails.setCustomer_id(userObjOfLoggedInUser.getId());
		try {
			if (bankDetails.getFileCanceledCheque() != null) {
				String fileName = Config.UPLOAD_LOCATION + Config.NOMINEE + userObjOfLoggedInUser.getId() + "_"
						+ bankDetails.getFileCanceledCheque().getOriginalFilename();
				FileCopyUtils.copy(bankDetails.getFileCanceledCheque().getBytes(), new File(fileName));
				bankDetails.setCancelled_cheque_image(fileName);
			}
			if (bankDetails.getFilePancard() != null) {
				String fileName = Config.UPLOAD_LOCATION + Config.NOMINEE + userObjOfLoggedInUser.getId() + "_"
						+ bankDetails.getFilePancard().getOriginalFilename();
				FileCopyUtils.copy(bankDetails.getFilePancard().getBytes(), new File(fileName));
				bankDetails.setNominee_pan_image_path(fileName);
			}
			if (bankDetails.getFileAadharCardFront() != null) {
				String fileName = Config.UPLOAD_LOCATION + Config.NOMINEE + userObjOfLoggedInUser.getId() + "_"
						+ bankDetails.getFileAadharCardFront().getOriginalFilename();
				FileCopyUtils.copy(bankDetails.getFileAadharCardFront().getBytes(), new File(fileName));
				bankDetails.setNominee_aadhar_image_path(fileName);
			}

			bankDetailsService.save(bankDetails);

			addModelAttr(model);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "bank_details";
	}

	@RequestMapping(value = "/save_bankdetails", method = RequestMethod.GET)
	public String addBankDetails(ModelMap model) {
		return "bank_details";
	}
}
