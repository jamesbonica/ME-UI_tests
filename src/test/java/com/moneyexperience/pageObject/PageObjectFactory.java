package com.moneyexperience.pageObject;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
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

	public StoryBoardPage getStoryBoardPage() {
		return (StoryBoardPage) appContext.getBean("storyBoardPage");
	}

	public UserMenuPage getUserMenuPage() {
		return (UserMenuPage) appContext.getBean("userMenuPage");
	}

	public ConfirmPrioritiesPage getConfirmPrioritiesPage() {
		return (ConfirmPrioritiesPage) appContext.getBean("confirmPrioritiesPage");
	}

	public AssessmentV2Page getAssessmentV2Page() {
		return (AssessmentV2Page) appContext.getBean("assessmentV2Page");
	}

	public InventoryPage getInventoryPage() {
		return (InventoryPage) appContext.getBean("inventoryPage");
	}

	public DashboardPage getDashboardPage() {
		return (DashboardPage) appContext.getBean("dashboardPage");
	}

	public WildcardPage getWildcardPage() {
		return (WildcardPage) appContext.getBean("wildcardPage");
	}

}
