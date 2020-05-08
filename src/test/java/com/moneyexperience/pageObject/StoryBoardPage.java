package com.moneyexperience.pageObject;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import config.ScenarioSession;

/**
 * 
 * @author jimbonica
 *
 * @date May-01-2019
 */

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class StoryBoardPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	ScenarioSession scenarioSession;

	@Autowired
	ChatPage chatPage;

	@FindAll(@FindBy(css = "button[data-testid*='Next']"))
	private List<WebElement> navigationLinkList;

	@FindBy(css = "button[data-testid ='Next']")
	private WebElement nextLink;

	@FindBy(css = "nav > button[class*='styles__textButton']:nth-child(1)")
	private WebElement previousOrBackLink;

	@FindBy(css = "nav > button[class*='styles__textButton']:nth-child(2)")
	private WebElement nextLinkWhenThereIsABackOrPreviousLink;

	@FindBy(css = "*[data-testid='speech-bubble']")
	private WebElement tessSpeechBubble;

	@FindBy(css = "button[data-testid='next-button']")
	private WebElement nextLinkForStoryPanels;

	@FindAll(@FindBy(css = "figure + nav > button[class^='styles__textButton']"))
	private List<WebElement> navLinksForStoryPanelsList;

	@FindAll(@FindBy(css = "div[id = 'react-aria-modal-dialog']"))
	private List<WebElement> newMessageFromTessModalList;

	@FindBy(css = "button[data-testid = 'action-button-0']")
	private WebElement goButtonOnChatWithTessModal;

	@FindBy(css = "img[data-testid = 'story-img']")
	private WebElement storyBoardImage;

	@FindAll(@FindBy(css = "img[data-testid = 'story-img']"))
	private List<WebElement> storyBoardImageList;

	public StoryBoardPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean beyondSurvey() {
		return storyBoardImageList.size() > 0;
	}

	public StoryBoardPage clickNextLink() {
		waitForElement(nextLink);

		nextLink.click();

		return this;
	}

	public String getTessSpeechBubble() {

		try {
			waitForElement(tessSpeechBubble);
			return tessSpeechBubble.getText().trim();
		} catch (StaleElementReferenceException s) {
			waitForElement(tessSpeechBubble);
			return tessSpeechBubble.getText().trim();
		}
	}

	public void waitForTessDialogToUpdate(String currentText) {
		int counter = 1;

		while (counter < 10) {
			if (!tessSpeechBubble.getText().trim().equals(currentText)) {
				break;
			} else {
				pause(.25);
				counter++;
			}
		}

	}

	public StoryBoardPage clicknextLinkForStoryPanels() {
		waitForElement(nextLinkForStoryPanels);
		// set the scr value first
		scenarioSession.setStoryBoardSrc(storyBoardImage.getAttribute("src"));

		try {
			nextLinkForStoryPanels.click();
		} catch (ElementClickInterceptedException e) {
			nextLinkForStoryPanels.click();
		}
		return this;
	}

	/*
	 * This method checks if a loader element is present first which would indicate
	 * the storyBoards are done and the simulator is going to a Chat or the ON
	 * Dashboard. If that isn't present then it will check every .25 seconds for a
	 * total of 2.5 seconds to see if the src attribute has changed which means a
	 * new storyboard has loaded and the user should click Next again or if the Chat
	 * with Tess modal has appeared which stops the user from trying to click on the
	 * Next link -- jb
	 */

	public boolean moveOnToNextStoryBoard() {
		boolean clickNext = false;

		int counter = 0;

		while (counter < 10) {
			String newSrc = "";

			if (newMessageFromTessModalList.size() > 0) {
				System.out.println("Tess interrupts!!!");
				break;
			} else if (notOnStoryBoardPage()) {
				break;
			}

			newSrc = storyBoardImage.getAttribute("src");

			String oldSrc = scenarioSession.getStoryBoardSrc();

			if (!newSrc.equals(oldSrc)) {
				scenarioSession.setStoryBoardSrc(newSrc);
				// System.out.println("SRC changes");
				clickNext = true;
				break;
			}

			pause(.25);
			counter++;
		}

		// System.out.println("clicknext = " + clickNext);
		return clickNext;
	}

	public void clickGoToChatWithTess() {
		waitForElement(goButtonOnChatWithTessModal);
		try {
			goButtonOnChatWithTessModal.click();
		} catch (ElementClickInterceptedException e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", goButtonOnChatWithTessModal);

		}
	}

	public boolean storyBoardLinkPresent() {
		return navLinksForStoryPanelsList.size() > 0;
	}

	public boolean loaderPresent() {
		return driver.findElements(By.cssSelector("div[class*='loader']")).size() > 0;
	}

}
