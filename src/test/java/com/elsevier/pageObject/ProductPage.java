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
public class ProductPage extends AbstractPage {

	@Autowired
	EventFiringWebDriver driver;

	@FindBy(css = "button[name='Submit']")
	private WebElement addToCartButton;
	
	@FindBy(css="div[class*= 'layer_cart_product'] h2")
	private WebElement cartSuccessMessage;


	public ProductPage(EventFiringWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ProductPage clickAddtoCartButton() {
		waitForElement(addToCartButton);
		addToCartButton.click();
		return this;
	}

	public String getLeftCartMessage() {
		waitForElement(cartSuccessMessage);
		return cartSuccessMessage.getText();
	}
	

}
