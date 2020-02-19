package com.moneyexperience.pageObject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
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
	@FindBy(css= "button[data-testid = 'ready-button']")
	protected WebElement imReadyButton;

	public AbstractPage navigateToWebApp() {
		driver.navigate().to(propertiesLoader.getTestUrl());
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
			WebDriverWait wait = new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (TimeoutException t) {
			System.out.println(element.toString() + " not found");
		}
		return this;
	}

	public AbstractPage waitForElementInChat(WebElement element) {
		// try {
		WebDriverWait wait = new WebDriverWait(driver, 22);
		wait.until(ExpectedConditions.visibilityOf(element));
		// } catch (TimeoutException t) {
		// System.out.println(element.toString() + " not found in Chat");
		// }
		return this;
	}

	public AbstractPage waitForElementToLeave(List<WebElement> elementList) {
		int counter = 0;
		while (counter < 10000) {
			if ((elementList.size() > 0)) {
				// System.out.println("TEST!!!!!!!!!!!!!!!!!" + (elementList.size() > 0));
			} else {
				break;
			}
			pause(.25);
			counter++;
		}

		return this;
	}

	public AbstractPage scrollToElement(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		return this;

	}

}
