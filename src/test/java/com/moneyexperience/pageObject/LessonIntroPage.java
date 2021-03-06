package com.moneyexperience.pageObject;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
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
public class LessonIntroPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	PageObjectFactory pageObjectFactory;

	@FindBy(css = "button[data-testid = 'begin-button']")
	private WebElement beginButton;

	@FindAll(@FindBy(css = "img[src *= 'lessonstart']"))
	private List<WebElement> splashImageList;
	
	@FindAll(@FindBy(css = "div[data-testid = 'lesson-img']"))
	private List<WebElement> oldSplashImageList;

	@FindBy(css = "footer")
	private WebElement footer;

	@FindAll(@FindBy(css = "div[width = '40rem'] > h2"))
	private List<WebElement> agreementModalList;

	@FindBy(css = "div[width = '40rem'] button:not([type])")
	private WebElement acceptUserAgreementButton;

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
		return splashImageList.size() > 0 || oldSplashImageList.size() > 0;
	}

	public boolean lessonDesiredLesson(Integer lessonNumber) {
		return StringUtils.substringBetween(lessonTitleAndNumberElement.getText(), "LESSON", "OF").trim()
				.equals(String.valueOf(lessonNumber));
	}

	public boolean agreementModalPresent() {
		return agreementModalList.size() > 0;
	}

	public LessonIntroPage clickAcceptUserAgreementButton() {
		waitForElement(acceptUserAgreementButton);
		acceptUserAgreementButton.click();
		return this;
	}

}
