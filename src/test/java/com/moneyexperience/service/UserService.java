package com.moneyexperience.service;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import com.moneyexperience.pageObject.LessonIntroPage;
import com.moneyexperience.pageObject.LoginPage;
import com.moneyexperience.pageObject.UserMenuPage;

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
@Scope(SCOPE_CUCUMBER_GLUE)
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
	UserMenuPage userMenuPage;

	@Autowired
	LessonIntroPage lessonIntroPage;

	public void loginToWebApp(String username, String password) {
		loginPage.navigateToWebApp();

		username = getConfiguredUserName(username);
		password = getConfiguredUserPassword(password);

		loginPage.enterUsername(username).enterPassword(password).clickLoginButton();

	}

	public void logout() {
		userMenuPage.clickLogOutLink();
	}

	public void resetUserProgressThroughUI(Integer lessonNumber) {
		if (lessonIntroPage.onLessonStartPage() && lessonIntroPage.lessonDesiredLesson(lessonNumber)) {
			// Do nothing
		} else {
			if (userMenuPage.imReadyButtonPresent()) {
				userMenuPage.dismissImReadyButton();
			}
			userMenuPage.clickHamburgerIcon().clickResetProgressButton().clickResetLessonLink(lessonNumber)
					.waitForUserMenuToDisappear();
		}
	}

	String getConfiguredUserName(String username) {
		if (!username.toLowerCase().startsWith("configure")) {
			return username;
		}

		if (username.endsWith(" 1")) {
			scenarioSession.writeToReport("The user for this scenario is " + propertiesLoader.getConfiguredUserOne());
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
			scenarioSession.writeToReport(
					"The password for this scenario is " + propertiesLoader.getConfiguredUser1Password());
			return propertiesLoader.getConfiguredUser1Password();
		} else {
			return null;
		}
	}

}
