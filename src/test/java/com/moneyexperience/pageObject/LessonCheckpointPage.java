package com.moneyexperience.pageObject;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
 * @date May-06-2019
 */

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class LessonCheckpointPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	PageObjectFactory pageObjectFactory;

	@FindBy(css = "div[id = 'wallet'] + div[display='flex'][class] > button[class]")
	private WebElement finishLessonButton;

	public LessonCheckpointPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LessonIntroPage clicFinishLessonButton() {
		waitForElement(finishLessonButton);
		scrollToElement(finishLessonButton);
		finishLessonButton.click();

		return pageObjectFactory.getLessonIntroPage();
	}


}
