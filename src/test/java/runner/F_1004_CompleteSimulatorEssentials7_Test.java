package runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//tags = {""},
	//	strict = true,
		plugin = { "pretty", "html:target/html/1004_Complete_Simulator_Essentials7/",
			"json:target/json/1004_Complete_Simulator_Essentials7.json" }, 
		features = {"src/test/resources/cucumber/1004_Complete_Simulator_Essentials7.feature"},
		glue = {"/"},
		monochrome = true)
public class F_1004_CompleteSimulatorEssentials7_Test {
}
