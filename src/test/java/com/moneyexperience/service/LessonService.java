package com.moneyexperience.service;

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
import com.moneyexperience.pageObject.ConfirmPrioritiesPage;
import com.moneyexperience.pageObject.DashboardPage;
import com.moneyexperience.pageObject.InventoryPage;
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
	AssessmentV2Page assessmentV2Page;

	@Autowired
	SimulatorConclusionPage simulatorConclusionPage;

	@Autowired
	InventoryPage inventoryPage;

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
		dismissImReadyButtonIfPresent();
		dashboardPage.clickContinueButton();

	}

	public void clickContinueOnLessonCheckpointPage() {
		lessonCheckpointPage.clickContinue().waitForBeginButton();

	}

	public void dismissImReadyButtonIfPresent() {
		if (dashboardPage.imReadyButtonPresent()) {
			dashboardPage.dismissImReadyButton();
		}
	}

	public void chooseInventoryThenOptionalNarrative(String optionalNarrativeChoice, String inventoryIcon) {
		dismissImReadyButtonIfPresent();

		clickInventoryIcon(inventoryIcon.toLowerCase());

		selectOptionalNarrative(optionalNarrativeChoice.toLowerCase());

	}

	private void selectOptionalNarrative(String optionalNarrativeChoice) {
		List<WebElement> oNList = inventoryPage.getEnabledOptionalNarrativeButtons();

		for (WebElement w : oNList) {
			if (w.getText().trim().equalsIgnoreCase(optionalNarrativeChoice)) {
				w.click();
				break;
			}
		}

	}

	public void clickInventoryIcon(String inventoryIcon) {

		dismissImReadyButtonIfPresent();

		if (inventoryIcon.contains("credit")) {
			dashboardPage.clickCreditCardIcon();
		} else if (inventoryIcon.equalsIgnoreCase("career")) {
			dashboardPage.clickChangeCareerIcon();
		} else if (inventoryIcon.equalsIgnoreCase("car")) {
			dashboardPage.clickBuyACarIcon();
		} else if (inventoryIcon.contains("personal")) {
			dashboardPage.clickPersonalLifeIcon();
		} else if (inventoryIcon.contains("family")) {
			dashboardPage.clickFamilyIcon();
		} else if (inventoryIcon.contains("travel")) {
			dashboardPage.clickTakeATripIcon();
		} else if (inventoryIcon.contains("401k")) {
			dashboardPage.clickFour01kIcon();
		} else if (inventoryIcon.contains("residence")) {
			dashboardPage.clickChangeResidenceIconIcon();
		} else if (inventoryIcon.contains("education")) {
			dashboardPage.clickEducationIcon();
		} else if (inventoryIcon.equalsIgnoreCase("invest")) {
			dashboardPage.clickInvestmentIcon();
		} else if (inventoryIcon.contains("investment property")) {
			dashboardPage.clickInverstmentPropertyIcon();
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

	public String inV2SurveyOrBeyondIt() {
		String currentPage = "";
		int counter = 0;
		while (counter < 30) {
			setPrioritiesPage.pause(.5);
			// Begin button is present you're on Survey Cover
			if (assessmentV2Page.meBigLogoPresent()) {
				currentPage = "Survey Cover";
				break;
			}

			if (assessmentV2Page.nextButtonPresent()) {
				currentPage = "Survey Body";
				break;
			}

			if (storyBoardPage.beyondSurvey()) {
				currentPage = "Beyond Survey";
				break;
			}
			

			// This can be any page to use this Pause method
			setPrioritiesPage.pause(.25);
			counter++;
		}

		return currentPage;
	}

	public void clickContinueOnTheSimulatorConclusionPage() {
		simulatorConclusionPage.clickContinueButton();

	}

}
