package com.qa.medibuddy.Phlebo.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import com.qa.medibuddy.api.builders.SpecBuilder;
import com.qa.medibuddy.api.genericMethods.Phlebo_Api_Methods;
import com.qa.medibuddy.api.payloads.Payloads;
import com.qa.medibuddy.api.pojo.CallConnect;
import com.qa.medibuddy.api.pojo.Post_Send_OTP;
import com.qa.medibuddy.api.pojo.Post_Verify_OTP;
import com.qa.medibuddy.api.utils.Endpoints;
import com.qa.medibuddy.api.utils.Randomizer;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Phlebo_OTP_Test {

	Payloads pl = new Payloads();
	Post_Send_OTP pso = new Post_Send_OTP();
	Post_Verify_OTP pvo = new Post_Verify_OTP();
	Randomizer rm = new Randomizer();


	@Test
	public void Post_Send_OTP () {

		pso.setPhonenumber("7550112671");

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(pso).
		when().post(Endpoints.POST_SEND_OTP).
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().time(lessThan(2000L)).statusCode(200)
		.extract().response().asPrettyString(); 

		//Response res = Phlebo_Api_Methods.post(pso);

		Assert.assertEquals("otp sent successfully", "otp sent successfully");

		//System.out.println(res.getTime());

	}

	@Test
	public  void Post_verify_OTP_with_Invalid_OTP() {

		pvo.setPhonenumber("7550112671");
		pvo.setOtpDataId(Randomizer.randomNumeric(3));
		pvo.setOtpEvent("login");
		pvo.setOtp(Randomizer.randomNumeric(4));

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(pvo).
		when().post(Endpoints.POST_VERIFY_OTP).
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().time(lessThan(3000L)).statusCode(200);

		Assert.assertEquals("Incorrect otp Entered", "Incorrect otp Entered", "OTP Verification_failed");

	}

	@Test
	public void Post_Call_Connect() {

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(Payloads.call_connect()).
		when().post(Endpoints.POST_CALL_CONNECT).
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().time(lessThan(3000L)).statusCode(200);

		Assert.assertEquals("", "");

	}

	@Test
	public void Post_Call_Connect_Invalid_Number() {

		CallConnect cc = new CallConnect ("8879071056" , "567") ;

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(cc).
		when().post(Endpoints.POST_CALL_CONNECT).
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().time(lessThan(3000L)).statusCode(200);

		Assert.assertEquals("", "");


	}

}
