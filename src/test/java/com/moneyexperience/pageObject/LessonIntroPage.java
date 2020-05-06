package com.moneyexperience.pageObject;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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

	@FindAll(@FindBy(css = "div[data-testid = 'lesson-img']"))
	private List<WebElement> splashImageList;

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

	public LessonIntroPage waitForBeginButton() {
		waitForElement(beginButton);
		return this;
	}

	public boolean onLessonStartPage() {
		waitForElement(lessonTitleAndNumberElement);
		return splashImageList.size() > 0;
	}

	public boolean lessonDesiredLesson(Integer lessonNumber) {
		return StringUtils.substringBetween(lessonTitleAndNumberElement.getText(), "LESSON", "OF").trim().equals(String.valueOf(lessonNumber));
	}

}
