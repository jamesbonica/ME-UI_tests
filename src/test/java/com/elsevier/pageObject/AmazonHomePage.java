package com.elsevier.pageObject;

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
public class AmazonHomePage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@FindBy(xpath = "//ul/li[2]")
	private WebElement academicsLink;
	
	@FindBy(css = "li[id = 'degree-programs']")
	private WebElement degreeProgramsLink;
	
	@FindBy(css = "span[id = 'ol']")
	private WebElement onlineLink;
	
	@FindBy(css = "input[id = 'twotabsearchtextbox']")
	private WebElement searchField;
	
	@FindBy(xpath = "//span/input")
	private WebElement searchSubmitButton;
	
	public AmazonHomePage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public AmazonHomePage clickAcademicsLink() {
		waitForElement(academicsLink);
		academicsLink.click();
		
		return this;
	}
	
	public AmazonHomePage clickOnlineLink() {
		waitForElement(onlineLink);
		pause(1);
		onlineLink.click();
		pause(5);

		return this;
	}
	
	public AmazonHomePage clickDegreeProgramsLink() {
		waitForElement(degreeProgramsLink);
		degreeProgramsLink.click();
		
		return this;
	}

	
	public AmazonHomePage enterSearchTerm(String searchTerm) {
		waitForElement(searchField);
		searchField.sendKeys(searchTerm);
		return this;
	}
	
	public void clickSearchButton() {
		waitForElement(searchSubmitButton);
		searchSubmitButton.click();
		pause(5);
	}
	
	
	public AmazonHomePage waitforLoading() {
		waitForElement(searchField);
		return this;
	}

}
