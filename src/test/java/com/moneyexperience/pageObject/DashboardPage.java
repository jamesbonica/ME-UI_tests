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
 * @date May-02-2019
 */

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class DashboardPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	PageObjectFactory pageObjectFactory;

	@FindBy(css = "button[color = '$white'] > p[data-testid]")
	private WebElement continueButton;

	//// The inventory icons
	@FindBy(css = "button > img[src*='credit']")
	private WebElement creditCardIcon;

	@FindBy(css = "button > img[src*='career']")
	private WebElement careerIcon;

	@FindBy(css = "button > img[src*='/car/']")
	private WebElement carIcon;

	@FindBy(css = "button > img[src*='dating']")
	private WebElement personalLifeIcon;

	@FindBy(css = "button > img[src*='child']")
	private WebElement familyIcon;

	@FindBy(css = "button > img[src*='travel']")
	private WebElement travelIcon;

	@FindBy(css = "button > img[src*='401k']")
	private WebElement four01kIcon;

	@FindBy(css = "button > img[src*='Residence']")
	private WebElement changeResidenceIcon;

	@FindBy(css = "button > img[src*='residence/']")
	private WebElement investmentPropertyIcon;

	@FindBy(css = "button > img[src*='invest']")
	private WebElement investmentIcon;

	@FindBy(css = "button > img[src*='education']")
	private WebElement educationIcon;

	public DashboardPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean imReadyButtonPresent() {
		waitForElement(tessIcon);
		return imReadyButtonList.size() > 0;

	}

	public LessonCheckpointPage clickContinueButton() {
		waitForElement(continueButton);
		continueButton.click();
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

	public InventoryPage clickPersonalLifeIcon() {
		waitForElement(personalLifeIcon);
		personalLifeIcon.click();
		return pageObjectFactory.getInventoryPage();
	}

	public ChatPage clickFamilyIcon() {
		waitForElement(familyIcon);
		familyIcon.click();
		return pageObjectFactory.getChatPage();
	}

	public InventoryPage clickTakeATripIcon() {
		waitForElement(travelIcon);
		travelIcon.click();
		return pageObjectFactory.getInventoryPage();
	}

	public ChatPage clickFour01kIcon() {
		waitForElement(four01kIcon);
		four01kIcon.click();
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

	public ChatPage clickEducationIcon() {
		waitForElement(educationIcon);
		educationIcon.click();
		return pageObjectFactory.getChatPage();
	}

	public ChatPage clickInverstmentPropertyIcon() {
		waitForElement(investmentPropertyIcon);
		investmentPropertyIcon.click();
		return pageObjectFactory.getChatPage();
	}

}
