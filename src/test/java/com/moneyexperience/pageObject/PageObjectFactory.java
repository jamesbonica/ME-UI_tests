package com.moneyexperience.pageObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PageObjectFactory {

	@Autowired
	private ApplicationContext appContext;

	public LoginPage getLoginPage() {
		return (LoginPage) appContext.getBean("loginPage");
	}

	public SetPrioritiesPage getSetPrioritiesPage() {
		return (SetPrioritiesPage) appContext.getBean("setPrioritiesPage");
	}

	public ChatPage getChatPage() {
		return (ChatPage) appContext.getBean("chatPage");
		
	}

	public LessonIntroPage getLessonIntroPage() {
		return (LessonIntroPage) appContext.getBean("lessonIntroPage");
	}

	public LessonCheckpointPage getLessonCheckpointPage() {
		return (LessonCheckpointPage) appContext.getBean("lessonCheckpointPage");
	}
	
	public AssessmentPage getAssessmentPage() {
		return (AssessmentPage) appContext.getBean("assessmentPage");
	}
	
	

}
