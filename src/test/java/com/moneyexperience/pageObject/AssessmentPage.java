package com.moneyexperience.pageObject;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class AssessmentPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	PageObjectFactory pageObjectFactory;

	@FindBy(css = "button[data-testid='survey-button']:enabled")
	private WebElement nextButton;

	@FindBy(css = "h4[data-testid]")
	private WebElement firstQuestion;

	public AssessmentPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean disabledNextButtonPresent() {
		if (driver.findElements(By.cssSelector("button[data-testid='survey-button']:disabled")).size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	public int countQuestionsOnPage() {
		waitForElement(firstQuestion);

		return driver.findElements(By.cssSelector("h4[data-testid]")).size();
	}

	public List<WebElement> getAnswerElements(int i) {

		return driver.findElements(By.cssSelector("div:nth-of-type(" + (i + 1)
				+ ") h4[data-testid *= 'single'] ~ button[data-testid *= 'single-answer-choice-']"));

	}

	public String getQuestionText(int i) {

		return driver.findElement(By.cssSelector("div:nth-of-type(" + (i + 1) + ") h4[data-testid *= 'single']")).getText()
				.trim();

	}

	public AssessmentPage clickNextButton() {
		waitForElement(nextButton);
		nextButton.click();
		return this;
	}

}
