package com.javerian.erp.mlm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javerian.erp.mlm.service.workflow.MemberChainService;

@Controller
@RequestMapping("/")
public class MemberController {

	@Autowired
	MemberChainService memberService;

	@RequestMapping(value = { "/saveMemberChain" }, method = RequestMethod.GET)
	public String reviewproject(ModelMap model) {

		memberService.findById(1L);
		return "review_project";
	}
}
