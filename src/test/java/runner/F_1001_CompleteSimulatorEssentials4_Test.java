package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		//tags = {""},
		plugin = { "pretty", "html:target/html/1001_Complete_Simulator_Essentials4/",
			"json:target/json/1001_Complete_Simulator_Essentials4.json" }, 
		features = {"src/test/resources/cucumber/1001_Complete_Simulator_Essentials4.feature"},
		glue = {"/"},
		monochrome = true)
public class F_1001_CompleteSimulatorEssentials4_Test {
}