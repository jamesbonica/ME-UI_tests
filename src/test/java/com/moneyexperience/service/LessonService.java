package com.moneyexperience.service;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import com.moneyexperience.pageObject.AssessmentPage;
import com.moneyexperience.pageObject.ChatPage;
import com.moneyexperience.pageObject.ConfirmPrioritiesPage;
import com.moneyexperience.pageObject.DashboardPage;
import com.moneyexperience.pageObject.LessonCheckpointPage;
import com.moneyexperience.pageObject.LessonIntroPage;
import com.moneyexperience.pageObject.SetPrioritiesPage;
import com.moneyexperience.pageObject.SimulatorConclusionPage;
import com.moneyexperience.pageObject.StoryBoardPage;

import config.PropertiesLoader;

/**
 * 
 * @author jimbonica
 *
 * @date Apr-24-2019
 */

@Service
@Scope(SCOPE_CUCUMBER_GLUE)
public class LessonService {

	@Autowired
	LessonIntroPage lessonIntroPage;

	@Autowired
	SetPrioritiesPage setPrioritiesPage;

	@Autowired
	ConfirmPrioritiesPage confirmPrioritiesPage;

	@Autowired
	StoryBoardPage storyBoardPage;

	@Autowired
	ChatPage chatPage;

	@Autowired
	DashboardPage dashboardPage;

	@Autowired
	LessonCheckpointPage lessonCheckpointPage;

	@Autowired
	AssessmentPage assessmentPage;
	
	@Autowired
	SimulatorConclusionPage simulatorConclusionPage;

	@Autowired
	PropertiesLoader propertiesLoader;

	public void clickBeginButton() {
		lessonIntroPage.clickBeginButton();

	}

	public void setPriorities(List<String> prioritiesList) {
		setPrioritiesPage.dismissTessInstructions().clickContinueButton();
		;
		// setPrioritiesPage.dragAndDropPriorities(prioritiesList);

	}

	public void clickSendButton() {
		chatPage.clickSendButton();

	}

	public void confirmPriorities() {
		confirmPrioritiesPage.dismissTessInstructions().clickNextButton();
	}

	public void clickNextLink(int timesToClick) {
		// We must add logic to ensure the click happens with the right timing
		for (int i = 1; i <= timesToClick; i++) {
			String tessDialog = storyBoardPage.getTessSpeechBubble();
			if (i != 1) {
				storyBoardPage.waitForTessDialogToUpdate(tessDialog);
			}
			storyBoardPage.clickNextLink();
		}

	}

	public void goThroughStoryBoards() {

		do {
			storyBoardPage.clicknextLinkForStoryPanels();
		} while (storyBoardPage.moveOnToNextStoryBoard());
	}

	public void clickGotoChatWithTess() {
		storyBoardPage.clickGoToChatWithTess();

	}

	public void clickContinueOnONDashboard() {
		if (dashboardPage.imReadyButtonPresent()) {
			dashboardPage.dismissImReadyButton();
		}
		dashboardPage.clickContinueButton();

	}

	public void clickContinueOnLessonCheckpointPage() {
		lessonCheckpointPage.clickContinue().waitForBeginButton();

	}

	public void chooseOptionalNarrative(String optionalNarrativeChoice) {
		optionalNarrativeChoice = optionalNarrativeChoice.toLowerCase();

		if (optionalNarrativeChoice.contains("credit")) {
			dashboardPage.clickCreditCardIcon();
		} else if (optionalNarrativeChoice.contains("career")) {
			dashboardPage.clickChangeCareerIcon();
		} else if (optionalNarrativeChoice.contains("car")) {
			dashboardPage.clickBuyACarIcon();
		} else if (optionalNarrativeChoice.contains("dating")) {
			dashboardPage.clickDatingIcon();
		} else if (optionalNarrativeChoice.contains("married")) {
			dashboardPage.clickMarriageIcon();
		} else if (optionalNarrativeChoice.contains("child")) {
			dashboardPage.clickHaveAChildIcon();
		} else if (optionalNarrativeChoice.contains("trip")) {
			dashboardPage.clickTakeATripIcon();
		} else if (optionalNarrativeChoice.contains("401k")) {
			dashboardPage.clickFour01kIcon();
		} else if (optionalNarrativeChoice.contains("529")) {
			dashboardPage.clickFive29Icon();
		} else if (optionalNarrativeChoice.contains("residence")) {
			dashboardPage.clickChangeResidenceIconIcon();
		} else if (optionalNarrativeChoice.contains("investment")) {
			dashboardPage.clickInvestmentIcon();
		} else {
			throw new NoSuchElementException("There is not a choice matching what is in the step");
		}

	}

	public Boolean onAssessmentPage() {
		Boolean onAssessmentPage = false;
		int counter = 0;
		while (counter < 10) {
			if (storyBoardPage.beyondSurvey()) {
				break;
			}
			if (assessmentPage.disabledNextButtonPresent()) {
				onAssessmentPage = true;
				break;
			}
			setPrioritiesPage.pause(.5);
			counter++;
		}

		return onAssessmentPage;
	}

	public void clickContinueOnTheSimulatorConclusionPage() {
		simulatorConclusionPage.clickContinueButton();

	}

}
