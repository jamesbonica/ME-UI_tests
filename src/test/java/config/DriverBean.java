package config;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import config.PropertiesLoader;

import io.github.bonigarcia.wdm.WebDriverManager;

@Configuration
public class DriverBean {

	@Autowired
	PropertiesLoader propertiesLoader;

	final String recordScreenshotsProperty = "recordScreenshots";
	
	@Scope(SCOPE_CUCUMBER_GLUE)
	@Bean(name = "driver", destroyMethod = "quit")
	public EventFiringWebDriver getEventFiringWebDriver() throws Exception {
		
		System.out.println("In driver method");
		String sauceName = "";
		EventFiringWebDriver eventFiringWebDriver = null;
		WebDriver driver = null;
		String browser = propertiesLoader.getBrowser().toLowerCase();
		String testEnvironment = propertiesLoader.getTestEnvironment().toLowerCase();

		ChromeOptions chromeOptions = new ChromeOptions();
		FirefoxOptions firefoxOptions = new FirefoxOptions();

		DesiredCapabilities desiredCapabilities = null;

		switch (testEnvironment) {
		case "local":
			switch (browser) {
			case "firefox":
				System.out.println("Creating firefox local... ");
				WebDriverManager.firefoxdriver().setup();
				System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
				System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");

				driver = new FirefoxDriver(firefoxOptions);
				break;
			case "chrome":
				System.out.println("Creating chrome local... ");
				WebDriverManager.chromedriver().setup();
				// desiredCapabilities.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE,false);
				chromeOptions.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, false);
				chromeOptions.addArguments("--disable-features=VizDisplayCompositor");;
				driver = new ChromeDriver(chromeOptions); 

				break;
			case "edge":
				System.out.println("Edge Driver....");
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			}
			break;
		case "sauce":
			switch (browser) {
			case "firefox":
				sauceName = "firefox test";
				FirefoxProfile profile = new FirefoxProfile();
				profile.setPreference("security.insecure_field_warning.contextual.enabled", false);
				desiredCapabilities = DesiredCapabilities.firefox();
				desiredCapabilities.setCapability(FirefoxDriver.PROFILE, profile);
				break;
			case "chrome":
				sauceName = "chrome test";
			//	desiredCapabilities = DesiredCapabilities.chrome();
				chromeOptions.setCapability("browserName", "chrome");
				chromeOptions.setCapability("platform", "Windows 10");
				chromeOptions.setCapability("recordVideo", "false");
				chromeOptions.setCapability("recordScreenshots", "false");
				chromeOptions.setCapability("maxDuration", 3600);
				chromeOptions.setCapability("screenResolution", "1920x1080");
				chromeOptions.setCapability("name", sauceName);
	//			chromeOptions.setCapability("passed", true);;
				driver = new RemoteWebDriver(new URL(
						"https://jamesbonica:94d9e25b-9fee-4982-a3fa-fe8b1246ed44@ondemand.saucelabs.com:443/wd/hub"),
						chromeOptions);
				break;
			case "edge":

				break;
			}
//			desiredCapabilities.setCapability("platform", "Windows 10");
//			// desiredCapbilities.setCapability("version", "63.0");
//			desiredCapabilities.setCapability("recordVideo", "false");
//			desiredCapabilities.setCapability("recordScreenshots", "false");
//			desiredCapabilities.setCapability("maxDuration", 3600);
//			desiredCapabilities.setCapability("screenResolution", "1920x1080");
//			desiredCapabilities.setCapability("name", sauceName);
//			driver = new RemoteWebDriver(new URL(
//					"https://jamesbonica:94d9e25b-9fee-4982-a3fa-fe8b1246ed44@ondemand.saucelabs.com:443/wd/hub"),
//					desiredCapabilities);
//			break;
		}

		if (driver == null) {
			throw new Exception("Invalid driver entry in properties file");
		}
		eventFiringWebDriver = new EventFiringWebDriver(driver);
		Capabilities caps = eventFiringWebDriver.getCapabilities();
		System.out.println("Browser + version: " + caps.getBrowserName() + " " + caps.getVersion());
		return eventFiringWebDriver;
	}

}
