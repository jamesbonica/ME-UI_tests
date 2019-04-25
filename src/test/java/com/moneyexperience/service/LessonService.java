package com.moneyexperience.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneyexperience.pageObject.LessonIntroPage;
import com.moneyexperience.pageObject.SetPrioritiesPage;

import cucumber.api.java.en.Given;

/**
 * 
 * @author jimbonica
 *
 * @date Apr-24-2019
 */

@Service
public class LessonService {

	@Autowired
	LessonIntroPage lessonIntroPage;
	
	@Autowired
	SetPrioritiesPage setPrioritiesPage;

	public void clickBeginButton() {
		lessonIntroPage.clickBeginButton();

	}

	public void setPriorities(List<String> prioritiesList) {
		setPrioritiesPage.dragAndDropPriorities(prioritiesList);
		
	}

}
