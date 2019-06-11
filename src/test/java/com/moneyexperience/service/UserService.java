package com.moneyexperience.service;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.moneyexperience.pageObject.LoginPage;
import com.moneyexperience.pageObject.TopMenuPage;

import config.CrossScenarioCache;
import config.PropertiesLoader;
import config.ScenarioSession;

/**
 * 
 * @author jimbonica
 *
 * @date Apr-10-2019
 */

@Service
@Scope("cucumber-glue")
public class UserService {

	@Autowired
	EventFiringWebDriver driver;

	@Autowired
	PropertiesLoader propertiesLoader;

	@Autowired
	ScenarioSession scenarioSession;

	@Autowired
	CrossScenarioCache crossScenarioCache;

	@Autowired
	LoginPage loginPage;

	@Autowired
	TopMenuPage topMenuPage;

	public void loginToWebApp(String username, String password) {
		loginPage.navigateToWebApp();

		username = getConfiguredUserName(username);
		password = getConfiguredUserPassword(password);

		loginPage.enterUsername(username).enterPassword(password).clickLoginButton();

	}

	public void logout() {
		topMenuPage.clickLogOutLink();
	}

	public void resetUserProgressThroughUI(Integer lessonNumber) {
		topMenuPage.clickuserName().clickResetLessonLink(lessonNumber).clickAcceptResetProgressButton();
	}

	String getConfiguredUserName(String username) {
		if (!username.toLowerCase().startsWith("configure")) {
			return username;
		}

		if (username.endsWith(" 1")) {
			scenarioSession.writeToReport("The user for this scenario is " + username);
			return propertiesLoader.getConfiguredUserOne();
		} else {
			return null;
		}
	}

	String getConfiguredUserPassword(String password) {
		if (!password.toLowerCase().contains("configure")) {
			return password;
		}

		if (password.contains("user 1")) {
			scenarioSession.writeToReport("The password for this scenario is " + password);
			return propertiesLoader.getConfiguredUser1Password();
		} else {
			return null;
		}
	}

}
