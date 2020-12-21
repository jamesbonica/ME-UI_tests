package com.elsevier.service;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import com.elsevier.pageObject.ProductPage;
import com.elsevier.pageObject.YourLogoHomePage;
import config.CrossScenarioCache;
import config.PropertiesLoader;
import config.ScenarioSession;

/**
 * 
 * @author jimbonica
 *
 * @date Dec-19-2020
 */

@Service
@Scope(SCOPE_CUCUMBER_GLUE)
public class AssessmentService {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	PropertiesLoader propertiesLoader;

	@Autowired
	ScenarioSession scenarioSession;

	@Autowired
	YourLogoHomePage yourLogoHomePage;

	@Autowired
	ProductPage productPage;

	@Autowired
	CrossScenarioCache crossScenarioCache;

	public void goToToWebApp() {
		yourLogoHomePage.navigateToWebApp();

	}

	public void clicReducedkProduct(String itemTitle) {
		yourLogoHomePage.clickReducedItem(itemTitle);
	}

	public void clickAddtoCart() {
		productPage.clickAddtoCartButton();
	}

	public String getLeftCartMessage() {
		return productPage.getLeftCartMessage();
	}

	public void clickSignInLink() {
		yourLogoHomePage.clickSignInButton().waitforLoading();

	}
	
	public String getPageTitle() {
		return yourLogoHomePage.getPagetitle();
	}

}
