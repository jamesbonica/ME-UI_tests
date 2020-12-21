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
public class LogInMyStorePage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@FindBy(css = "button[name='SubmitLogin']")
	private WebElement signInButton;
	
	public LogInMyStorePage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LogInMyStorePage waitforLoading() {
		waitForElement(signInButton);
		return this;
	}

}
