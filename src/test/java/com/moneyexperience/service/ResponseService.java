package com.moneyexperience.service;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import com.moneyexperience.pageObject.AssessmentPage;
import com.moneyexperience.pageObject.AssessmentV2Page;
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
	AssessmentV2Page assessmentV2Page;

	@Autowired
	PropertiesLoader propertiesLoader;

	@Autowired
	ScenarioSession scenarioSession;

	public void enterUserResponse(String choiceType, String choice, String navigationDirection) {

		if (choiceType.equalsIgnoreCase("text stack")) {
			chatPage.selectOptionInTextStack(choice).clickSendButton();
		} else if (choiceType.equalsIgnoreCase("slider")) {
			chatPage.selectSlider(choice).clickNumberSendButton();
		} else if (choiceType.equalsIgnoreCase("phone app")) {
			chatPage.selectPhoneAppOption(choice, navigationDirection);
		} else if (choiceType.equals("image carousel")) {
			chatPage.selectOptionInImageCarousel(choice, navigationDirection).clickSendButton();
		} else if (choiceType.equals("")) {
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
				propertiesLoader.getSurveyQuestion1Type(), propertiesLoader.getPreSurveyAnswer1(),
				propertiesLoader.getPostSurveyAnswer1()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion2(),
				propertiesLoader.getSurveyQuestion2Type(), propertiesLoader.getPreSurveyAnswer2(),
				propertiesLoader.getPostSurveyAnswer2()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion3(),
				propertiesLoader.getSurveyQuestion3Type(), propertiesLoader.getPreSurveyAnswer3(),
				propertiesLoader.getPostSurveyAnswer3()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion4(),
				propertiesLoader.getSurveyQuestion4Type(), propertiesLoader.getPreSurveyAnswer4(),
				propertiesLoader.getPostSurveyAnswer4()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion5(),
				propertiesLoader.getSurveyQuestion5Type(), propertiesLoader.getPreSurveyAnswer5(),
				propertiesLoader.getPostSurveyAnswer5()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion6(),
				propertiesLoader.getSurveyQuestion6Type(), propertiesLoader.getPreSurveyAnswer6(),
				propertiesLoader.getPostSurveyAnswer6()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion7(),
				propertiesLoader.getSurveyQuestion7Type(), propertiesLoader.getPreSurveyAnswer7(),
				propertiesLoader.getPostSurveyAnswer7()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion8(),
				propertiesLoader.getSurveyQuestion8Type(), propertiesLoader.getPreSurveyAnswer8(),
				propertiesLoader.getPostSurveyAnswer8()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion9(),
				propertiesLoader.getSurveyQuestion9Type(), propertiesLoader.getPreSurveyAnswer9(),
				propertiesLoader.getPostSurveyAnswer9()));
		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyQuestion10(),
				propertiesLoader.getSurveyQuestion10Type(), propertiesLoader.getPreSurveyAnswer10(),
				propertiesLoader.getPostSurveyAnswer10()));

		return surveyList;
	}

	public List<SurveyQuestionAndResponse> createV2SurveyQuestionAndAnswerList() {
		ArrayList<SurveyQuestionAndResponse> surveyList = new ArrayList<SurveyQuestionAndResponse>();

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question1(),
				propertiesLoader.getSurveyV2Question1Type(), propertiesLoader.getPreSurveyV2Answer1(),
				propertiesLoader.getPostSurveyV2Answer1()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question2(),
				propertiesLoader.getSurveyV2Question2Type(), propertiesLoader.getPreSurveyV2Answer2(),
				propertiesLoader.getPostSurveyV2Answer2()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question3(),
				propertiesLoader.getSurveyV2Question3Type(), propertiesLoader.getPreSurveyV2Answer3(),
				propertiesLoader.getPostSurveyV2Answer3()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question4(),
				propertiesLoader.getSurveyV2Question4Type(), propertiesLoader.getPreSurveyV2Answer4(),
				propertiesLoader.getPostSurveyV2Answer4()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question5(),
				propertiesLoader.getSurveyV2Question5Type(), propertiesLoader.getPreSurveyV2Answer5(),
				propertiesLoader.getPostSurveyV2Answer5()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question6(),
				propertiesLoader.getSurveyV2Question6Type(), propertiesLoader.getPreSurveyV2Answer6(),
				propertiesLoader.getPostSurveyV2Answer6()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question7(),
				propertiesLoader.getSurveyV2Question7Type(), propertiesLoader.getPreSurveyV2Answer7(),
				propertiesLoader.getPostSurveyV2Answer7()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question8(),
				propertiesLoader.getSurveyV2Question8Type(), propertiesLoader.getPreSurveyV2Answer8(),
				propertiesLoader.getPostSurveyV2Answer8()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question9(),
				propertiesLoader.getSurveyV2Question9Type(), propertiesLoader.getPreSurveyV2Answer9(),
				propertiesLoader.getPostSurveyV2Answer9()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question10(),
				propertiesLoader.getSurveyV2Question10Type(), propertiesLoader.getPreSurveyV2Answer10(),
				propertiesLoader.getPostSurveyV2Answer10()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question11(),
				propertiesLoader.getSurveyV2Question11Type(), propertiesLoader.getPreSurveyV2Answer11(),
				propertiesLoader.getPostSurveyV2Answer11()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question12(),
				propertiesLoader.getSurveyV2Question12Type(), propertiesLoader.getPreSurveyV2Answer12(),
				propertiesLoader.getPostSurveyV2Answer12()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question13(),
				propertiesLoader.getSurveyV2Question13Type(), propertiesLoader.getPreSurveyV2Answer13(),
				propertiesLoader.getPostSurveyV2Answer13()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question14(),
				propertiesLoader.getSurveyV2Question14Type(), propertiesLoader.getPreSurveyV2Answer14(),
				propertiesLoader.getPostSurveyV2Answer14()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question15(),
				propertiesLoader.getSurveyV2Question15Type(), propertiesLoader.getPreSurveyV2Answer15(),
				propertiesLoader.getPostSurveyV2Answer15()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question16(),
				propertiesLoader.getSurveyV2Question16Type(), propertiesLoader.getPreSurveyV2Answer16(),
				propertiesLoader.getPostSurveyV2Answer16()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question17(),
				propertiesLoader.getSurveyV2Question17Type(), propertiesLoader.getPreSurveyV2Answer17(),
				propertiesLoader.getPostSurveyV2Answer17()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question18(),
				propertiesLoader.getSurveyV2Question18Type(), propertiesLoader.getPreSurveyV2Answer18(),
				propertiesLoader.getPostSurveyV2Answer18()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question19(),
				propertiesLoader.getSurveyV2Question19Type(), propertiesLoader.getPreSurveyV2Answer19(),
				propertiesLoader.getPostSurveyV2Answer19()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question20(),
				propertiesLoader.getSurveyV2Question20Type(), propertiesLoader.getPreSurveyV2Answer20(),
				propertiesLoader.getPostSurveyV2Answer20()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question21(),
				propertiesLoader.getSurveyV2Question21Type(), propertiesLoader.getPreSurveyV2Answer21(),
				propertiesLoader.getPostSurveyV2Answer21()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question22(),
				propertiesLoader.getSurveyV2Question22Type(), propertiesLoader.getPreSurveyV2Answer22(),
				propertiesLoader.getPostSurveyV2Answer22()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question23(),
				propertiesLoader.getSurveyV2Question23Type(), propertiesLoader.getPreSurveyV2Answer23(),
				propertiesLoader.getPostSurveyV2Answer23()));

		surveyList.add(new SurveyQuestionAndResponse(propertiesLoader.getSurveyV2Question24(),
				propertiesLoader.getSurveyV2Question24Type(), propertiesLoader.getPreSurveyV2Answer24(),
				propertiesLoader.getPostSurveyV2Answer24()));

		return surveyList;
	}

	public void answerV2AssessmentQuestions(String preOrPost) {

		// Do an initial check to see if the survey stuff is even applicable
		String page = lessonService.inV2SurveyOrBeyondIt();

		if (page.equalsIgnoreCase("beyond survey")) {
			// Do nothing
		} else {
			// Get list of questions, responses
			List<SurveyQuestionAndResponse> surveyList = createV2SurveyQuestionAndAnswerList();

			int escapeHatch = 0;

			while (!page.equalsIgnoreCase("beyond survey")) {
				if (page.equalsIgnoreCase("survey cover")) {
					assessmentV2Page.clickBeginAndContinueButton();
					page = lessonService.inV2SurveyOrBeyondIt();
				} else if (page.equalsIgnoreCase("survey body")) {
					// answer questions

					// get amount of questions on page
					int questions = assessmentV2Page.getAmountOfQuestionsOnPage();

					int counter = 0;

					while (counter < questions) {

						// Answer question
						String question = assessmentV2Page.getQuestionText(counter);

						String userAnswer = "";

						String questionType = "";

						// Run through all questions in List to get the appropriate answer
						for (SurveyQuestionAndResponse storedQuestionsAndResponse : surveyList) {

							if (question.equals(storedQuestionsAndResponse.getSurveyQuestion())) {

								// set question type
								questionType = storedQuestionsAndResponse.getQuestionType();

								if (preOrPost.equalsIgnoreCase("baseline")) {

									userAnswer = storedQuestionsAndResponse.getBaselineAnswer();
								} else {

									userAnswer = storedQuestionsAndResponse.getPostAnswer();
								}
								break;
							}
						}
						// use question type
						if (questionType.startsWith("text")) {

							assessmentV2Page.enterAnswerInTextbox(userAnswer, counter);
						} else {

							// Get a list of webelements for the answers for a question
							List<WebElement> answerList = assessmentV2Page.getAnswerElements(counter);

							// match
							for (WebElement element : answerList) {

								if (element.getText().equals(userAnswer)) {
									element.click();
									break;
								}

							}
						}
						scenarioSession.writeToReport("Survey Question: " + question);
						scenarioSession.writeToReport("User's Answer: " + userAnswer);
						counter++;

					}

					assessmentV2Page.clickNextButton();

				}

				escapeHatch++;
				if (escapeHatch > 10) {
					throw new NoSuchElementException("Something went wrong in the survey!!!");
				}

				page = lessonService.inV2SurveyOrBeyondIt();
				// System.out.println("page at end of loop is " + page);

			}

		}

	}

}
