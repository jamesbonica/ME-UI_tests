package com.moneyexperience.pageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author jimbonica
 *
 * @date May-02-2019
 */

@Component
public class DashboardPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	PageObjectFactory pageObjectFactory;

	@FindBy(css = "footer > button[class*='finishLesson']")
	private WebElement nextButton;

	public DashboardPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LessonCheckpointPage clickNextButton() {
		waitForElement(nextButton);
		nextButton.click();
		return pageObjectFactory.getLessonCheckpointPage();
	}

}
