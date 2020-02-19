package com.moneyexperience.pageObject;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

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
public class ConfirmPrioritiesPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	PageObjectFactory pageObjectFactory;
	
	@FindBy(css = "button[data-testid='priority-forward-button']")
	private WebElement nextButton;

	public ConfirmPrioritiesPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ConfirmPrioritiesPage dismissTessInstructions() {
		waitForElement(imReadyButton);
		imReadyButton.click();
		return this;

	}
	
	public void clickNextButton() {
		waitForElement(nextButton);
		nextButton.click();
	}
	
	

}
