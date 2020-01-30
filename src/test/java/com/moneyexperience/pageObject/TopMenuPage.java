package com.moneyexperience.pageObject;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
public class TopMenuPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	PageObjectFactory pageObjectFactory;

	@FindBy(css = "div[role='navigation'] + div span")
	private WebElement meIcon;

	@FindBy(css = "div[role='navigation'] ~ div > nav div:nth-child(2) button:nth-child(2)")
	private WebElement resetProgressButton;

	@FindBy(css = "nav svg + span")
	private WebElement usernameDropdown;

	@FindBy(css = "nav a:nth-of-type(2)")
	private WebElement logoutLink;

	@FindBy(css = "div[role ='dialog']")
	private WebElement resetUserModal;
	
	@FindAll(@FindBy(css = "img[data-testid = 'full-logo']"))
	private List<WebElement> meFullLogoList;


	// This returns a list of all Reset Lesson Links which could be as few as one or
	// as many as nine
//	@FindAll(@FindBy(css = "div[class^='tooltiptext'][open] h2 ~ div > a"))
//	private List<WebElement> resetLessonLinkList;

	public TopMenuPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public TopMenuPage clickMeIcon() {
		waitForElement(meIcon);
		meIcon.click();
		return this;
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

	public TopMenuPage clickResetLessonLink(Integer lessonNumber) {
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
			resetLessonLinkList = driver.findElements(By.cssSelector("div[role='dialog'] button:not([disabled])>span"));
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

		waitForElementToLeave(meFullLogoList);

		return this;
	}

	public TopMenuPage clickResetProgressButton() {
		waitForElement(resetProgressButton);
		resetProgressButton.click();
		return this;
	}

	public LessonIntroPage waitForTopMenuToDisappear() {
		waitForElementToLeave(meFullLogoList);
		return pageObjectFactory.getLessonIntroPage();

	}

}
