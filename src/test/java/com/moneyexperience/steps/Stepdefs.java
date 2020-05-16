package com.moneyexperience.steps;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.moneyexperience.service.LessonService;
import com.moneyexperience.service.ResponseService;
import com.moneyexperience.service.UserService;

import config.ScenarioSession;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

/**
 * 
 * @author jimbonica
 *
 * @date Apr-10-2019
 */

@Scope(SCOPE_CUCUMBER_GLUE)
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
		scenarioSession.takeScreenShot("priorities_set");

	}

	@Given("a user confirms the priorities")
	public void a_user_confirms_those_priorities() {
		lessonService.confirmPriorities();
	}

	@Given("a user clicks the Send Button")
	public void a_user_clicks_the_Send_Button() {
		lessonService.clickSendButton();
	}

	@Given("a user clicks Next")
	public void a_user_clicks_the_Next_Link() {
		lessonService.clickNextLink(1);
	}

	@Given("a user clicks Next {int} times")
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

	@Given("a user clicks Continue on the Optional Narratives Dashboard")
	@Given("a user clicks the Next Button on the Optional Narratives Dashboard")
	public void a_user_clicks_the_Next_Button_on_the_Optional_Narratives_Dashboard() {
		lessonService.clickContinueOnONDashboard();
	}

	@Given("a user clicks Continue on the Lesson Checkpoint Page")
	public void a_user_clicks_the_Finish_Lesson_on_the_Lessson_Checkpoint_Page() {
		lessonService.clickContinueOnLessonCheckpointPage();
	}

	@Given("a user clicks Continue on the Simulator Conclusion Page")
	public void a_user_clicks_Continue_on_the_Simulator_Conclusion_Page() {
		lessonService.clickContinueOnTheSimulatorConclusionPage();
	}

	////////////////////////////////////////////

	////// response steps //////////////////////////

	@Given("the user chooses the following responses in the Optional Narrative Chat with Tess:")
	@Given("a user chooses the following responses in the Chat with Tess:")
	public void a_user_chooses_the_following_responses_in_the_Chat_with_Tess(DataTable responses) {
		List<Map<String, String>> list = responses.asMaps(String.class, String.class);
		for (int i = 0; i < list.size(); i++) {
			String choiceType = list.get(i).get("choiceType");
			String choice = list.get(i).get("choice");
			String navigationDirection = list.get(i).get("navigationDirection");

			responseService.enterUserResponse(choiceType, choice, navigationDirection);

		}
	}

	@Given("a user selects the {string} Optional Narrative in the {string} Inventory on the Dashboard")
	public void a_user_selects_the_Optional_Narrative_in_the_Inventory_on_the_Dashboard(String optionalNarrative,
			String inventoryIcon) {
		lessonService.chooseInventoryThenOptionalNarrative(optionalNarrative, inventoryIcon);
	}
	
	@Given("a user selects the {string} Inventory on the Dashboard")
	public void a_user_selects_the_Inventory_on_the_Dashboard(String inventoryIcon) {
		lessonService.clickInventoryIcon(inventoryIcon.toLowerCase());
	}

	@Given("the user chooses the following responses in the Optional Narrative:")
	public void the_user_choses_the_following_responses_in_the_Optional_Narrative(DataTable responses) {
		a_user_chooses_the_following_responses_in_the_Chat_with_Tess(responses);
	}

	@Given("a user completes the Baseline Assessment if the user has not completed it before")
	public void a_user_completes_the_Baseline_Assessment_if_the_user_has_not_completed_it_before() {
		responseService.answerAssessmentQuestions("baseline", 5);
	}

	@Given("a user answers {int} Post Survey Questions")
	public void a_user_answers_Post_Survey_Questions(Integer questions) {
		int pages = questions / 2;
		responseService.answerAssessmentQuestions("post", pages);
	}

	@Given("a user answers {int} Post Survey Question")
	public void a_user_answers_Post_Survey_Question(Integer questions) {
		responseService.answerAssessmentQuestions("post", questions);
	}

	@Given("a user completes the V2 Baseline Assessment if the user has not completed it before")
	public void a_user_completes_the_V2_Baseline_Assessment_if_the_user_has_not_completed_it_before() {
		responseService.answerV2AssessmentQuestions("baseline");
	}

	@Given("a user completes the V2 Post-Course Assessment")
	public void a_user_completes_the_V2_Post_Course_Assessment() {
		responseService.answerV2AssessmentQuestions("post");
	}

}
