package com.moneyexperience.service;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.moneyexperience.pageObject.ChatPage;
import com.moneyexperience.pageObject.DashboardPage;
import com.moneyexperience.pageObject.LessonCheckpointPage;
import com.moneyexperience.pageObject.LessonIntroPage;
import com.moneyexperience.pageObject.LifeProgressPage;
import com.moneyexperience.pageObject.SetPrioritiesPage;
import com.moneyexperience.pageObject.StoryBoardPage;

/**
 * 
 * @author jimbonica
 *
 * @date Apr-24-2019
 */

@Service
@Scope("cucumber-glue")
public class LessonService {

	@Autowired
	LessonIntroPage lessonIntroPage;

	@Autowired
	SetPrioritiesPage setPrioritiesPage;

	@Autowired
	StoryBoardPage storyBoardPage;

	@Autowired
	ChatPage chatPage;

	@Autowired
	DashboardPage dashboardPage;

	@Autowired
	LessonCheckpointPage lessonCheckpointPage;

	@Autowired
	LifeProgressPage lifeProgressPage;

	public void clickBeginButton() {
		lessonIntroPage.clickBeginButton();

	}

	public void setPriorities(List<String> prioritiesList) {
		setPrioritiesPage.dragAndDropPriorities(prioritiesList);

	}

	public void clickNextButton() {
		setPrioritiesPage.clickNextButton();

	}

	public void clickSendButton() {
		chatPage.clickSendButton();

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

//		while (storyBoardPage.moveOnToNextStoryBoard() == true) {
//			storyBoardPage.clicknextLinkForStoryPanels();
//		}

		while (true) {
			if (storyBoardPage.moveOnToNextStoryBoard()) {
				storyBoardPage.clicknextLinkForStoryPanels();
			} else {
				break;
			}
		}
	}

	public void clickGotoChatWithTess() {
		storyBoardPage.clickGoToChatWithTess();

	}

	public void clickTheNextButtonOnTheDashboardPage() {
		dashboardPage.clickNextButton();

	}

	public void clickFinishLessonButton() {
		lessonCheckpointPage.clicFinishLessonButton();

	}

	public void clickContinueToNextLessonButtonOnLifeProgressPage() {
		lifeProgressPage.clicFinishLessonButton();

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

}
