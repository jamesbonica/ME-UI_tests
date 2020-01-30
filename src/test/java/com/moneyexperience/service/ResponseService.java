package com.moneyexperience.service;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import com.moneyexperience.pageObject.AssessmentPage;
import com.moneyexperience.pageObject.ChatPage;

import config.PropertiesLoader;
import config.ScenarioSession;
import config.SurveyQuestionAndResponse;

/**
 * 
 * @author jimbonica
 *
 * @date May-01-2019
 */

@Service
@Scope(SCOPE_CUCUMBER_GLUE)
public class ResponseService {

	@Autowired
	ChatPage chatPage;;

	@Autowired
	LessonService lessonService;

	@Autowired
	AssessmentPage assessmentPage;

	@Autowired
	PropertiesLoader propertiesLoader;
	
	@Autowired
	ScenarioSession scenarioSession;

	public void enterUserResponse(String carouselOrSlider, String choice, String navigationDirection) {
		// System.out.println("============= carouselOrSlider is " + carouselOrSlider +
		// " choice is " + choice + " navigationDirection is " + navigationDirection);
		if (carouselOrSlider.equalsIgnoreCase("text carousel")) {
			chatPage.selectOptionInTextCarousel(choice, navigationDirection).clickSendButton();
		} else if (carouselOrSlider.equalsIgnoreCase("image carousel")) {
			chatPage.selectOptionInImageCarousel(choice, navigationDirection);
		} else if (carouselOrSlider.equalsIgnoreCase("slider")) {
			chatPage.selectSlider(choice).clickSendButton();
		} else if (carouselOrSlider.equalsIgnoreCase("dating app")) {
			chatPage.selectDatingOption(choice, navigationDirection);
		} else if (carouselOrSlider.equals("")) {
			chatPage.selectOption(choice).clickSendButton();
		}

	}

	public void answerAssessmentQuestions(String preOrPost, int pages) {

		int maxPageCount = pages;
		int counter = 1;
		// This is here to make sure we run it at least once for a Post Survey coming
		// after a storyboard
		if (preOrPost.equalsIgnoreCase("post")) {
			fillOutAssessment(preOrPost);
			counter++;
		}

		while (lessonService.onAssessmentPage() == true && counter <= maxPageCount) {
			fillOutAssessment(preOrPost);
			counter++;
		}

	}

	private void fillOutAssessment(String preOrPost) {
		// Get list of questions, responses
		List<SurveyQuestionAndResponse> surveyList = createSurveyQuestionAndAnswerList();

		// determine how many questions there are
		int questionsOnPage = assessmentPage.countQuestionsOnPage();
		
		int counter = 0;

		// Use a loop to go through and answer each question
		while (counter < questionsOnPage) {
			// Get text of the question
			String question = assessmentPage.getQuestionText(counter + 1);

			String userAnswer = "";

			// Run through all questions in List to get the appropriate answer
			for (SurveyQuestionAndResponse storedQuestionsAndResponse : surveyList) {

				if (question.equals(storedQuestionsAndResponse.getSurveyQuestion())) {
					if (preOrPost.equalsIgnoreCase("baseline")) {
						userAnswer = storedQuestionsAndResponse.getBaselineAnswer();
					} else {
						userAnswer = storedQuestionsAndResponse.getPostAnswer();
					}
					break;
				}
			}

			// Get a list of webelements for the answers for a question
			List<WebElement> answerList = assessmentPage.getAnswerElements(counter + 1);

			// match
			for (WebElement element : answerList) {

				if (element.getText().equals(userAnswer)) {
					element.click();
				}

			}
			scenarioSession.writeToReport("Survey Question: " + question);
			scenarioSession.writeToReport("User's Answer: " + userAnswer);
			counter++;
		}

		// When loop is completed click Next Button
		assessmentPage.clickNextButton();

	}

	public List<SurveyQuestionAndResponse> createSurveyQuestionAndAnswerList() {
		ArrayList<SurveyQuestionAndResponse> surveyList = new ArrayList<SurveyQuestionAndResponse>();

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion1(),
				propertiesLoader.getPreSurveyAnswer1(), propertiesLoader.getPostSurveyAnswer1()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion2(),
				propertiesLoader.getPreSurveyAnswer2(), propertiesLoader.getPostSurveyAnswer2()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion3(),
				propertiesLoader.getPreSurveyAnswer3(), propertiesLoader.getPostSurveyAnswer3()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion4(),
				propertiesLoader.getPreSurveyAnswer4(), propertiesLoader.getPostSurveyAnswer4()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion5(),
				propertiesLoader.getPreSurveyAnswer5(), propertiesLoader.getPostSurveyAnswer5()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion6(),
				propertiesLoader.getPreSurveyAnswer6(), propertiesLoader.getPostSurveyAnswer6()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion7(),
				propertiesLoader.getPreSurveyAnswer7(), propertiesLoader.getPostSurveyAnswer7()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion8(),
				propertiesLoader.getPreSurveyAnswer8(), propertiesLoader.getPostSurveyAnswer8()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion9(),
				propertiesLoader.getPreSurveyAnswer9(), propertiesLoader.getPostSurveyAnswer9()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion10(),
				propertiesLoader.getPreSurveyAnswer10(), propertiesLoader.getPostSurveyAnswer10()));

		return surveyList;
	}

}
