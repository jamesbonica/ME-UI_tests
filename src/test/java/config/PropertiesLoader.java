package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application-${spring.profiles.active}.properties")
public class PropertiesLoader {

	@Value("${test.url}")
	private String testUrl;

	@Value("${test.api.url}")
	private String testApiUrl;

	@Value("${test.environment}")
	private String testEnvironment;

	@Value("${test.browser}")
	private String browser;

	@Value("${configured.user1}")
	private String configuredUser1;

	@Value("${configured.user1.password}")
	private String configuredUser1Password;

	@Value("${survey.question1}")
	private String surveyQuestion1;

	@Value("${survey.question2}")
	private String surveyQuestion2;

	@Value("${survey.question3}")
	private String surveyQuestion3;

	@Value("${survey.question4}")
	private String surveyQuestion4;;

	@Value("${survey.question5}")
	private String surveyQuestion5;

	@Value("${survey.question6}")
	private String surveyQuestion6;

	@Value("${survey.question7}")
	private String surveyQuestion7;

	@Value("${survey.question8}")
	private String surveyQuestion8;

	@Value("${survey.question9}")
	private String surveyQuestion9;

	@Value("${survey.question10}")
	private String surveyQuestion10;

	@Value("${pre.survey.answer1}")
	private String preSurveyAnswer1;

	@Value("${post.survey.answer1}")
	private String postSurveyAnswer1;

	@Value("${pre.survey.answer2}")
	private String preSurveyAnswer2;

	@Value("${post.survey.answer2}")
	private String postSurveyAnswer2;

	@Value("${pre.survey.answer3}")
	private String preSurveyAnswer3;

	@Value("${post.survey.answer3}")
	private String postSurveyAnswer3;

	@Value("${pre.survey.answer4}")
	private String preSurveyAnswer4;

	@Value("${post.survey.answer4}")
	private String postSurveyAnswer4;

	@Value("${pre.survey.answer5}")
	private String preSurveyAnswer5;

	@Value("${post.survey.answer5}")
	private String postSurveyAnswer5;

	@Value("${pre.survey.answer6}")
	private String preSurveyAnswer6;

	@Value("${post.survey.answer6}")
	private String postSurveyAnswer6;

	@Value("${pre.survey.answer7}")
	private String preSurveyAnswer7;

	@Value("${post.survey.answer7}")
	private String postSurveyAnswer7;

	@Value("${pre.survey.answer8}")
	private String preSurveyAnswer8;

	@Value("${post.survey.answer8}")
	private String postSurveyAnswer8;

	@Value("${pre.survey.answer9}")
	private String preSurveyAnswer9;

	@Value("${post.survey.answer9}")
	private String postSurveyAnswer9;

	@Value("${pre.survey.answer10}")
	private String preSurveyAnswer10;

	@Value("${post.survey.answer10}")
	private String postSurveyAnswer10;

	public String getTestUrl() {
		return testUrl;
	}

	public void setTestUrl(String testUrl) {
		this.testUrl = testUrl;
	}

	public String getTestApiUrl() {
		return testApiUrl;
	}

	public void setTestApiUrl(String testApiUrl) {
		this.testApiUrl = testApiUrl;
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

	public String getConfiguredUser1Password() {
		return configuredUser1Password;
	}

	public void setConfiguredUser1Password(String configuredUser1Password) {
		this.configuredUser1Password = configuredUser1Password;
	}

	public String getSurveyQuestion1() {
		return surveyQuestion1;
	}

	public void setSurveyQuestion1(String surveyQuestion1) {
		this.surveyQuestion1 = surveyQuestion1;
	}

	public String getSurveyQuestion2() {
		return surveyQuestion2;
	}

	public void setSurveyQuestion2(String surveyQuestion2) {
		this.surveyQuestion2 = surveyQuestion2;
	}

	public String getSurveyQuestion3() {
		return surveyQuestion3;
	}

	public void setSurveyQuestion3(String surveyQuestion3) {
		this.surveyQuestion3 = surveyQuestion3;
	}

	public String getSurveyQuestion4() {
		return surveyQuestion4;
	}

	public void setSurveyQuestion4(String surveyQuestion4) {
		this.surveyQuestion4 = surveyQuestion4;
	}

	public String getSurveyQuestion5() {
		return surveyQuestion5;
	}

	public void setSurveyQuestion5(String surveyQuestion5) {
		this.surveyQuestion5 = surveyQuestion5;
	}

	public String getSurveyQuestion6() {
		return surveyQuestion6;
	}

	public void setSurveyQuestion6(String surveyQuestion6) {
		this.surveyQuestion6 = surveyQuestion6;
	}

	public String getSurveyQuestion7() {
		return surveyQuestion7;
	}

	public void setSurveyQuestion7(String surveyQuestion7) {
		this.surveyQuestion7 = surveyQuestion7;
	}

	public String getSurveyQuestion8() {
		return surveyQuestion8;
	}

	public void setSurveyQuestion8(String surveyQuestion8) {
		this.surveyQuestion8 = surveyQuestion8;
	}

	public String getSurveyQuestion9() {
		return surveyQuestion9;
	}

	public void setSurveyQuestion9(String surveyQuestion9) {
		this.surveyQuestion9 = surveyQuestion9;
	}

	public String getSurveyQuestion10() {
		return surveyQuestion10;
	}

	public void setSurveyQuestion10(String surveyQuestion10) {
		this.surveyQuestion10 = surveyQuestion10;
	}

	public String getPreSurveyAnswer1() {
		return preSurveyAnswer1;
	}

	public void setPreSurveyAnswer1(String preSurveyAnswer1) {
		this.preSurveyAnswer1 = preSurveyAnswer1;
	}

	public String getPostSurveyAnswer1() {
		return postSurveyAnswer1;
	}

	public void setPostSurveyAnswer1(String postSurveyAnswer1) {
		this.postSurveyAnswer1 = postSurveyAnswer1;
	}

	public String getPreSurveyAnswer2() {
		return preSurveyAnswer2;
	}

	public void setPreSurveyAnswer2(String preSurveyAnswer2) {
		this.preSurveyAnswer2 = preSurveyAnswer2;
	}

	public String getPostSurveyAnswer2() {
		return postSurveyAnswer2;
	}

	public void setPostSurveyAnswer2(String postSurveyAnswer2) {
		this.postSurveyAnswer2 = postSurveyAnswer2;
	}

	public String getPreSurveyAnswer3() {
		return preSurveyAnswer3;
	}

	public void setPreSurveyAnswer3(String preSurveyAnswer3) {
		this.preSurveyAnswer3 = preSurveyAnswer3;
	}

	public String getPostSurveyAnswer3() {
		return postSurveyAnswer3;
	}

	public void setPostSurveyAnswer3(String postSurveyAnswer3) {
		this.postSurveyAnswer3 = postSurveyAnswer3;
	}

	public String getPreSurveyAnswer4() {
		return preSurveyAnswer4;
	}

	public void setPreSurveyAnswer4(String preSurveyAnswer4) {
		this.preSurveyAnswer4 = preSurveyAnswer4;
	}

	public String getPostSurveyAnswer4() {
		return postSurveyAnswer4;
	}

	public void setPostSurveyAnswer4(String postSurveyAnswer4) {
		this.postSurveyAnswer4 = postSurveyAnswer4;
	}

	public String getPreSurveyAnswer5() {
		return preSurveyAnswer5;
	}

	public void setPreSurveyAnswer5(String preSurveyAnswer5) {
		this.preSurveyAnswer5 = preSurveyAnswer5;
	}

	public String getPostSurveyAnswer5() {
		return postSurveyAnswer5;
	}

	public void setPostSurveyAnswer5(String postSurveyAnswer5) {
		this.postSurveyAnswer5 = postSurveyAnswer5;
	}

	public String getPreSurveyAnswer6() {
		return preSurveyAnswer6;
	}

	public void setPreSurveyAnswer6(String preSurveyAnswer6) {
		this.preSurveyAnswer6 = preSurveyAnswer6;
	}

	public String getPostSurveyAnswer6() {
		return postSurveyAnswer6;
	}

	public void setPostSurveyAnswer6(String postSurveyAnswer6) {
		this.postSurveyAnswer6 = postSurveyAnswer6;
	}

	public String getPreSurveyAnswer7() {
		return preSurveyAnswer7;
	}

	public void setPreSurveyAnswer7(String preSurveyAnswer7) {
		this.preSurveyAnswer7 = preSurveyAnswer7;
	}

	public String getPostSurveyAnswer7() {
		return postSurveyAnswer7;
	}

	public void setPostSurveyAnswer7(String postSurveyAnswer7) {
		this.postSurveyAnswer7 = postSurveyAnswer7;
	}

	public String getPreSurveyAnswer8() {
		return preSurveyAnswer8;
	}

	public void setPreSurveyAnswer8(String preSurveyAnswer8) {
		this.preSurveyAnswer8 = preSurveyAnswer8;
	}

	public String getPostSurveyAnswer8() {
		return postSurveyAnswer8;
	}

	public void setPostSurveyAnswer8(String postSurveyAnswer8) {
		this.postSurveyAnswer8 = postSurveyAnswer8;
	}

	public String getPreSurveyAnswer9() {
		return preSurveyAnswer9;
	}

	public void setPreSurveyAnswer9(String preSurveyAnswer9) {
		this.preSurveyAnswer9 = preSurveyAnswer9;
	}

	public String getPostSurveyAnswer9() {
		return postSurveyAnswer9;
	}

	public void setPostSurveyAnswer9(String postSurveyAnswer9) {
		this.postSurveyAnswer9 = postSurveyAnswer9;
	}

	public String getPreSurveyAnswer10() {
		return preSurveyAnswer10;
	}

	public void setPreSurveyAnswer10(String preSurveyAnswer10) {
		this.preSurveyAnswer10 = preSurveyAnswer10;
	}

	public String getPostSurveyAnswer10() {
		return postSurveyAnswer10;
	}

	public void setPostSurveyAnswer10(String postSurveyAnswer10) {
		this.postSurveyAnswer10 = postSurveyAnswer10;
	}

}
