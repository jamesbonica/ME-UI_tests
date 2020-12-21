package com.elsevier.steps;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.test.context.ContextConfiguration;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import com.elsevier.service.AssessmentService;

import config.ScenarioSession;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author jimbonica
 *
 * @date Dec-19-2020
 */

@Scope(SCOPE_CUCUMBER_GLUE)
//@CucumberContextConfiguration
@ContextConfiguration("classpath:cucumber.xml")
public class Stepdefs {

	@Autowired
	ScenarioSession scenarioSession;

	@Autowired
	AssessmentService assessmentService;

	@Given("a User is on the Your Logo Homepage")
	public void a_user_is_on_the_your_logo_homepage() {
		assessmentService.goToToWebApp();

	}

	@When("a User clicks the reduced-price {string} item")
	public void a_user_is_on_the_product_page_for_the(String itemTitle) {
		assessmentService.clicReducedkProduct(itemTitle);
	}

	@When("the User clicks on the Add to Cart Button")
	public void the_user_clicks_on_the_add_to_cart_button() {
		assessmentService.clickAddtoCart();
	}

	@Then("the site must display the message {string}")
	public void the_site_must_display_the_message(String expectedMessage) {
		assertThat(expectedMessage, is(assessmentService.getLeftCartMessage()));
		scenarioSession.takeScreenShot("added_to_cart_message");

	}

	@When("a User clicks on the Sign In link")
	public void a_user_clicks_on_the_sign_in_link() {
		assessmentService.clickSignInLink();

	}

	@Then("the site must take the User to the Login Page")
	public void the_site_must_take_the_user_to_the_login_page() {
		assertThat("Login - My Store", is(assessmentService.getPageTitle()));
		scenarioSession.takeScreenShot("on_login_page");

	}

}
