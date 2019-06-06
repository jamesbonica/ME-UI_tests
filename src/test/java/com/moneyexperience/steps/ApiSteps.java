package com.moneyexperience.steps;

import org.springframework.context.annotation.Scope;

import cucumber.api.java.en.Given;

/**
 * 
 * @author jimbonica
 *
 * @date Jun-03-2019
 */

@Scope("cucumber-glue")
public class ApiSteps {


	@Given("{string} with password {string} is authenticated in the ME Simulator via API")
	public void a_with_password_is_authenticated_in_the_ME_Simulator_via_API(String username,
			String password) {


	}

}
