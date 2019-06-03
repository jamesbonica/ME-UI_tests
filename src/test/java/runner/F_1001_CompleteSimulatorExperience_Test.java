package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		//tags = {""},
		plugin = { "pretty", "html:target/html/1001_Complete_Simulator_Experience/",
			"json:target/json/1001_Complete_Simulator_Experience.json" }, 
		features = {"src/test/resources/cucumber/1001_Complete_Simulator_Experience.feature"},
		glue = {"/"},
		monochrome = true)
public class F_1001_CompleteSimulatorExperience_Test {
}
