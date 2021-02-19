package runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//tags = {""},
		//strict = true,
		plugin = { "pretty", "html:target/html/automation_practice.html",
			"json:target/json/automation_practice.json" }, 
		features = {"src/test/resources/cucumber/automation_practice.feature"},
		glue = {"/"},
		monochrome = true)
public class F_0000_QA_Assessment_Test {
}
