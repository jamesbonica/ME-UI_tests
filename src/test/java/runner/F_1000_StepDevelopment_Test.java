package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		//tags = {""},
		plugin = { "pretty", "html:target/html/1000_Step_Development/",
			"json:target/json/1000_Step_Development.json" }, 
		features = {"src/test/resources/cucumber/1000_Step_Development.feature"},
		glue = {"/"},
		monochrome = true)
public class F_1000_StepDevelopment_Test {
}
