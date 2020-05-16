package com.moneyexperience.pageObject;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class InventoryPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	PageObjectFactory pageObjectFactory;

	@FindBy(css = "button > p[data-testid]")
	private WebElement backButton;
	
	@FindBy(css = "img[src *='assets']")
	private WebElement inventoryImage;

	public InventoryPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public DashboardPage clickBackButton() {
		waitForElement(backButton);
		backButton.click();
		return pageObjectFactory.getDashboardPage();
	}
	
	public List<WebElement> getEnabledOptionalNarrativeButtons(){
		waitForElement(inventoryImage);
		return driver.findElements(By.cssSelector("div[width='80%'] > button:not([disabled])"));
	}

	

}
