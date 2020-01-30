package com.moneyexperience.pageObject;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import config.ScenarioSession;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class LessonIntroPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	PageObjectFactory pageObjectFactory;
	

	@FindBy(css = "button[data-testid = 'begin-button']")
	private WebElement beginButton;

	@FindBy(css = "footer")
	private WebElement footer;

	public LessonIntroPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SetPrioritiesPage clickBeginButton() {

		waitForElement(beginButton);
		beginButton.click();
		return pageObjectFactory.getSetPrioritiesPage();
	}

	public SetPrioritiesPage waitForBeginButton() {
		waitForElement(beginButton);
		return pageObjectFactory.getSetPrioritiesPage();
	}

}
