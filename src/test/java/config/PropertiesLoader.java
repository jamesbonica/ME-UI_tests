package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application-${spring.profiles.active}.properties")
public class PropertiesLoader {

	@Value("${test.url}")
	private String testUrl;

	@Value("${test.environment}")
	private String testEnvironment;

	@Value("${test.browser}")
	private String browser;

	@Value("${configured.user1}")
	private String configuredUser1;

	public String getTestUrl() {
		return testUrl;
	}

	public void setTestUrl(String testUrl) {
		this.testUrl = testUrl;
	}

	public String getTestEnvironment() {
		return testEnvironment;
	}

	public void setTestEnvironment(String testEnvironment) {
		this.testEnvironment = testEnvironment;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public void setConfiguredUserOne(String configuredUser1) {
		this.configuredUser1 = configuredUser1;
	}

	public String getConfiguredUserOne() {
		return configuredUser1;
	}

}
