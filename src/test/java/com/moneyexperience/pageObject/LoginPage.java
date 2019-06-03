package com.moneyexperience.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@FindBy(css = "input#username")
	private WebElement usernameField;

	@FindBy(css = "input#password")
	private WebElement passwordField;

	@FindBy(css = "button[type=submit]")
	private WebElement submitButton;

	public LoginPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LoginPage enterUsername(String s) {
		waitForElement(usernameField);
		usernameField.sendKeys(s);
		return this;
	}

	public LoginPage enterPassword(String s) {
		waitForElement(passwordField);
		passwordField.sendKeys(s);
		return this;
	}

	public void clickLoginButton() {
		waitForElement(submitButton);
		submitButton.click();
	}

}
