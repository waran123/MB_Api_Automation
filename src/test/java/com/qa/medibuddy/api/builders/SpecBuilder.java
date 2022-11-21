package com.qa.medibuddy.api.builders;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public  class SpecBuilder  {

	public static RequestSpecification getRequestSpecification() {
		
		EncoderConfig EC= new EncoderConfig();

		return new RequestSpecBuilder().addHeader("Content-Type", "application/json").
				//setConfig(RestAssured.config()//.//encoderConfig(EC.appendDefaultContentCharsetToContentTypeIfUndefined(false))).
				addFilter(new AllureRestAssured()).
				log(LogDetail.ALL).build();

	}

	public static ResponseSpecification geResponseSpecification() {

		return new ResponseSpecBuilder().
				log(LogDetail.ALL).build();
	}

	
}
