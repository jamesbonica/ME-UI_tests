package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		//tags = {""},
		plugin = { "pretty", "html:target/html/1000_User_Login/",
			"json:target/json/1000_User_Login.json" }, 
		features = {"src/test/resources/cucumber/1000_User_Login.feature"},
		glue = {"/"},
		monochrome = true)
public class F_1000_UserLogin_Test {
}
