package com.moneyexperience.pageObject;

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

	public LessonIntroPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SetPrioritiesPage clickBeginButton() {
		waitForElement(beginButton);
		beginButton.click();
		return pageObjectFactory.getSetPrioritiesPage();
	}

}
