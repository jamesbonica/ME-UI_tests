package config;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import io.cucumber.java.Scenario;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

/**
 * 
 * @author jimbonica
 *
 * @date Apr-09-2019
 */

@Configuration
@Scope(SCOPE_CUCUMBER_GLUE)
public class ScenarioSession {

	@Autowired
	EventFiringWebDriver driver;

	private Scenario scenario;
	
	private String storyBoardSrc;
	
	private String userForScenario;

	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}

	public Scenario getScenario() {
		return scenario;
	}

	public void takeScreenShot(String name) {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png", name); // stick it in the report

	}

	public void writeToReport(String s) {
		scenario.write(s);
	}

	public String getStoryBoardSrc() {
		return storyBoardSrc;
	}

	public void setStoryBoardSrc(String storyBoardSrc) {
		this.storyBoardSrc = storyBoardSrc;
	}

	public String getUserForScenario() {
		return userForScenario;
	}

	public void setUserForScenario(String userForScenario) {
		this.userForScenario = userForScenario;
	}

}
