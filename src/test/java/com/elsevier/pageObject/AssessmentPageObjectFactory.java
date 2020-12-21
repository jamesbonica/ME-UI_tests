package com.elsevier.pageObject;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class AssessmentPageObjectFactory {

	@Autowired
	private ApplicationContext appContext;

	public YourLogoHomePage getYourLogoHomePage() {
		return (YourLogoHomePage) appContext.getBean("yourLogohomePage");
	}

	public ProductPage getProductPage() {
		return (ProductPage) appContext.getBean("productPage");
	}

	public LogInMyStorePage getLogInMyStorePage() {
		return (LogInMyStorePage) appContext.getBean("logInMyStorePage");
	}
}
