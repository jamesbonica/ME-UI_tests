package com.moneyexperience.service;

import java.util.List;

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

		while (storyBoardPage.moveOnToNextStoryBoard() == true) {
			storyBoardPage.clicknextLinkForStoryPanels();
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

}
