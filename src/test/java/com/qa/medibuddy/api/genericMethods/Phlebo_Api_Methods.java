package com.qa.medibuddy.api.genericMethods;

import com.qa.medibuddy.api.builders.SpecBuilder;
import com.qa.medibuddy.api.pojo.Post_Send_OTP;
import com.qa.medibuddy.api.utils.Endpoints;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Phlebo_Api_Methods {

	/*
	public static  Response  post(Post_Send_OTP pso) {
	

		return RestAssured.given(SpecBuilder.getRequestSpecification()).
				body(pso).
				when().post(Endpoints.POST_SEND_OTP).
				then().spec(SpecBuilder.geResponseSpecification()).extract().response();
				
				}
        
	

	public  Response get() {

		return RestAssured.given().spec(SpecBuilder.getRequestSpecification())
				.when().get(Endpoints.GET_LAB_TESTS).then().spec(SpecBuilder.geResponseSpecification())
				.extract().response();
		

	}
	*/
}
