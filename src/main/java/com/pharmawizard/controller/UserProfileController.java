package com.pharmawizard.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.pharmawizard.domain.UserProfile;
import com.pharmawizard.service.UserProfileService;

@RestController
@RequestMapping("/user")
public class UserProfileController {

	Logger logger = Logger.getGlobal();
	private final UserProfileService userProfileService;
	private final String REDIRECT = "redirect:/";

	@Autowired
	public UserProfileController(UserProfileService userProfileService) {
		this.userProfileService = userProfileService;

	}

	@RequestMapping(value = { "/createUser" }, method = RequestMethod.POST)
	public String createUser(UserProfile user) {
		try {
			userProfileService.createUser(user);

		} catch (DataAccessException e) {
			logger.info("Error");
		}
		return REDIRECT;
	}

	@RequestMapping(value = { "/getUserModel" }, method = RequestMethod.GET)
	public UserProfile getUserModel() {
		return new UserProfile();
	}

	@RequestMapping(value = { "/getUserById/{idUser}" }, method = RequestMethod.GET)
	public UserProfile getUserById(@PathVariable("idUser") Long idUser) {
		return userProfileService.getUserById(idUser);
	}

	@RequestMapping(value = { "/getUserByUsername/{username}" }, method = RequestMethod.GET)
	public UserProfile getUserByUsername(@PathVariable("username") String username) {
		return userProfileService.getUserByUsername(username);
	}

	@RequestMapping(value = { "/getUserByEmail/{email:.+}" }, method = RequestMethod.GET)
	public UserProfile getUserByEmail(@PathVariable("email") String email) {
		return userProfileService.getUserByEmail(email);
	}

	@RequestMapping(value = { "/deleteUser/{idUser}" }, method = RequestMethod.GET)
	public String deleteUser(@PathVariable Long idUser) {
		try {
			userProfileService.deleteUser(idUser);

		} catch (DataAccessException e) {
			logger.info("Error");

		}
		return REDIRECT;
	}

	@RequestMapping(value = { "/getAllUsers" }, method = RequestMethod.GET)
	public List<UserProfile> getAllUsers() {
		return userProfileService.getAllUsers();
	}

}
