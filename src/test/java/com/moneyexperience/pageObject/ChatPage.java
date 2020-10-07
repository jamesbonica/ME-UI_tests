package com.moneyexperience.pageObject;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 
 * @author jimbonica
 *
 * @date May-02-2019
 */

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class ChatPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@FindBy(css = "button[id = 'user_response_0']")
	private WebElement firstResponseInAnswerStack;

	@FindAll(@FindBy(css = "button[id^= 'user_response_']"))
	private List<WebElement> textResponseStack;

	@FindAll(@FindBy(css = "li"))
	private List<WebElement> carouselOptionList;

	@FindBy(css = "li[style = 'order: 2;'] > button")
	private WebElement textCarouselCenterOption;

	@FindBy(css = "li[class='slider-slide slide-visible'] div[data-testid] > button[data-testid] h3")
	private WebElement imageCarouselCenterOption;

	@FindBy(css = "li[class *= 'slide-visible'] h2")
	private WebElement phoneAppCenterOption;

	@FindBy(css = "li[class *= 'slide-visible'] button > p")
	private WebElement phoneAppSelectButton;

	@FindAll(@FindBy(css = "ul > li > button[id^='user_response']"))
	private List<WebElement> textOptionList;

	@FindBy(css = "ul > li > button[id^='user_response_0']")
	private WebElement firstTextOption;

	@FindBy(css = "button[value='left']")
	private WebElement leftNavArrow;

	@FindBy(css = "button[value='right']")
	private WebElement rightNavArrow;

	@FindBy(css = "div[class*='slider-control-centerright']")
	private WebElement rightNavArrowPhoneApp;

	@FindBy(css = "div[class*='slider-control-centerleft']")
	private WebElement leftNavArrowPhoneApp;

	@FindBy(css = "input[aria-label = 'amount-slider']")
	private WebElement inputSlider;

	@FindBy(css = "input[aria-label = 'amount-slider'] + * + button")
	private WebElement inputSliderPlusButton;

	@FindBy(css = "div[font-family = 'Knockout-JuniorWelterweight'] > button")
	private WebElement inputSliderMinusButton;

	@FindBy(css = "button[data-testid*='send-button']")
	private WebElement sendButton;

	@FindBy(css = "button[data-testid='send-number-button']")
	private WebElement numberSendButton;

	@FindAll(@FindBy(css = "footer"))
	private List<WebElement> footerList;

	public ChatPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ChatPage selectOptionInTextStack(String choice) {
		waitForElementInChat(firstResponseInAnswerStack);

		int counter = 0;
		while (counter < textResponseStack.size()) {
			WebElement element = textResponseStack.get(counter);
			if (element.getText().toLowerCase().trim().startsWith(choice.toLowerCase())) {
				element.click();
				break;
			}

			counter++;

			if (counter == textResponseStack.size()) {
				throw new NoSuchElementException("The choice: \"" + choice
						+ "\" listed in the in the feature file is not present in the Content");
			}
		}

		return this;

	}

	public ChatPage selectOptionInImageCarousel(String choice, String navigationDirection) {
		selectOptionInCarousel(choice, navigationDirection, carouselOptionList, imageCarouselCenterOption,
				imageCarouselCenterOption, "imageCarousel");
		return this;
	}

	public ChatPage selectPhoneAppOption(String choice, String navigationDirection) {
		selectOptionInCarousel(choice, navigationDirection, carouselOptionList, phoneAppCenterOption,
				phoneAppSelectButton, "phoneApp");
		return this;

	}

	private void selectOptionInCarousel(String choice, String navigationDirection, List<WebElement> carouselOptionList,
			WebElement imageCarouselCenterOption, WebElement carouselCenterClickable, String appType) {
		// Get the total amount of options
		waitForElementInChat(imageCarouselCenterOption);

		String uIText = "";
		int counter = 0;

		while (counter <= carouselOptionList.size()) {
			waitUntilElementReturnsString(imageCarouselCenterOption);
			uIText = imageCarouselCenterOption.getText().trim();

			// System.out.println("uIText " + uIText);

			if (uIText.equalsIgnoreCase(choice)) {
				try {
					carouselCenterClickable.click();
				} catch (ElementNotInteractableException e) {
					carouselCenterClickable.click();
				}
				break;
			} else {
				clickNavArrow(navigationDirection, appType);
			}

			pause(.15);
			counter++;

			if (counter == (carouselOptionList.size() + 1)) {

				throw new NoSuchElementException(choice + " is not an option.");
			}
		}

	}

	private void clickNavArrow(String navigationDirection, String appType) {
		if (appType.contains("phone")) {
			if (navigationDirection.equalsIgnoreCase("left")) {
				waitForElement(leftNavArrowPhoneApp);
				pause(.25);
				leftNavArrowPhoneApp.click();
			} else {
				waitForElement(rightNavArrowPhoneApp);
				pause(.25);
				rightNavArrowPhoneApp.click();
			}

		} else if (appType.contains("image")) {
			if (navigationDirection.equalsIgnoreCase("left")) {
				waitForElement(leftNavArrow);
				leftNavArrow.click();
			} else {
				waitForElement(rightNavArrow);
				pause(.4);
				rightNavArrow.click();
			}
		}

	}

	private void waitUntilElementReturnsString(WebElement imageCarouselCenterOption) {
		int counter = 0;
		while (counter < 10) {
			if (!imageCarouselCenterOption.getText().equals("")) {
				break;
			}

			pause(.1);
			counter++;
		}

	}

	public ChatPage clickSendButton() {
		waitForElement(sendButton);
		sendButton.click();
		return this;
	}

	public ChatPage clickNumberSendButton() {
		waitForElement(numberSendButton);
		scrollToElement(numberSendButton);
		numberSendButton.click();
		return this;
	}

	public ChatPage selectOption(String choice) {
		waitForElementInChat(firstTextOption);
		for (WebElement element : textOptionList) {
			// System.out.println("Expected option is: " + choice);
			// System.out.println("TEST!!!!! " + element.getText());
			if (element.getText().trim().equalsIgnoreCase(choice)) {
				// System.out.println("CLICK!!!!!!!!!");
				element.click();
				break;
			}
		}
		return this;

	}

	public ChatPage selectSlider(String choice) {
		waitForElementInChat(inputSliderPlusButton);
		String cleanNumberString = StringUtils.replace(choice, ",", "");
		cleanNumberString = StringUtils.replace(cleanNumberString, "%", "");
		int convertedChoice = Integer.valueOf(cleanNumberString);

		if (convertedChoice > Integer.valueOf(inputSlider.getAttribute("max"))) {
			throw new NoSuchElementException("The value entered is more than the max value of the slider");
		}
		if (convertedChoice == 0) {
			inputSliderMinusButton.click();
		} else {

			int clicks = convertedChoice / Integer.valueOf(inputSlider.getAttribute("step"));

			for (int i = 0; i <= clicks; i++) {
				inputSliderPlusButton.click();
			}
		}
		return this;
	}

}
