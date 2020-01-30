package com.moneyexperience.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.moneyexperience.service.ApiService;

import config.ScenarioSession;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.cucumber.java.en.Given;


/**
 * 
 * @author jimbonica
 *
 * @date Jun-03-2019
 */

@Scope(SCOPE_CUCUMBER_GLUE)
public class ApiSteps {

	@Autowired
	ApiService apiService;
	
	@Autowired
	ScenarioSession scenarioSession;

	@Given("user {string} with password {string} resets the user progress to Lesson {int}")
	public void with_password_resets_the_user_progress_to_Lesson(String username, String password,
			Integer lessonNumber) {

		ResponseOptions<Response> response = apiService.resetUserProgressApi(username, password, lessonNumber);
		
		
		scenarioSession.writeToReport("The Server Response is: " + response.getStatusCode());

	}

}
