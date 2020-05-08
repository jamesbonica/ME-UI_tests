package com.moneyexperience.pageObject;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class AssessmentV2Page extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	PageObjectFactory pageObjectFactory;

	@FindBy(css = "button[tabindex = '0'] > p[data-testid]")
	private WebElement beginAndContinueButton;

	@FindAll(@FindBy(css = "img[src *= 'moneyexperience_blue_square.png']"))
	private List<WebElement> meBigLogoList;

	@FindBy(xpath = "//button[text() = 'Next']")
	private WebElement nextButton;

	@FindAll(@FindBy(xpath = "//button[text() = 'Next']"))
	private List<WebElement> nextButtonList;

	@FindAll(@FindBy(css = "p[data-testid]"))
	private List<WebElement> questionList;

	public AssessmentV2Page(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickBeginAndContinueButton() {
		waitForElement(beginAndContinueButton);
		beginAndContinueButton.click();
		pause(.25);

	}

	public void clickNextButton() {
		scrollToElement(nextButton);
		waitForElement(nextButton);
		nextButton.click();
		pause(.25);
	}


	public boolean nextButtonPresent() {
		return nextButtonList.size() > 0;
	}

	public int getAmountOfQuestionsOnPage() {
		return questionList.size();
	}

	public String getQuestionText(int i) {
		String question = questionList.get(i).getText().trim();

		if (question.trim().equals("")) {
			return driver.findElement(By.xpath("//p[@font-weight='bold']/following-sibling::p")).getText();
		} else {
			return question;
		}
	}

	public List<WebElement> getAnswerElements(int i) {

		return driver.findElements(By.xpath("(//div/p[contains(@data-testid, 'single-answer')])[" + (i + 1)
				+ "]/following-sibling::div/descendant::p"));

	}

	public boolean meBigLogoPresent() {

		return meBigLogoList.size() > 0;
	}

}
