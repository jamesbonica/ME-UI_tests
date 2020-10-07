package com.moneyexperience.pageObject;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class WildcardPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	PageObjectFactory pageObjectFactory;

	@FindBy(xpath = "//p[@id = 'wildcard-header']/following-sibling::button")
	private WebElement wildcardCoverContinueButton;
	
	@FindBy(xpath = "//p[@id = 'wildcard-header']/following-sibling::button/p[contains(text(),'dream')]")
	private WebElement wildcardActionCompleteButton;

	public WildcardPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WildcardPage clickCoverContinueButton() {
		waitForElement(wildcardCoverContinueButton);
		wildcardCoverContinueButton.click();
		return this;
	}
	
	public DashboardPage clickActionCompleteButtonButton() {
		waitForElement(wildcardActionCompleteButton);
		wildcardActionCompleteButton.click();
		waitForElement(imReadyButton);
		return pageObjectFactory.getDashboardPage();
	}

}
