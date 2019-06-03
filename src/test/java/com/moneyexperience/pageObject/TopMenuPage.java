package com.moneyexperience.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

	@FindAll(@FindBy(css = "div[role ='dialog']"))
	private List<WebElement> resetUserModalList;

	// This returns a list of all Reset Lesson Links which could be as few as one or
	// as many as nine
//	@FindAll(@FindBy(css = "div[class^='tooltiptext'][open] h2 ~ div > a"))
//	private List<WebElement> resetLessonLinkList;

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
		List<WebElement> resetLessonLinkList = waitForResetLessonLinksListToBeFullyLoaded(lessonNumber);
		for (WebElement element : resetLessonLinkList) {

			if (element.getText().startsWith(lessonNumber.toString() + " ")) {
				element.click();
			}
		}
		return this;
	}

	private List<WebElement> waitForResetLessonLinksListToBeFullyLoaded(Integer lessonNumber) {
		int counter = 0;
		List<WebElement> resetLessonLinkList = null;
		while (counter <= 5) {
			resetLessonLinkList = driver.findElements(By.cssSelector("div[class^='tooltiptext'][open] h2 ~ div > a"));
			if (resetLessonLinkList.size() >= lessonNumber) {
				break;
			}
			pause(.5);
			if (counter == 5) {
				throw new NoSuchElementException(
						"The reset link for Lesson " + lessonNumber + " didn't appear in 2.5 seconds!!!");
			}
			counter++;
		}
		return resetLessonLinkList;
	}

	public TopMenuPage clickAcceptResetProgressButton() {
		waitForElement(resetUserModal);
		try {
			resetUserModal.findElement(By.cssSelector(" button:nth-of-type(2)")).click();
		} catch (NoSuchElementException n) {
			throw new NoSuchElementException(
					"The Reset Progress Modal is not present. Check the click on the Reset User to Lesson ... dropdown functionality");
		}

		waitForElementToLeave(resetUserModalList);

		return this;
	}

}
