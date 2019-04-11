package com.moneyexperience.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.moneyexperience.service.LoginService;

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
	LoginService loginService;

	@When("a user {string} logs in to ME with password {string}")
	public void a_user_logs_in_to_ME_with_password(String username, String password) {
		loginService.loginToWebApp(username, password);
	}

	@Then("the user logs out")
	public void the_user_logs_out() {
		loginService.logout();
	}

}
