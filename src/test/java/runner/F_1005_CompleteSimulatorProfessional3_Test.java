package runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//tags = {""},
	//	strict = true,
		plugin = { "pretty", "html:target/html/1005_Complete_Simulator_Professional3/",
			"json:target/json/1005_Complete_Simulator_Professional3.json" }, 
		features = {"src/test/resources/cucumber/1005_Complete_Simulator_Professional3.feature"},
		glue = {"/"},
		monochrome = true)
public class F_1005_CompleteSimulatorProfessional3_Test {
}
