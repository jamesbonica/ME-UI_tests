package com.moneyexperience.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.moneyexperience.service.UserService;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author jimbonica
 *
 * @date Apr-10-2019
 */

@Scope("cucumber-glue")
public class Stepdefs {

	@Autowired
	UserService userService;

	//////////////////// Log in, Log out
	/**
	 * 
	 * @param username
	 * @param password
	 */

	@When("a user {string} logs in to ME with password {string}")
	public void a_user_logs_in_to_ME_with_password(String username, String password) {
		userService.loginToWebApp(username, password);
	}

	@Then("the user logs out")
	public void the_user_logs_out() {
		userService.logout();
	}

	/////////////////////////////////////

	@When("a user resets the user progress to Lesson {int}")
	public void a_user_resets_the_user_progress_to_Lesson(Integer lessonNumber) {
		userService.resetUserProgressThroughUI(lessonNumber);
	}

}
