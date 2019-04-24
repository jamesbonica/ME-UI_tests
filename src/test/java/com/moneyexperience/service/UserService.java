package com.moneyexperience.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneyexperience.pageObject.LoginPage;
import com.moneyexperience.pageObject.TopMenuPage;

/**
 * 
 * @author jimbonica
 *
 * @date Apr-10-2019
 */

@Service
public class UserService {

	@Autowired
	LoginPage loginPage;

	@Autowired
	TopMenuPage topMenuPage;

	public void loginToWebApp(String username, String password) {
		loginPage.navigateToWebApp();
		loginPage.enterUsername(username).enterPassword(password)
		.clickLoginButton();

	}

	public void logout() {
		topMenuPage.clickLogOutLink();
	}

	public void resetUserProgressThroughUI(Integer lessonNumber) {
		topMenuPage.clickuserName().clickResetLessonLink(lessonNumber).clickAcceptProgressButton();
		
	}

}
