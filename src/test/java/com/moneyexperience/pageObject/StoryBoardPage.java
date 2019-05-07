package com.moneyexperience.pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import config.ScenarioSession;

/**
 * 
 * @author jimbonica
 *
 * @date May-01-2019
 */

@Component
public class StoryBoardPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	ScenarioSession scenarioSession;

	@FindAll(@FindBy(css = "nav:not([class]) > button"))
	private List<WebElement> navigationLinkList;

	@FindBy(css = "nav:not([class]) > button")
	private WebElement nextLinkWhenTheresNoGoingBack;

	@FindBy(css = "nav:not([class]) > button:nth-child(1)")
	private WebElement previousOrBackLink;

	@FindBy(css = "nav:not([class]) > button:nth-child(2)")
	private WebElement nextLinkWhenThereIsABackOrPreviousLink;

	@FindBy(css = "*[class*='speechBubble']")
	private WebElement tessSpeechBubble;

	@FindBy(css = "nav[class] > button:nth-child(2)")
	private WebElement nextLinkForStoryPanels;

	@FindAll(@FindBy(css = "nav[class] > button"))
	private List<WebElement> navLinksForStoryPanelsList;

	@FindAll(@FindBy(css = "div[class*='modal']"))
	private List<WebElement> newMessageFromTessModalList;

	@FindBy(css = "div[class*='modal'] > button[class*='primaryButton']")
	private WebElement goButtonOnChatWithTessModal;

	@FindBy(css = "div[class*='storyboard'] > figure > img")
	private WebElement storyBoardImage;

	public StoryBoardPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public StoryBoardPage clickNextLink() {
		waitForElement(htmlColorDefinedElement);
		waitForElement(nextLinkWhenTheresNoGoingBack);
		// check if there is two-way or one-way navigation on the page
		int navigationLinks = navigationLinkList.size();

		if (navigationLinks > 1) {
			nextLinkWhenThereIsABackOrPreviousLink.click();
		} else {
			nextLinkWhenTheresNoGoingBack.click();
		}

		return this;
	}

	public String getTessSpeechBubble() {
		waitForElement(tessSpeechBubble);
		return tessSpeechBubble.getText().trim();
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
		// System.out.println("Click to next Panel");
		nextLinkForStoryPanels.click();
		return this;
	}

	// This method needs to check for these conditions:
	//
	public boolean moveOnToNextStoryBoard() {
		waitForElement(storyBoardImage);
		int counter = 0;
		boolean clickNext = false;
		while (counter < 10) {
			// Check if Next Link is present or if something on Dashboard is present
			if (navLinksForStoryPanelsList.size() > 0) {
				// Wait for src to change or for Chat alert from Tess to appear
				int secondCounter = 0;
				while (secondCounter < 10) {
					String newSrc = storyBoardImage.getAttribute("src");
					String oldSrc = scenarioSession.getStoryBoardSrc();
					if (!newSrc.equals(oldSrc)) {
						scenarioSession.setStoryBoardSrc(newSrc);
						// System.out.println("SRC changes");
						clickNext = true;
						break;
					} else if (newMessageFromTessModalList.size() > 0) {
						System.out.println("Tess interrupts!!!");
						break;
					}
					pause(.25);
					secondCounter++;
				}
				break;
			} else {

			}
			pause(.25);
			counter++;
		}

		return clickNext;
	}

	public void clickGoToChatWithTess() {
		waitForElement(goButtonOnChatWithTessModal);
		goButtonOnChatWithTessModal.click();
	}

}
