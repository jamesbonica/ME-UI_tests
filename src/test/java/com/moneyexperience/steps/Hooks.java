package com.moneyexperience.steps;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import com.moneyexperience.pageObject.LoginPage;

import config.PropertiesLoader;
import config.ScenarioSession;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * 
 * @author jimbonica
 *
 * @date Apr-10-2019
 */

@Scope(SCOPE_CUCUMBER_GLUE)
public class Hooks {

	@Autowired
	private ApplicationContext appContext;

	@Autowired
	PropertiesLoader propertiesLoader;

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	LoginPage loginPage;

	@Autowired
	ScenarioSession scenarioSession;

	@Before
	public void setUp(Scenario scenario) {
		scenarioSession.setScenario(scenario);

		// Collection<String> tagList = scenario.getSourceTagNames();

		System.out.println("In before hook");

//		 String[] beans = appContext.getBeanDefinitionNames();
//		 Arrays.sort(beans);
//		 for (String bean : beans) {
//		 System.out.println(bean);
//		 }

//		System.out.println(driver.toString());

	}

	@After
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {

			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", ""); // stick it in the report
		}

		if (!driver.getCurrentUrl().equals("data:,")) {
			((JavascriptExecutor) driver).executeScript(String.format("window.localStorage.clear();"));
		}
		driver.close();
	}

}
