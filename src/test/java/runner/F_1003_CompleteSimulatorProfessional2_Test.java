package runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//tags = {""},
	//	strict = true,
		plugin = { "pretty", "html:target/html/1003_Complete_Simulator_Professional2/",
			"json:target/json/1003_Complete_Simulator_Professional2.json" }, 
		features = {"src/test/resources/cucumber/1003_Complete_Simulator_Professional2.feature"},
		glue = {"/"},
		monochrome = true)
public class F_1003_CompleteSimulatorProfessional2_Test {
}
