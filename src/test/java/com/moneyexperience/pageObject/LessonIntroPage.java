package com.moneyexperience.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LessonIntroPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	PageObjectFactory pageObjectFactory;

	@FindBy(css = "h3[aria-label] + button")
	private WebElement beginButton;

	@FindBy(css = "footer")
	private WebElement footer;

	public LessonIntroPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Clicking this button after resetting lesson has posed two major issues
	// 1. StaleElementReferenceException which seems to be tied to the page reloading after resetting User Progress
	// 2. WebDriverException which comes from a layer temporarily obscuring the Next button
	public SetPrioritiesPage clickBeginButton() {
		waitForElement(htmlColorDefinedElement);
		waitForElement(beginButton);
		try {
			beginButton.click();
		} catch (Exception e) {
			waitForElement(beginButton);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", beginButton);
		}
		return pageObjectFactory.getSetPrioritiesPage();
	}

}
