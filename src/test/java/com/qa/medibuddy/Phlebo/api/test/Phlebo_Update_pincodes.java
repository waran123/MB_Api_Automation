package com.qa.medibuddy.Phlebo.api.test;

import static io.restassured.RestAssured.given;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;
import com.qa.medibuddy.api.builders.SpecBuilder;
import com.qa.medibuddy.api.utils.Endpoints;
import com.qa.medibuddy.api.utils.Randomizer;
import io.qameta.allure.Description;
import io.restassured.response.ValidatableResponse;


@Test
public class Phlebo_Update_pincodes {
	
	Map<String , Object > hmap_Pincodes = new HashMap<>(); 
	String [] array = {"560034","456789"};
	String [] array1 ={"560034","456789", "euhrqir" ,"345678"};
	
	public ValidatableResponse Base_Method() {
		
		ValidatableResponse request = given(SpecBuilder.getRequestSpecification()).
				body(hmap_Pincodes).
				when().post(Endpoints.UPDATE_PINCODES).
				then().spec(SpecBuilder.geResponseSpecification()) ;
		
		return request ;
		
	}

	@Description("Update Pincodes - case 1 : Should be Able to Update the Pincodes with respect to the City and Provider")
	@Test(description = "Update Pincodes" )
	public void update_ValidPincode_test() {

		hmap_Pincodes.put("PincodesArr", array);
		hmap_Pincodes.put("providerId", "422925");
		hmap_Pincodes.put("cityName", "Guwahati");

		given(SpecBuilder.getRequestSpecification()).
		body(hmap_Pincodes).
		when().post(Endpoints.UPDATE_PINCODES).
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().statusCode(200).extract().response();
	}
	
	@Description("Update Pincodes - case 2 : Shouldn't be Able to Update the Invalid Pincodes")
	@Test(description = "Update Pincodes" )
	public void update_Invalid_Pincodes_test() {
		
		hmap_Pincodes.put("PincodesArr", array1);
		hmap_Pincodes.put("providerId", "422925");
		hmap_Pincodes.put("cityName", "Guwahati");

		given(SpecBuilder.getRequestSpecification()).
		body(hmap_Pincodes).
		when().post(Endpoints.UPDATE_PINCODES).
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().statusCode(400).extract().response();

	}
	
	@Description("Update Pincodes - case 3 : Shouldn't be Able to Update the Pincodes with InvalidCityNAme")
	@Test(description = "Update Pincodes" )
	public void update_Pincode_With_InvalidCityName() {
		

		hmap_Pincodes.put("PincodesArr", array);
		hmap_Pincodes.put("providerId", "422925");
		hmap_Pincodes.put("cityName", Randomizer.randomAlphaNumeric(15));

		given(SpecBuilder.getRequestSpecification()).
		body(hmap_Pincodes).
		when().post(Endpoints.UPDATE_PINCODES).
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().statusCode(400).extract().response();
		
	}
	
	@Description("Update Pincodes - case 4 : Shouldn't be Able to Update the Pincodes with InvalidProviderID")
	@Test(description = "Update Pincodes" )
	public void update_Pincode_With_InvalidProviderId() {
		
		hmap_Pincodes.put("PincodesArr", array);
		hmap_Pincodes.put("providerId", Randomizer.randomNumeric(10));
		hmap_Pincodes.put("cityName", "Guwahati");

		given(SpecBuilder.getRequestSpecification()).
		body(hmap_Pincodes).
		when().post(Endpoints.UPDATE_PINCODES).
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().statusCode(400).extract().response();
		
		
	}

}
