package com.moneyexperience.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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

	@FindBy(css = "div[role ='dialog']")
	private WebElement resetUserModal;

	// This returns a list of all Reset Lesson Links which could be as few as one or
	// as many as nine
	@FindAll(@FindBy(css = "div[class^='tooltiptext'][open] h2 ~ div > a"))
	private List<WebElement> resetLessonLinkList;

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

	public TopMenuPage clickuserName() {
		waitForElement(usernameDropdown);
		usernameDropdown.click();
		return this;
	}

	public TopMenuPage clickResetLessonLink(Integer lessonNumber) {
        waitForElement(htmlColorDefinedElement);
		for (WebElement element : resetLessonLinkList) {

			if (element.getText().startsWith(lessonNumber.toString() + " ")) {
				element.click();
			}
		}
		return this;
	}

	public TopMenuPage clickAcceptProgressButton() {
		waitForElement(resetUserModal);
		resetUserModal.findElement(By.cssSelector(" button:nth-of-type(2)")).click();
		return this;
	}

}
