package com.moneyexperience.service;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import config.Constants;
import config.PropertiesLoader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

/**
 * 
 * @author jimbonica
 *
 * @date Jun-03-2019
 */

@Service
@Scope(SCOPE_CUCUMBER_GLUE)
public class ApiService {

	@Autowired
	UserService userService;

	@Autowired
	PropertiesLoader propertiesLoader;

	public String loginUserToSimulatorViaApi(String username, String password) {

		username = userService.getConfiguredUserName(username);
		password = userService.getConfiguredUserPassword(password);

		HashMap<String, String> postContent = new HashMap<String, String>();
		postContent.put("username", username);
		postContent.put("password", password);

		ResponseOptions<Response> response;

		// System.out.println(propertiesLoader.getTestApiUrl() + Constants.LOGIN);

		response = given().contentType(ContentType.JSON).with().body(postContent).when()
				.post(propertiesLoader.getTestApiUrl() + Constants.LOGIN);

		return response.header("Authorization");

	}

	public ResponseOptions<Response> resetUserProgressApi(String username, String password, int lessonNumber) {

		String token = loginUserToSimulatorViaApi(username, password);

		ResponseOptions<Response> response;

		response = given().contentType(ContentType.JSON).header("Authorization", "Bearer " + token).with().when()
				.post(propertiesLoader.getTestApiUrl() + Constants.RESET_USER_TO_LESSON + lessonNumber);

		// response.body().prettyPrint();

//		System.out.println("~~~~~~~~~~~~~~~~ " + response.getTimeIn(TimeUnit.MILLISECONDS));
//		System.out.println("~~~~~~~~~~~~~~~~ " + response.getStatusCode());

		return response;
	}

}
