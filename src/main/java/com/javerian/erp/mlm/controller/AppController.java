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
import com.javerian.erp.mlm.service.auth.UserProfileService;
import com.javerian.erp.mlm.service.auth.UserService;

@Controller
@RequestMapping("/")
@SessionAttributes("roles")
public class AppController {

	@Autowired
	UserService userService;

	@Autowired
	UserProfileService userProfileService;

	@Autowired
	MessageSource messageSource;

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

		return "mlmHome";
	}

	/**
	 * This method will provide the medium to add a new user.
	 */
	/*
	 * @RequestMapping(value = { "/list" }, method = RequestMethod.GET) public
	 * String listUsers(ModelMap model) { List<User> users =
	 * userService.findAllUsers(); model.addAttribute("users", users);
	 * model.addAttribute("loggedinuser",
	 * authenticationTrustResolver.getPrincipal()); return "userslist"; }
	 */

	/**
	 * This method will provide the medium to add a new user.
	 */
	/*
	 * @RequestMapping(value = { "/newuser" }, method = RequestMethod.GET) public
	 * String newUser(ModelMap model) { User user = new User();
	 * model.addAttribute("user", user); model.addAttribute("edit", false);
	 * model.addAttribute("loggedinuser",
	 * authenticationTrustResolver.getPrincipal()); return "registration"; }
	 */
	/**
	 * This method will be called on form submission, handling POST request for
	 * saving user in database. It also validates the user input
	 */
	/*
	 * @RequestMapping(value = { "/newuser" }, method = RequestMethod.POST) public
	 * String saveUser(@Valid User user, BindingResult result, ModelMap model) {
	 * 
	 * if (result.hasErrors()) { return "registration"; }
	 * 
	 * 
	 * Preferred way to achieve uniqueness of field [sso] should be implementing
	 * custom @Unique annotation and applying it on field [sso] of Model class
	 * [User].
	 * 
	 * Below mentioned peace of code [if block] is to demonstrate that you can fill
	 * custom errors outside the validation framework as well while still using
	 * internationalized messages.
	 * 
	 * 
	 * if (!userService.isUserSSOUnique(user.getId(), user.getUsername())) {
	 * FieldError ssoError = new FieldError("user", "username",
	 * messageSource.getMessage("non.unique.username", new String[] {
	 * user.getUsername() }, Locale.getDefault())); result.addError(ssoError);
	 * return "registration"; }
	 * 
	 * userService.saveUser(user);
	 * 
	 * model.addAttribute("success", "User " + user.getFirstName() + " " +
	 * user.getLastName() + " registered successfully");
	 * model.addAttribute("loggedinuser",
	 * authenticationTrustResolver.getPrincipal()); // return "success"; return
	 * "registrationsuccess"; }
	 */

	/**
	 * This method will provide the medium to update an existing user.
	 */
	/*
	 * @RequestMapping(value = { "/edit-user-{username}" }, method =
	 * RequestMethod.GET) public String editUser(@PathVariable String username,
	 * ModelMap model) { User user = userService.findBySSO(username);
	 * model.addAttribute("user", user); model.addAttribute("edit", true);
	 * model.addAttribute("loggedinuser",
	 * authenticationTrustResolver.getPrincipal()); return "registration"; }
	 */

	/**
	 * This method will be called on form submission, handling POST request for
	 * updating user in database. It also validates the user input
	 */
	/*
	 * @RequestMapping(value = { "/edit-user-{username}" }, method =
	 * RequestMethod.POST) public String updateUser(@Valid User user, BindingResult
	 * result, ModelMap model, @PathVariable String username) {
	 * 
	 * if (result.hasErrors()) { return "registration"; }
	 * 
	 * 
	 * //Uncomment below 'if block' if you WANT TO ALLOW UPDATING SSO_ID in UI which
	 * is a unique key to a User. if(!userService.isUserSSOUnique(user.getId(),
	 * user.getusername())){ FieldError ssoError =new
	 * FieldError("user","username",messageSource.getMessage("non.unique.username",
	 * new String[]{user.getusername()}, Locale.getDefault()));
	 * result.addError(ssoError); return "registration"; }
	 * 
	 * 
	 * userService.updateUser(user);
	 * 
	 * model.addAttribute("success", "User " + user.getFirstName() + " " +
	 * user.getLastName() + " updated successfully");
	 * model.addAttribute("loggedinuser",
	 * authenticationTrustResolver.getPrincipal()); return "registrationsuccess"; }
	 */
	/**
	 * This method will delete an user by it's username value.
	 */
	/*
	 * @RequestMapping(value = { "/delete-user-{username}" }, method =
	 * RequestMethod.GET) public String deleteUser(@PathVariable String username) {
	 * userService.deleteUserBySSO(username); return "redirect:/erphomepage"; }
	 */

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

	/**
	 * This method will provide the medium to add a new user.
	 */

	@RequestMapping(value = { "/edit_profile" }, method = RequestMethod.GET)
	public String editprofile(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "edit_profile";
	}

	@RequestMapping(value = { "/change_password" }, method = RequestMethod.GET)
	public String changepassword(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "change_password";
	}

	@RequestMapping(value = { "/payout" }, method = RequestMethod.GET)
	public String payout(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "payout";
	}

	@RequestMapping(value = { "/downline_members" }, method = RequestMethod.GET)
	public String downlinemembers(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "downline_members";
	}

	@RequestMapping(value = { "/direct_members" }, method = RequestMethod.GET)
	public String directmembers(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "direct_members";
	}

	@RequestMapping(value = { "/review_project" }, method = RequestMethod.GET)
	public String reviewproject(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "review_project";
	}

	@RequestMapping(value = { "/upload_project" }, method = RequestMethod.GET)
	public String uploadproject(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "upload_project";
	}

	@RequestMapping(value = { "/create_ticket" }, method = RequestMethod.GET)
	public String createticket(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "create_ticket";
	}

	@RequestMapping(value = { "/register" }, method = RequestMethod.GET)
	public String registerNewUser(ModelMap model) {
		model.addAttribute("loggedinuser", authenticationTrustResolver.getPrincipal());
		return "register";
	}

	/*
	 * @RequestMapping(value = { "/account_history" }, method = RequestMethod.GET)
	 * public String accountHistory(ModelMap model) {
	 * model.addAttribute("loggedinuser",
	 * authenticationTrustResolver.getPrincipal()); return "account_history"; }
	 * 
	 * @RequestMapping(value = { "/bank_details" }, method = RequestMethod.GET)
	 * public String bankDetails(ModelMap model) {
	 * model.addAttribute("loggedinuser",
	 * authenticationTrustResolver.getPrincipal()); return "bank_details"; }
	 */

	// bank_details.jsp
	// block_payout_achivers.jsp
	// block_reward_achivers.jsp
	// deleted_joining_kits.jsp
	// direct_ids.jsp
	// edit_pass.jsp
	// edit_profile.jsp
	// epin.jsp
	// epin_generator.jsp
	// epin_generator_2.jsp
	// epin_received_history.jsp
	// epin_sale.jsp
	// epin_status.jsp
	// epin_transaction.jsp
	// epin_transfer.jsp
	// epin_transfer_history.jsp
	// e_pin_listdelete.jsp
	// fund_transfer_report.jsp
	// header.jsp
	// index.jsp
	// joining_product.jsp
	// kyc_update.jsp
	// level_income.jsp
	// level_income1.jsp
	// login.jsp
	// member_pannel.jsp
	// member_password.jsp
	// member_view.jsp
	// mlmHome.jsp
	// my_direct.jsp
	// my_level.jsp
	// my_team.jsp
	// new_joining.jsp
	// payout_report.jsp
	// payout_summary.jsp
	// process_payout.jsp
	// register.jsp
	// registrationsuccess.jsp
	// reports.jsp
	// top_up_id.jsp
	// transaction_password.jsp
	// treeview.jsp
	// upgrade.jsp
	// view_distributer.jsp
	// view_downline.jsp
	// view_receipt_report.jsp
	// welcome_report.jsp
	// withdraw_balance.jsp
	// withdraw_report.jsp

}