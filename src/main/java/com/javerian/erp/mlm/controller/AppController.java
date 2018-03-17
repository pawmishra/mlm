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
	@RequestMapping(value = { "/register" }, method = RequestMethod.GET)
	public String registerNewUser(ModelMap model) {
		return "register";
	}

}