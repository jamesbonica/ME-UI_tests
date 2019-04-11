package com.moneyexperience.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopMenuPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	PageObjectFactory pageObjectFactory;

	@FindBy(css = "nav svg + span")
	private WebElement usernameDropdown;

	@FindBy(css = "nav a:nth-of-type(2)")
	private WebElement logoutLink;

	public TopMenuPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getUsernameText() {
		waitForElement(usernameDropdown);
		return usernameDropdown.getText();
	}

	public LoginPage clickLogOutLink() {
		waitForElement(logoutLink);
		logoutLink.click();
		return pageObjectFactory.getLoginPage();
	}

}
