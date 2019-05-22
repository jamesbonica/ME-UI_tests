package com.moneyexperience.steps;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.moneyexperience.service.LessonService;
import com.moneyexperience.service.ResponseService;
import com.moneyexperience.service.UserService;

import config.ScenarioSession;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

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

	@Autowired
	ResponseService responseService;

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

	@Given("a user clicks the Next Button")
	public void a_user_clicks_the_Next_Button() {
		lessonService.clickNextButton();
	}

	@Given("a user clicks the Send Button")
	public void a_user_clicks_the_Send_Button() {
		lessonService.clickSendButton();
	}

	@Given("a user clicks the Next Link")
	public void a_user_clicks_the_Next_Link() {
		lessonService.clickNextLink(1);
	}

	@Given("a user clicks the Next Link {int} times")
	public void a_user_clicks_the_Next_Link_times(Integer timesToClick) {

		lessonService.clickNextLink(timesToClick);

	}

	@Given("a user goes through the storyboards")
	public void a_user_goes_through_the_storyboard() {
		lessonService.goThroughStoryBoards();
	}

	@Given("A user clicks Go when Tess sends a new message")
	public void a_user_clicks_Go_when_Tess_sends_a_new_message() {
		lessonService.clickGotoChatWithTess();
	}

	@Given("a user clicks the Next Button on the Optional Narratives Dashboard")
	public void a_user_clicks_the_Next_Button_on_the_Optional_Narratives_Dashboard() {
		lessonService.clickTheNextButtonOnTheDashboardPage();
	}

	@Given("a user clicks the Finish Lesson on the Lessson Checkpoint Page")
	public void a_user_clicks_the_Finish_Lesson_on_the_Lessson_Checkpoint_Page() {
		lessonService.clickFinishLessonButton();
	}

	@Given("a user clicks the Continue to Next Lesson Button on the Life Progress Page")
	public void a_user_clicks_the_Continue_to_Next_Lesson_Button_on_the_Life_Progress_Page() {
		lessonService.clickContinueToNextLessonButtonOnLifeProgressPage();
	}

	////////////////////////////////////////////

	////// response steps //////////////////////////

	@Given("a user chooses the following responses in the Chat with Tess:")
	public void a_user_chooses_the_following_responses_in_the_Chat_with_Tess(DataTable responses) {
		List<Map<String, String>> list = responses.asMaps(String.class, String.class);
		for (int i = 0; i < list.size(); i++) {
			String carouselOrSlider = list.get(i).get("carouselOrSlider");
			String choice = list.get(i).get("choice");
			String navigationDirection = list.get(i).get("navigationDirection");

			responseService.enterUserResponse(carouselOrSlider, choice, navigationDirection);

		}
	}

}
