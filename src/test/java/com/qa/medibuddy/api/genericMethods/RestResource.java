package com.qa.medibuddy.api.genericMethods;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import com.qa.medibuddy.api.builders.SpecBuilder;


public class RestResource {
	
	public static Response post(Object payloads , String path) {
		
		return RestAssured.given(SpecBuilder.getRequestSpecification()).body(payloads)
				.header("Content-Type", "application/json").when()
				.post("path").then().spec(SpecBuilder.geResponseSpecification()).extract().response();
				
	}

	public static Response Get(String path) {
		
		return RestAssured.given(SpecBuilder.getRequestSpecification())
				.header("", "").when()
				.get("path").then().spec(SpecBuilder.geResponseSpecification()).extract().response();
		
	}
	
	
}
