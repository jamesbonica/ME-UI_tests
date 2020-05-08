package config;

/**
 * 
 * @author jimbonica
 *
 * @date Sep-23-2019
 */

public class SurveyQuestionAndResponse {

	private String surveyQuestion;
	private String baselineAnswer;
	private String postAnswer;
	
	public SurveyQuestionAndResponse(String surveyQuestion, String baselineAnswer, String postAnswer) {
		this.surveyQuestion = surveyQuestion;
		this.baselineAnswer = baselineAnswer;
		this.postAnswer = postAnswer;
	}

	public String getSurveyQuestion() {
		return surveyQuestion;
	}

	public void setSurveyQuestion(String surveyQuestion) {
		this.surveyQuestion = surveyQuestion;
	}

	public String getBaselineAnswer() {
		return baselineAnswer;
	}

	public void setBaselineAnswer(String baselineAnswer) {
		this.baselineAnswer = baselineAnswer;
	}

	public String getPostAnswer() {
		return postAnswer;
	}

	public void setPostAnswer(String postAnswer) {
		this.postAnswer = postAnswer;
	}
	
	@Override
    public String toString() { 
        return "Question: " + surveyQuestion + ", Baseline Answer: " + baselineAnswer + ", postAnswer: " + postAnswer; 
    } 
	
}
