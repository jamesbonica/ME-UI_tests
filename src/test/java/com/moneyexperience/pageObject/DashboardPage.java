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

	@FindBy(css = "div[display='flex'] > button[class]:not([aria-label])")
	private WebElement nextButton;

	//// The icons for the optional narratives
	@FindBy(css = "button > img[src*='credit_card']")
	private WebElement creditCardIcon;

	@FindBy(css = "button > img[src*='CAREER']")
	private WebElement careerIcon;

	@FindBy(css = "button > img[src*='firstcar']")
	private WebElement carIcon;

	@FindBy(css = "button > img[src*='HEART']")
	private WebElement datingIcon;

	@FindBy(css = "button > img[src*='marriage']")
	private WebElement getMarriedIcon;

	@FindBy(css = "button > img[src*='child']")
	private WebElement haveAChildIcon;

	@FindBy(css = "button > img[src*='travel']")
	private WebElement takeATripIcon;

	@FindBy(css = "button > img[src*='401k']")
	private WebElement four01kIcon;

	@FindBy(css = "button > img[src*='529']")
	private WebElement five29Icon;

	@FindBy(css = "button > img[src*='HOME']")
	private WebElement changeResidenceIcon;

	@FindBy(css = "button > img[src$='invest.png']")
	private WebElement investmentIcon;

	public DashboardPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LessonCheckpointPage clickNextButton() {
		waitForElement(nextButton);
		nextButton.click();
		return pageObjectFactory.getLessonCheckpointPage();
	}

	public ChatPage clickCreditCardIcon() {
		waitForElement(creditCardIcon);
		creditCardIcon.click();
		return pageObjectFactory.getChatPage();
	}

	public ChatPage clickChangeCareerIcon() {
		waitForElement(careerIcon);
		careerIcon.click();
		return pageObjectFactory.getChatPage();
	}

	public ChatPage clickBuyACarIcon() {
		waitForElement(carIcon);
		carIcon.click();
		return pageObjectFactory.getChatPage();
	}

	public ChatPage clickDatingIcon() {
		waitForElement(datingIcon);
		datingIcon.click();
		return pageObjectFactory.getChatPage();
	}

	public ChatPage clickMarriageIcon() {
		waitForElement(getMarriedIcon);
		getMarriedIcon.click();
		return pageObjectFactory.getChatPage();
	}

	public ChatPage clickHaveAChildIcon() {
		waitForElement(haveAChildIcon);
		haveAChildIcon.click();
		return pageObjectFactory.getChatPage();
	}

	public ChatPage clickTakeATripIcon() {
		waitForElement(takeATripIcon);
		takeATripIcon.click();
		return pageObjectFactory.getChatPage();
	}

	public ChatPage clickFour01kIcon() {
		waitForElement(four01kIcon);
		four01kIcon.click();
		return pageObjectFactory.getChatPage();
	}

	public ChatPage clickFive29Icon() {
		waitForElement(five29Icon);
		five29Icon.click();
		return pageObjectFactory.getChatPage();
	}

	public ChatPage clickChangeResidenceIconIcon() {
		waitForElement(changeResidenceIcon);
		changeResidenceIcon.click();
		return pageObjectFactory.getChatPage();
	}

	public ChatPage clickInvestmentIcon() {
		waitForElement(investmentIcon);
		investmentIcon.click();
		return pageObjectFactory.getChatPage();
	}

}
