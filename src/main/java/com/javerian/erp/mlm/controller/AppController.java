package com.javerian.erp.mlm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.rememberme.PersistentTokenBasedRememberMeServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.javerian.erp.mlm.model.auth.User;
import com.javerian.erp.mlm.model.auth.UserProfile;
import com.javerian.erp.mlm.model.workflow.LatestNews;
import com.javerian.erp.mlm.model.workflow.Ledger;
import com.javerian.erp.mlm.service.auth.UserProfileService;
import com.javerian.erp.mlm.service.auth.UserService;
import com.javerian.erp.mlm.service.workflow.LatestNewsService;
import com.javerian.erp.mlm.service.workflow.LedgerService;
import com.javerian.erp.mlm.service.workflow.MemberDetailsService;
import com.javerian.erp.mlm.util.LedgerOptions;

@Controller
@RequestMapping("/")
@SessionAttributes("roles")
public class AppController {

	@Autowired
	LatestNewsService latestNewsService;

	@Autowired
	MemberDetailsService memberDetailsService;

	@Autowired
	UserService userService;

	@Autowired
	UserProfileService userProfileService;

	@Autowired
	MessageSource messageSource;

	@Autowired
	LedgerService ledgerService;

	@Autowired
	PersistentTokenBasedRememberMeServices persistentTokenBasedRememberMeServices;

	@Autowired
	UserAuthentication authenticationTrustResolver;

	/**
	 * This method will list all existing users.
	 */
	@RequestMapping(value = { "/", "/mlmHome" }, method = RequestMethod.GET)
	public String landingPage(ModelMap model) {

		List<User> users = userService.findAllUsers();
		model.addAttribute("users", users);
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());

		List<LatestNews> listOfValidNews = latestNewsService.ValidUptoLatestNews();
		model.addAttribute("listOfValidNews", listOfValidNews);

		return "mlmHome";
	}

	/**
	 * This method will provide UserProfile list to views
	 */
	@ModelAttribute("roles")
	public List<UserProfile> initializeProfiles() {
		List<UserProfile> roles = userProfileService.findAll();
		System.out.println(roles);
		return roles;
	}

	/**
	 * This method handles Access-Denied redirect.
	 */
	@RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
	public String accessDeniedPage(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "accessDenied";
	}

	/**
	 * This method handles login GET requests. If users is already logged-in and
	 * tries to goto login page again, will be redirected to list page.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		if (authenticationTrustResolver.isCurrentAuthenticationAnonymous()) {
			return "login";
		} else {
			return "redirect:/mlmHome";
		}
	}

	/**
	 * This method handles logout requests. Toggle the handlers if you are
	 * RememberMe functionality is useless in your app.
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			// new SecurityContextLogoutHandler().logout(request, response, auth);
			persistentTokenBasedRememberMeServices.logout(request, response, auth);
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return "redirect:/login?logout";
	}

	@RequestMapping(value = { "/survey_income" }, method = RequestMethod.GET)
	public String surveyincome(ModelMap model) {
		return getListOfIncome(model, LedgerOptions.PAGE_REVIEW_INCOME.getLedgerOptions(), "listOfSurveyIncome",
				"survey_income");
	}

	private String getListOfIncome(ModelMap model, String typeOfIncome, String modelAttributName, String jspFileName) {
		addModelAttr(model);
		User loggedInUser = userService.getLoggedInUser();
		List<Ledger> listOfSurveyIncome = ledgerService.findLedgerByMemberIdAndLevel(loggedInUser.getId(),
				typeOfIncome);
		addModelAttrForEditProfile(model);
		model.addAttribute(modelAttributName, listOfSurveyIncome);

		return jspFileName;
	}

	@RequestMapping(value = { "/level_income" }, method = RequestMethod.GET)
	public String levelincome(ModelMap model) {
		return getListOfIncome(model, LedgerOptions.ALL_LEVEL_INCOME.getLedgerOptions(), "listOfLevelBasedIncome",
				"level_income");
	}

	@ModelAttribute
	public void addModelAttr(ModelMap model) {

		User userObjOfLoggedInUser = userService.getLoggedInUser();
		if (userObjOfLoggedInUser != null) {
			model.addAttribute("loggedinuser", userObjOfLoggedInUser.getUsername());

			User user = new User();
			user.setSponser_id(userObjOfLoggedInUser.getId());
			user.setSponser_name(userObjOfLoggedInUser.getFirstName());
			model.addAttribute(user);
		}
	}

	public void addModelAttrForEditProfile(ModelMap model) {

		User userObjOfLoggedInUser = userService.getLoggedInUser();
		model.addAttribute("loggedinuser", userObjOfLoggedInUser.getUsername());
		model.addAttribute(userObjOfLoggedInUser);
	}

	@RequestMapping(value = { "/Member_chain" }, method = RequestMethod.GET)
	public String Memberchain(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "Member_chain";
	}

	@RequestMapping(value = { "/register" }, method = RequestMethod.GET)
	public String registerNewUser(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "register";
	}

	@RequestMapping(value = { "/withdraw_balance" }, method = RequestMethod.GET)
	public String withdrawbalance(ModelMap model) {
		Double totalCredit = 0.0;
		Double totalDebit = 0.0;

		addModelAttr(model);
		User loggedInUser = userService.getLoggedInUser();
		List<Ledger> listOfWithdrawlBalance = ledgerService.findAllTransactionsByMemberId(loggedInUser.getId());

		for (Ledger ledger : listOfWithdrawlBalance) {
			totalCredit += ledger.getCredit();
			totalDebit += ledger.getDebit();
		}
		addModelAttrForEditProfile(model);
		model.addAttribute("listOfWithdrawlBalance", listOfWithdrawlBalance);
		Double balanceToWithdrawl = totalCredit - totalDebit;
		model.addAttribute("balanceToWithdrawl", balanceToWithdrawl);
		return "withdraw_balance";
	}

	@RequestMapping(value = { "/withdraw_history" }, method = RequestMethod.GET)
	public String withdrawhistory(ModelMap model) {
		return getListOfIncome(model, LedgerOptions.WITHDRAWL.getLedgerOptions(), "listOfWithdrawlAmount",
				"withdraw_history");
	}
}