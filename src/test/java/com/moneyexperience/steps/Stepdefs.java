package com.moneyexperience.steps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.moneyexperience.service.LessonService;
import com.moneyexperience.service.UserService;

import config.ScenarioSession;
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
	ScenarioSession scenarioSession;
	
	@Autowired
	UserService userService;

	@Autowired
	LessonService lessonService;

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

	//// Candidates for a Lesson Steps file?
	@Given("a user clicks the Begin Button at the start of the lesson")
	public void a_user_clicks_the_Begin_Button_at_the_start_of_the_lesson() {
		lessonService.clickBeginButton();
	}

	@Given("a user sets priorities in the following order:")
	public void a_user_sets_priorities_in_the_following_order(List<String> prioritiesList) {

		lessonService.setPriorities(prioritiesList);
		scenarioSession.takeScreenShot();

	}
	////////////////////////////////////////////
}
