package com.moneyexperience.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.moneyexperience.pageObject.ChatPage;

/**
 * 
 * @author jimbonica
 *
 * @date May-01-2019
 */

@Service
@Scope("cucumber-glue")
public class ResponseService {

	@Autowired
	ChatPage chatPage;;

	public void enterUserResponse(String carouselOrSlider, String choice, String navigationDirection) {
	//	System.out.println("============= carouselOrSlider is " + carouselOrSlider + " choice is " + choice + " navigationDirection is " + navigationDirection);
		if (carouselOrSlider.equalsIgnoreCase("text carousel")) {
			chatPage.selectOptionInTextCarousel(choice, navigationDirection).clickSendButton();
		} else if (carouselOrSlider.equalsIgnoreCase("image carousel")) {
			chatPage.selectOptionInImageCarousel(choice, navigationDirection).clickSelectButton();
		} else if (carouselOrSlider.equalsIgnoreCase("slider")) {
			chatPage.selectSlider(choice).clickSendButton();
		} else if (carouselOrSlider.equalsIgnoreCase("dating app")) {
			chatPage.selectDatingOption(choice, navigationDirection).clickSelectButtonOnDatingApp();
		} else if (carouselOrSlider.equals("")) {
			chatPage.selectOption(choice).clickSendButton();
		}

	}

}
