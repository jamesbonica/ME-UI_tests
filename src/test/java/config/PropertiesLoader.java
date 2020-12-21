package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application-${spring.profiles.active}.properties")
public class PropertiesLoader {

	@Value("${assessment.test.url}")
	private String assessmentTestUrl;
	
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
	
	@Value("${survey.question1.type}")
	private String surveyQuestion1Type;

	@Value("${survey.question2}")
	private String surveyQuestion2;
	
	@Value("${survey.question2.type}")
	private String surveyQuestion2Type;

	@Value("${survey.question3}")
	private String surveyQuestion3;
	
	@Value("${survey.question3.type}")
	private String surveyQuestion3Type;

	@Value("${survey.question4}")
	private String surveyQuestion4;
	
	@Value("${survey.question4.type}")
	private String surveyQuestion4Type;

	@Value("${survey.question5}")
	private String surveyQuestion5;
	
	@Value("${survey.question5.type}")
	private String surveyQuestion5Type;

	@Value("${survey.question6}")
	private String surveyQuestion6;
	
	@Value("${survey.question6.type}")
	private String surveyQuestion6Type;

	@Value("${survey.question7}")
	private String surveyQuestion7;
	
	@Value("${survey.question7.type}")
	private String surveyQuestion7Type;

	@Value("${survey.question8}")
	private String surveyQuestion8;
	
	@Value("${survey.question8.type}")
	private String surveyQuestion8Type;

	@Value("${survey.question9}")
	private String surveyQuestion9;
	
	@Value("${survey.question9.type}")
	private String surveyQuestion9Type;

	@Value("${survey.question10}")
	private String surveyQuestion10;

	@Value("${survey.question10.type}")
	private String surveyQuestion10Type;
	
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

	@Value("${survey.v2.question1}")
	private String surveyV2Question1;
	
	@Value("${survey.v2.question1.type}")
	private String surveyV2Question1Type;

	@Value("${survey.v2.question2}")
	private String surveyV2Question2;
	
	@Value("${survey.v2.question2.type}")
	private String surveyV2Question2Type;

	@Value("${survey.v2.question3}")
	private String surveyV2Question3;
	
	@Value("${survey.v2.question3.type}")
	private String surveyV2Question3Type;

	@Value("${survey.v2.question4}")
	private String surveyV2Question4;
	
	@Value("${survey.v2.question4.type}")
	private String surveyV2Question4Type;

	@Value("${survey.v2.question5}")
	private String surveyV2Question5;
	
	@Value("${survey.v2.question5.type}")
	private String surveyV2Question5Type;

	@Value("${survey.v2.question6}")
	private String surveyV2Question6;
	
	@Value("${survey.v2.question6.type}")
	private String surveyV2Question6Type;

	@Value("${survey.v2.question7}")
	private String surveyV2Question7;
	
	@Value("${survey.v2.question7.type}")
	private String surveyV2Question7Type;

	@Value("${survey.v2.question8}")
	private String surveyV2Question8;
	
	@Value("${survey.v2.question8.type}")
	private String surveyV2Question8Type;

	@Value("${survey.v2.question9}")
	private String surveyV2Question9;
	
	@Value("${survey.v2.question9.type}")
	private String surveyV2Question9Type;
	
	@Value("${survey.v2.question10}")
	private String surveyV2Question10;
	
	@Value("${survey.v2.question10.type}")
	private String surveyV2Question10Type;
	
	@Value("${survey.v2.question11}")
	private String surveyV2Question11;
	
	@Value("${survey.v2.question11.type}")
	private String surveyV2Question11Type;
	
	@Value("${survey.v2.question12}")
	private String surveyV2Question12;
	
	@Value("${survey.v2.question12.type}")
	private String surveyV2Question12Type;
	
	@Value("${survey.v2.question13}")
	private String surveyV2Question13;
	
	@Value("${survey.v2.question13.type}")
	private String surveyV2Question13Type;
	
	@Value("${survey.v2.question14}")
	private String surveyV2Question14;
	
	@Value("${survey.v2.question14.type}")
	private String surveyV2Question14Type;
	
	@Value("${survey.v2.question15}")
	private String surveyV2Question15;
	
	@Value("${survey.v2.question15.type}")
	private String surveyV2Question15Type;
	
	@Value("${survey.v2.question16}")
	private String surveyV2Question16;
	
	@Value("${survey.v2.question16.type}")
	private String surveyV2Question16Type;
	
	@Value("${survey.v2.question17}")
	private String surveyV2Question17;
	
	@Value("${survey.v2.question17.type}")
	private String surveyV2Question17Type;
	
	@Value("${survey.v2.question18}")
	private String surveyV2Question18;
	
	@Value("${survey.v2.question18.type}")
	private String surveyV2Question18Type;
	
	@Value("${survey.v2.question19}")
	private String surveyV2Question19;
	
	@Value("${survey.v2.question19.type}")
	private String surveyV2Question19Type;
	
	@Value("${survey.v2.question20}")
	private String surveyV2Question20;
	
	@Value("${survey.v2.question20.type}")
	private String surveyV2Question20Type;
	
	@Value("${survey.v2.question21}")
	private String surveyV2Question21;
	
	@Value("${survey.v2.question21.type}")
	private String surveyV2Question21Type;
	
	@Value("${survey.v2.question22}")
	private String surveyV2Question22;
	
	@Value("${survey.v2.question22.type}")
	private String surveyV2Question22Type;
	
	@Value("${survey.v2.question23}")
	private String surveyV2Question23;
	
	@Value("${survey.v2.question23.type}")
	private String surveyV2Question23Type;
	
	@Value("${survey.v2.question24}")
	private String surveyV2Question24;
	
	@Value("${survey.v2.question24.type}")
	private String surveyV2Question24Type;
	
	@Value("${pre.survey.v2.answer1}")
	private String preSurveyV2Answer1;

	@Value("${post.survey.v2.answer1}")
	private String postSurveyV2Answer1;

	@Value("${pre.survey.v2.answer2}")
	private String preSurveyV2Answer2;

	@Value("${post.survey.v2.answer2}")
	private String postSurveyV2Answer2;

	@Value("${pre.survey.v2.answer3}")
	private String preSurveyV2Answer3;

	@Value("${post.survey.v2.answer3}")
	private String postSurveyV2Answer3;

	@Value("${pre.survey.v2.answer4}")
	private String preSurveyV2Answer4;

	@Value("${post.survey.v2.answer4}")
	private String postSurveyV2Answer4;

	@Value("${pre.survey.v2.answer5}")
	private String preSurveyV2Answer5;

	@Value("${post.survey.v2.answer5}")
	private String postSurveyV2Answer5;

	@Value("${pre.survey.v2.answer6}")
	private String preSurveyV2Answer6;

	@Value("${post.survey.v2.answer6}")
	private String postSurveyV2Answer6;

	@Value("${pre.survey.v2.answer7}")
	private String preSurveyV2Answer7;

	@Value("${post.survey.v2.answer7}")
	private String postSurveyV2Answer7;

	@Value("${pre.survey.v2.answer8}")
	private String preSurveyV2Answer8;

	@Value("${post.survey.v2.answer8}")
	private String postSurveyV2Answer8;

	@Value("${pre.survey.v2.answer9}")
	private String preSurveyV2Answer9;

	@Value("${post.survey.v2.answer9}")
	private String postSurveyV2Answer9;
	
	@Value("${pre.survey.v2.answer10}")
	private String preSurveyV2Answer10;

	@Value("${post.survey.v2.answer10}")
	private String postSurveyV2Answer10;
	@Value("${pre.survey.v2.answer11}")
	private String preSurveyV2Answer11;

	@Value("${post.survey.v2.answer11}")
	private String postSurveyV2Answer11;
	
	@Value("${pre.survey.v2.answer12}")
	private String preSurveyV2Answer12;

	@Value("${post.survey.v2.answer12}")
	private String postSurveyV2Answer12;
	
	@Value("${pre.survey.v2.answer13}")
	private String preSurveyV2Answer13;

	@Value("${post.survey.v2.answer13}")
	private String postSurveyV2Answer13;
	
	@Value("${pre.survey.v2.answer14}")
	private String preSurveyV2Answer14;

	@Value("${post.survey.v2.answer14}")
	private String postSurveyV2Answer14;
	
	@Value("${pre.survey.v2.answer15}")
	private String preSurveyV2Answer15;

	@Value("${post.survey.v2.answer15}")
	private String postSurveyV2Answer15;
	
	@Value("${pre.survey.v2.answer16}")
	private String preSurveyV2Answer16;

	@Value("${post.survey.v2.answer16}")
	private String postSurveyV2Answer16;
	
	@Value("${pre.survey.v2.answer17}")
	private String preSurveyV2Answer17;

	@Value("${post.survey.v2.answer17}")
	private String postSurveyV2Answer17;
	
	@Value("${pre.survey.v2.answer18}")
	private String preSurveyV2Answer18;

	@Value("${post.survey.v2.answer18}")
	private String postSurveyV2Answer18;
	
	@Value("${pre.survey.v2.answer19}")
	private String preSurveyV2Answer19;

	@Value("${post.survey.v2.answer19}")
	private String postSurveyV2Answer19;
	
	@Value("${pre.survey.v2.answer20}")
	private String preSurveyV2Answer20;

	@Value("${post.survey.v2.answer20}")
	private String postSurveyV2Answer20;
	
	@Value("${pre.survey.v2.answer21}")
	private String preSurveyV2Answer21;

	@Value("${post.survey.v2.answer21}")
	private String postSurveyV2Answer21;
	
	@Value("${pre.survey.v2.answer22")
	private String preSurveyV2Answer22;

	@Value("${post.survey.v2.answer22}")
	private String postSurveyV2Answer22;
	
	@Value("${pre.survey.v2.answer23}")
	private String preSurveyV2Answer23;

	@Value("${post.survey.v2.answer23}")
	private String postSurveyV2Answer23;
	
	@Value("${pre.survey.v2.answer24}")
	private String preSurveyV2Answer24;

	@Value("${post.survey.v2.answer24}")
	private String postSurveyV2Answer24;

	public String getAssessmentTestUrl() {
		return assessmentTestUrl;
	}

	public void setAssessmentTestUrl(String assessmentTestUrl) {
		this.assessmentTestUrl = assessmentTestUrl;
	}
	
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

	public String getSurveyV2Question1() {
		return surveyV2Question1;
	}

	public void setSurveyV2Question1(String surveyV2Question1) {
		this.surveyV2Question1 = surveyV2Question1;
	}

	public String getSurveyV2Question2() {
		return surveyV2Question2;
	}

	public void setSurveyV2Question2(String surveyV2Question2) {
		this.surveyV2Question2 = surveyV2Question2;
	}

	public String getSurveyV2Question3() {
		return surveyV2Question3;
	}

	public void setSurveyV2Question3(String surveyV2Question3) {
		this.surveyV2Question3 = surveyV2Question3;
	}

	public String getSurveyV2Question4() {
		return surveyV2Question4;
	}

	public void setSurveyV2Question4(String surveyV2Question4) {
		this.surveyV2Question4 = surveyV2Question4;
	}

	public String getSurveyV2Question5() {
		return surveyV2Question5;
	}

	public void setSurveyV2Question5(String surveyV2Question5) {
		this.surveyV2Question5 = surveyV2Question5;
	}

	public String getSurveyV2Question6() {
		return surveyV2Question6;
	}

	public void setSurveyV2Question6(String surveyV2Question6) {
		this.surveyV2Question6 = surveyV2Question6;
	}

	public String getSurveyV2Question7() {
		return surveyV2Question7;
	}

	public void setSurveyV2Question7(String surveyV2Question7) {
		this.surveyV2Question7 = surveyV2Question7;
	}

	public String getSurveyV2Question8() {
		return surveyV2Question8;
	}

	public void setSurveyV2Question8(String surveyV2Question8) {
		this.surveyV2Question8 = surveyV2Question8;
	}

	public String getSurveyV2Question9() {
		return surveyV2Question9;
	}

	public void setSurveyV2Question9(String surveyV2Question9) {
		this.surveyV2Question9 = surveyV2Question9;
	}
	
	public String getSurveyV2Question10() {
		return surveyV2Question10;
	}

	public void setSurveyV2Question10(String surveyV2Question10) {
		this.surveyV2Question10 = surveyV2Question10;
	}

	public String getPreSurveyV2Answer1() {
		return preSurveyV2Answer1;
	}

	public void setPreSurveyV2Answer1(String preSurveyV2Answer1) {
		this.preSurveyV2Answer1 = preSurveyV2Answer1;
	}

	public String getPostSurveyV2Answer1() {
		return postSurveyV2Answer1;
	}

	public void setPostSurveyV2Answer1(String postSurveyV2Answer1) {
		this.postSurveyV2Answer1 = postSurveyV2Answer1;
	}

	public String getPreSurveyV2Answer2() {
		return preSurveyV2Answer2;
	}

	public void setPreSurveyV2Answer2(String preSurveyV2Answer2) {
		this.preSurveyV2Answer2 = preSurveyV2Answer2;
	}

	public String getPostSurveyV2Answer2() {
		return postSurveyV2Answer2;
	}

	public void setPostSurveyV2Answer2(String postSurveyV2Answer2) {
		this.postSurveyV2Answer2 = postSurveyV2Answer2;
	}

	public String getPreSurveyV2Answer3() {
		return preSurveyV2Answer3;
	}

	public void setPreSurveyV2Answer3(String preSurveyV2Answer3) {
		this.preSurveyV2Answer3 = preSurveyV2Answer3;
	}

	public String getPostSurveyV2Answer3() {
		return postSurveyV2Answer3;
	}

	public void setPostSurveyV2Answer3(String postSurveyV2Answer3) {
		this.postSurveyV2Answer3 = postSurveyV2Answer3;
	}

	public String getPreSurveyV2Answer4() {
		return preSurveyV2Answer4;
	}

	public void setPreSurveyV2Answer4(String preSurveyV2Answer4) {
		this.preSurveyV2Answer4 = preSurveyV2Answer4;
	}

	public String getPostSurveyV2Answer4() {
		return postSurveyV2Answer4;
	}

	public void setPostSurveyV2Answer4(String postSurveyV2Answer4) {
		this.postSurveyV2Answer4 = postSurveyV2Answer4;
	}

	public String getPreSurveyV2Answer5() {
		return preSurveyV2Answer5;
	}

	public void setPreSurveyV2Answer5(String preSurveyV2Answer5) {
		this.preSurveyV2Answer5 = preSurveyV2Answer5;
	}

	public String getPostSurveyV2Answer5() {
		return postSurveyV2Answer5;
	}

	public void setPostSurveyV2Answer5(String postSurveyV2Answer5) {
		this.postSurveyV2Answer5 = postSurveyV2Answer5;
	}

	public String getPreSurveyV2Answer6() {
		return preSurveyV2Answer6;
	}

	public void setPreSurveyV2Answer6(String preSurveyV2Answer6) {
		this.preSurveyV2Answer6 = preSurveyV2Answer6;
	}

	public String getPostSurveyV2Answer6() {
		return postSurveyV2Answer6;
	}

	public void setPostSurveyV2Answer6(String postSurveyV2Answer6) {
		this.postSurveyV2Answer6 = postSurveyV2Answer6;
	}

	public String getPreSurveyV2Answer7() {
		return preSurveyV2Answer7;
	}

	public void setPreSurveyV2Answer7(String preSurveyV2Answer7) {
		this.preSurveyV2Answer7 = preSurveyV2Answer7;
	}

	public String getPostSurveyV2Answer7() {
		return postSurveyV2Answer7;
	}

	public void setPostSurveyV2Answer7(String postSurveyV2Answer7) {
		this.postSurveyV2Answer7 = postSurveyV2Answer7;
	}

	public String getPreSurveyV2Answer8() {
		return preSurveyV2Answer8;
	}

	public void setPreSurveyV2Answer8(String preSurveyV2Answer8) {
		this.preSurveyV2Answer8 = preSurveyV2Answer8;
	}

	public String getPostSurveyV2Answer8() {
		return postSurveyV2Answer8;
	}

	public void setPostSurveyV2Answer8(String postSurveyV2Answer8) {
		this.postSurveyV2Answer8 = postSurveyV2Answer8;
	}

	public String getPreSurveyV2Answer9() {
		return preSurveyV2Answer9;
	}

	public void setPreSurveyV2Answer9(String preSurveyV2Answer9) {
		this.preSurveyV2Answer9 = preSurveyV2Answer9;
	}

	public String getPostSurveyV2Answer9() {
		return postSurveyV2Answer9;
	}

	public void setPostSurveyV2Answer9(String postSurveyV2Answer9) {
		this.postSurveyV2Answer9 = postSurveyV2Answer9;
	}
	
	public String getPreSurveyV2Answer10() {
		return preSurveyV2Answer10;
	}

	public void setPreSurveyV2Answer10(String preSurveyV2Answer10) {
		this.preSurveyV2Answer10 = preSurveyV2Answer10;
	}

	public String getPostSurveyV2Answer11() {
		return postSurveyV2Answer11;
	}

	public void setPostSurveyV2Answer11(String postSurveyV2Answer11) {
		this.postSurveyV2Answer11 = postSurveyV2Answer11;
	}
	
	public String getPostSurveyV2Answer12() {
		return postSurveyV2Answer12;
	}

	public void setPostSurveyV2Answer12(String postSurveyV2Answer12) {
		this.postSurveyV2Answer12 = postSurveyV2Answer12;
	}
	public String getPostSurveyV2Answer13() {
		return postSurveyV2Answer13;
	}

	public void setPostSurveyV2Answer13(String postSurveyV2Answer13) {
		this.postSurveyV2Answer13 = postSurveyV2Answer13;
	}
	public String getPostSurveyV2Answer14() {
		return postSurveyV2Answer14;
	}

	public void setPostSurveyV2Answer14(String postSurveyV2Answer14) {
		this.postSurveyV2Answer14 = postSurveyV2Answer14;
	}

	public String getSurveyQuestion1Type() {
		return surveyQuestion1Type;
	}

	public void setSurveyQuestion1Type(String surveyQuestion1Type) {
		this.surveyQuestion1Type = surveyQuestion1Type;
	}

	public String getSurveyQuestion2Type() {
		return surveyQuestion2Type;
	}

	public void setSurveyQuestion2Type(String surveyQuestion2Type) {
		this.surveyQuestion2Type = surveyQuestion2Type;
	}

	public String getSurveyQuestion3Type() {
		return surveyQuestion3Type;
	}

	public void setSurveyQuestion3Type(String surveyQuestion3Type) {
		this.surveyQuestion3Type = surveyQuestion3Type;
	}

	public String getSurveyQuestion4Type() {
		return surveyQuestion4Type;
	}

	public void setSurveyQuestion4Type(String surveyQuestion4Type) {
		this.surveyQuestion4Type = surveyQuestion4Type;
	}

	public String getSurveyQuestion5Type() {
		return surveyQuestion5Type;
	}

	public void setSurveyQuestion5Type(String surveyQuestion5Type) {
		this.surveyQuestion5Type = surveyQuestion5Type;
	}

	public String getSurveyQuestion6Type() {
		return surveyQuestion6Type;
	}

	public void setSurveyQuestion6Type(String surveyQuestion6Type) {
		this.surveyQuestion6Type = surveyQuestion6Type;
	}

	public String getSurveyQuestion7Type() {
		return surveyQuestion7Type;
	}

	public void setSurveyQuestion7Type(String surveyQuestion7Type) {
		this.surveyQuestion7Type = surveyQuestion7Type;
	}

	public String getSurveyQuestion8Type() {
		return surveyQuestion8Type;
	}

	public void setSurveyQuestion8Type(String surveyQuestion8Type) {
		this.surveyQuestion8Type = surveyQuestion8Type;
	}

	public String getSurveyQuestion9Type() {
		return surveyQuestion9Type;
	}

	public void setSurveyQuestion9Type(String surveyQuestion9Type) {
		this.surveyQuestion9Type = surveyQuestion9Type;
	}

	public String getSurveyQuestion10Type() {
		return surveyQuestion10Type;
	}

	public void setSurveyQuestion10Type(String surveyQuestion10Type) {
		this.surveyQuestion10Type = surveyQuestion10Type;
	}

	public String getSurveyV2Question1Type() {
		return surveyV2Question1Type;
	}

	public void setSurveyV2Question1Type(String surveyV2Question1Type) {
		this.surveyV2Question1Type = surveyV2Question1Type;
	}

	public String getSurveyV2Question2Type() {
		return surveyV2Question2Type;
	}

	public void setSurveyV2Question2Type(String surveyV2Question2Type) {
		this.surveyV2Question2Type = surveyV2Question2Type;
	}

	public String getSurveyV2Question3Type() {
		return surveyV2Question3Type;
	}

	public void setSurveyV2Question3Type(String surveyV2Question3Type) {
		this.surveyV2Question3Type = surveyV2Question3Type;
	}

	public String getSurveyV2Question4Type() {
		return surveyV2Question4Type;
	}

	public void setSurveyV2Question4Type(String surveyV2Question4Type) {
		this.surveyV2Question4Type = surveyV2Question4Type;
	}

	public String getSurveyV2Question5Type() {
		return surveyV2Question5Type;
	}

	public void setSurveyV2Question5Type(String surveyV2Question5Type) {
		this.surveyV2Question5Type = surveyV2Question5Type;
	}

	public String getSurveyV2Question6Type() {
		return surveyV2Question6Type;
	}

	public void setSurveyV2Question6Type(String surveyV2Question6Type) {
		this.surveyV2Question6Type = surveyV2Question6Type;
	}

	public String getSurveyV2Question7Type() {
		return surveyV2Question7Type;
	}

	public void setSurveyV2Question7Type(String surveyV2Question7Type) {
		this.surveyV2Question7Type = surveyV2Question7Type;
	}

	public String getSurveyV2Question8Type() {
		return surveyV2Question8Type;
	}

	public void setSurveyV2Question8Type(String surveyV2Question8Type) {
		this.surveyV2Question8Type = surveyV2Question8Type;
	}

	public String getSurveyV2Question9Type() {
		return surveyV2Question9Type;
	}

	public void setSurveyV2Question9Type(String surveyV2Question9Type) {
		this.surveyV2Question9Type = surveyV2Question9Type;
	}

	public String getSurveyV2Question10Type() {
		return surveyV2Question10Type;
	}

	public void setSurveyV2Question10Type(String surveyV2Question10Type) {
		this.surveyV2Question10Type = surveyV2Question10Type;
	}

	public String getSurveyV2Question11() {
		return surveyV2Question11;
	}

	public void setSurveyV2Question11(String surveyV2Question11) {
		this.surveyV2Question11 = surveyV2Question11;
	}

	public String getSurveyV2Question11Type() {
		return surveyV2Question11Type;
	}

	public void setSurveyV2Question11Type(String surveyV2Question11Type) {
		this.surveyV2Question11Type = surveyV2Question11Type;
	}

	public String getSurveyV2Question12() {
		return surveyV2Question12;
	}

	public void setSurveyV2Question12(String surveyV2Question12) {
		this.surveyV2Question12 = surveyV2Question12;
	}

	public String getSurveyV2Question12Type() {
		return surveyV2Question12Type;
	}

	public void setSurveyV2Question12Type(String surveyV2Question12Type) {
		this.surveyV2Question12Type = surveyV2Question12Type;
	}

	public String getSurveyV2Question13() {
		return surveyV2Question13;
	}

	public void setSurveyV2Question13(String surveyV2Question13) {
		this.surveyV2Question13 = surveyV2Question13;
	}

	public String getSurveyV2Question13Type() {
		return surveyV2Question13Type;
	}

	public void setSurveyV2Question13Type(String surveyV2Question13Type) {
		this.surveyV2Question13Type = surveyV2Question13Type;
	}

	public String getSurveyV2Question14() {
		return surveyV2Question14;
	}

	public void setSurveyV2Question14(String surveyV2Question14) {
		this.surveyV2Question14 = surveyV2Question14;
	}

	public String getSurveyV2Question14Type() {
		return surveyV2Question14Type;
	}

	public void setSurveyV2Question14Type(String surveyV2Question14Type) {
		this.surveyV2Question14Type = surveyV2Question14Type;
	}

	public String getSurveyV2Question15() {
		return surveyV2Question15;
	}

	public void setSurveyV2Question15(String surveyV2Question15) {
		this.surveyV2Question15 = surveyV2Question15;
	}

	public String getSurveyV2Question15Type() {
		return surveyV2Question15Type;
	}

	public void setSurveyV2Question15Type(String surveyV2Question15Type) {
		this.surveyV2Question15Type = surveyV2Question15Type;
	}

	public String getSurveyV2Question16() {
		return surveyV2Question16;
	}

	public void setSurveyV2Question16(String surveyV2Question16) {
		this.surveyV2Question16 = surveyV2Question16;
	}

	public String getSurveyV2Question16Type() {
		return surveyV2Question16Type;
	}

	public void setSurveyV2Question16Type(String surveyV2Question16Type) {
		this.surveyV2Question16Type = surveyV2Question16Type;
	}

	public String getSurveyV2Question17() {
		return surveyV2Question17;
	}

	public void setSurveyV2Question17(String surveyV2Question17) {
		this.surveyV2Question17 = surveyV2Question17;
	}

	public String getSurveyV2Question17Type() {
		return surveyV2Question17Type;
	}

	public void setSurveyV2Question17Type(String surveyV2Question17Type) {
		this.surveyV2Question17Type = surveyV2Question17Type;
	}

	public String getSurveyV2Question18() {
		return surveyV2Question18;
	}

	public void setSurveyV2Question18(String surveyV2Question18) {
		this.surveyV2Question18 = surveyV2Question18;
	}

	public String getSurveyV2Question18Type() {
		return surveyV2Question18Type;
	}

	public void setSurveyV2Question18Type(String surveyV2Question18Type) {
		this.surveyV2Question18Type = surveyV2Question18Type;
	}

	public String getSurveyV2Question19() {
		return surveyV2Question19;
	}

	public void setSurveyV2Question19(String surveyV2Question19) {
		this.surveyV2Question19 = surveyV2Question19;
	}

	public String getSurveyV2Question19Type() {
		return surveyV2Question19Type;
	}

	public void setSurveyV2Question19Type(String surveyV2Question19Type) {
		this.surveyV2Question19Type = surveyV2Question19Type;
	}

	public String getSurveyV2Question20() {
		return surveyV2Question20;
	}

	public void setSurveyV2Question20(String surveyV2Question20) {
		this.surveyV2Question20 = surveyV2Question20;
	}

	public String getSurveyV2Question20Type() {
		return surveyV2Question20Type;
	}

	public void setSurveyV2Question20Type(String surveyV2Question20Type) {
		this.surveyV2Question20Type = surveyV2Question20Type;
	}

	public String getSurveyV2Question21() {
		return surveyV2Question21;
	}

	public void setSurveyV2Question21(String surveyV2Question21) {
		this.surveyV2Question21 = surveyV2Question21;
	}

	public String getSurveyV2Question21Type() {
		return surveyV2Question21Type;
	}

	public void setSurveyV2Question21Type(String surveyV2Question21Type) {
		this.surveyV2Question21Type = surveyV2Question21Type;
	}

	public String getPostSurveyV2Answer10() {
		return postSurveyV2Answer10;
	}

	public void setPostSurveyV2Answer10(String postSurveyV2Answer10) {
		this.postSurveyV2Answer10 = postSurveyV2Answer10;
	}

	public String getPreSurveyV2Answer11() {
		return preSurveyV2Answer11;
	}

	public void setPreSurveyV2Answer11(String preSurveyV2Answer11) {
		this.preSurveyV2Answer11 = preSurveyV2Answer11;
	}

	public String getPreSurveyV2Answer12() {
		return preSurveyV2Answer12;
	}

	public void setPreSurveyV2Answer12(String preSurveyV2Answer12) {
		this.preSurveyV2Answer12 = preSurveyV2Answer12;
	}

	public String getPreSurveyV2Answer13() {
		return preSurveyV2Answer13;
	}

	public void setPreSurveyV2Answer13(String preSurveyV2Answer13) {
		this.preSurveyV2Answer13 = preSurveyV2Answer13;
	}

	public String getPreSurveyV2Answer14() {
		return preSurveyV2Answer14;
	}

	public void setPreSurveyV2Answer14(String preSurveyV2Answer14) {
		this.preSurveyV2Answer14 = preSurveyV2Answer14;
	}

	public String getPreSurveyV2Answer15() {
		return preSurveyV2Answer15;
	}

	public void setPreSurveyV2Answer15(String preSurveyV2Answer15) {
		this.preSurveyV2Answer15 = preSurveyV2Answer15;
	}

	public String getPostSurveyV2Answer15() {
		return postSurveyV2Answer15;
	}

	public void setPostSurveyV2Answer15(String postSurveyV2Answer15) {
		this.postSurveyV2Answer15 = postSurveyV2Answer15;
	}

	public String getPreSurveyV2Answer16() {
		return preSurveyV2Answer16;
	}

	public void setPreSurveyV2Answer16(String preSurveyV2Answer16) {
		this.preSurveyV2Answer16 = preSurveyV2Answer16;
	}

	public String getPostSurveyV2Answer16() {
		return postSurveyV2Answer16;
	}

	public void setPostSurveyV2Answer16(String postSurveyV2Answer16) {
		this.postSurveyV2Answer16 = postSurveyV2Answer16;
	}

	public String getPreSurveyV2Answer17() {
		return preSurveyV2Answer17;
	}

	public void setPreSurveyV2Answer17(String preSurveyV2Answer17) {
		this.preSurveyV2Answer17 = preSurveyV2Answer17;
	}

	public String getPostSurveyV2Answer17() {
		return postSurveyV2Answer17;
	}

	public void setPostSurveyV2Answer17(String postSurveyV2Answer17) {
		this.postSurveyV2Answer17 = postSurveyV2Answer17;
	}

	public String getPreSurveyV2Answer18() {
		return preSurveyV2Answer18;
	}

	public void setPreSurveyV2Answer18(String preSurveyV2Answer18) {
		this.preSurveyV2Answer18 = preSurveyV2Answer18;
	}

	public String getPostSurveyV2Answer18() {
		return postSurveyV2Answer18;
	}

	public void setPostSurveyV2Answer18(String postSurveyV2Answer18) {
		this.postSurveyV2Answer18 = postSurveyV2Answer18;
	}

	public String getPreSurveyV2Answer19() {
		return preSurveyV2Answer19;
	}

	public void setPreSurveyV2Answer19(String preSurveyV2Answer19) {
		this.preSurveyV2Answer19 = preSurveyV2Answer19;
	}

	public String getPostSurveyV2Answer19() {
		return postSurveyV2Answer19;
	}

	public void setPostSurveyV2Answer19(String postSurveyV2Answer19) {
		this.postSurveyV2Answer19 = postSurveyV2Answer19;
	}

	public String getPreSurveyV2Answer20() {
		return preSurveyV2Answer20;
	}

	public void setPreSurveyV2Answer20(String preSurveyV2Answer20) {
		this.preSurveyV2Answer20 = preSurveyV2Answer20;
	}

	public String getPostSurveyV2Answer20() {
		return postSurveyV2Answer20;
	}

	public void setPostSurveyV2Answer20(String postSurveyV2Answer20) {
		this.postSurveyV2Answer20 = postSurveyV2Answer20;
	}

	public String getPreSurveyV2Answer21() {
		return preSurveyV2Answer21;
	}

	public void setPreSurveyV2Answer21(String preSurveyV2Answer21) {
		this.preSurveyV2Answer21 = preSurveyV2Answer21;
	}

	public String getPostSurveyV2Answer21() {
		return postSurveyV2Answer21;
	}

	public void setPostSurveyV2Answer21(String postSurveyV2Answer21) {
		this.postSurveyV2Answer21 = postSurveyV2Answer21;
	}

	public String getSurveyV2Question22() {
		return surveyV2Question22;
	}

	public void setSurveyV2Question22(String surveyV2Question22) {
		this.surveyV2Question22 = surveyV2Question22;
	}

	public String getSurveyV2Question22Type() {
		return surveyV2Question22Type;
	}

	public void setSurveyV2Question22Type(String surveyV2Question22Type) {
		this.surveyV2Question22Type = surveyV2Question22Type;
	}

	public String getPreSurveyV2Answer22() {
		return preSurveyV2Answer22;
	}

	public void setPreSurveyV2Answer22(String preSurveyV2Answer22) {
		this.preSurveyV2Answer22 = preSurveyV2Answer22;
	}

	public String getPostSurveyV2Answer22() {
		return postSurveyV2Answer22;
	}

	public void setPostSurveyV2Answer22(String postSurveyV2Answer22) {
		this.postSurveyV2Answer22 = postSurveyV2Answer22;
	}

	public String getSurveyV2Question23() {
		return surveyV2Question23;
	}

	public void setSurveyV2Question23(String surveyV2Question23) {
		this.surveyV2Question23 = surveyV2Question23;
	}

	public String getSurveyV2Question23Type() {
		return surveyV2Question23Type;
	}

	public void setSurveyV2Question23Type(String surveyV2Question23Type) {
		this.surveyV2Question23Type = surveyV2Question23Type;
	}

	public String getPreSurveyV2Answer23() {
		return preSurveyV2Answer23;
	}

	public void setPreSurveyV2Answer23(String preSurveyV2Answer23) {
		this.preSurveyV2Answer23 = preSurveyV2Answer23;
	}

	public String getPostSurveyV2Answer23() {
		return postSurveyV2Answer23;
	}

	public void setPostSurveyV2Answer23(String postSurveyV2Answer23) {
		this.postSurveyV2Answer23 = postSurveyV2Answer23;
	}

	public String getSurveyV2Question24() {
		return surveyV2Question24;
	}

	public void setSurveyV2Question24(String surveyV2Question24) {
		this.surveyV2Question24 = surveyV2Question24;
	}

	public String getSurveyV2Question24Type() {
		return surveyV2Question24Type;
	}

	public void setSurveyV2Question24Type(String surveyV2Question24Type) {
		this.surveyV2Question24Type = surveyV2Question24Type;
	}

	public String getPreSurveyV2Answer24() {
		return preSurveyV2Answer24;
	}

	public void setPreSurveyV2Answer24(String preSurveyV2Answer24) {
		this.preSurveyV2Answer24 = preSurveyV2Answer24;
	}

	public String getPostSurveyV2Answer24() {
		return postSurveyV2Answer24;
	}

	public void setPostSurveyV2Answer24(String postSurveyV2Answer24) {
		this.postSurveyV2Answer24 = postSurveyV2Answer24;
	}
	

}
