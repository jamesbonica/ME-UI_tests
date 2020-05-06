package runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//tags = {""},
	//	strict = true,
		plugin = { "pretty", "html:target/html/1001_Complete_Simulator_Essentials5/",
			"json:target/json/1001_Complete_Simulator_Essentials5.json" }, 
		features = {"src/test/resources/cucumber/1001_Complete_Simulator_Essentials5.feature"},
		glue = {"/"},
		monochrome = true)
public class F_1001_CompleteSimulatorEssentials5_Test {
}
