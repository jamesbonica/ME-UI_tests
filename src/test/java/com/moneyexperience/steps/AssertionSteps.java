package com.moneyexperience.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import static org.hamcrest.MatcherAssert.assertThat; 
import  static org.hamcrest.Matchers.is;

import com.moneyexperience.pageObject.TopMenuPage;

import config.ScenarioSession;
import cucumber.api.java.en.Then;

@Scope("cucumber-glue")
public class AssertionSteps {

	@Autowired
	ScenarioSession scenarioSession;
	
	@Autowired
	TopMenuPage topMenuPage;

	@Then("ME must display the username {string} in the top menu")
	public void me_must_display_the_username_in_the_top_menu(String expectedUsername) {
		assertThat(topMenuPage.getUsernameText(), is(expectedUsername));
		scenarioSession.takeScreenShot();
	}

}
