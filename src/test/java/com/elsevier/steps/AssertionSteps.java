package com.elsevier.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import com.moneyexperience.pageObject.UserMenuPage;

import config.ScenarioSession;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;
import io.cucumber.java.en.Then;

@Scope(SCOPE_CUCUMBER_GLUE)
public class AssertionSteps {

	@Autowired
	ScenarioSession scenarioSession;

}
