package com.elsevier.pageObject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import config.PropertiesLoader;

public class AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	PropertiesLoader propertiesLoader;

	// I'm adding this here because it is an element constantly present like the
	// menu
	@FindBy(css = "div[role = 'navigation'] + div > button + p")
	protected WebElement lessonTitleAndNumberElement;

	// Here because Tess's Instructions must be dismissed on multiple pages
	@FindBy(css = "button[data-testid = 'ready-button']")
	protected WebElement imReadyButton;

	@FindAll(@FindBy(css = "button[data-testid = 'ready-button']"))
	protected List<WebElement> imReadyButtonList;

	@FindAll(@FindBy(css = "img[data-testid = 'story-img']"))
	protected List<WebElement> storyBoardImageList;

	@FindBy(css = "div[data-testid = 'age-string']")
	protected WebElement lessonAgeRange;

	@FindAll(@FindBy(css = "div[data-testid = 'age-string']"))
	protected List<WebElement> lessonAgeRangeList;

	@FindBy(css = "div[width= '100%'] > button > img[alt *= 'speaking']")
	protected WebElement tessIcon;

	@FindAll(@FindBy(css = "div[width= '100%'] > button > img[src *= '.png']"))
	protected List<WebElement> tessIconList;

	public AbstractPage navigateToWebApp() {
		driver.navigate().to(propertiesLoader.getAssessmentTestUrl());
		return this;
	}

	public AbstractPage pause(double d) {
		try {
			Thread.sleep((long) (d * 1000));
		} catch (InterruptedException e) {
		}
		return this;
	}

	public AbstractPage waitForElement(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (TimeoutException t) {
			System.out.println(element.toString() + " not found");
		}
		return this;
	}

	public AbstractPage waitForElementInChat(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 22);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException t) {
			System.out.println(element.toString() + " not found in Chat");
		}
		return this;
	}

	public AbstractPage scrollToElement(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		return this;

	}

	public boolean imReadyButtonPresent() {
		return imReadyButtonList.size() > 0;
	}

	public AbstractPage dismissImReadyButton() {
		waitForElement(imReadyButton);
		imReadyButton.click();
		return this;
	}

	// The Storyboards do not have an age range displayed
	public boolean notOnStoryBoardPage() {
		return (lessonAgeRangeList.size() > 0 || imReadyButtonList.size() > 0 || storyBoardImageList.size() == 0);
	}

	public String getPagetitle() {
		return driver.getTitle().trim();
	}

}
