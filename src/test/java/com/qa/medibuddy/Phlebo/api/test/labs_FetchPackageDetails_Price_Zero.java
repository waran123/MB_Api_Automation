package com.qa.medibuddy.Phlebo.api.test;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.qa.medibuddy.api.builders.SpecBuilder;
import com.qa.medibuddy.api.pojo.fetchOrderDetials;
import io.restassured.RestAssured;

public class labs_FetchPackageDetails_Price_Zero {
	
	fetchOrderDetials fo = new fetchOrderDetials ();
	
	@Test
	public void Price_Zero_Package() {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("18268392");
		a.add("18268393");
		
		fo.setPackageIds(a);
		
		RestAssured.given(SpecBuilder.getRequestSpecification1()).
		body(fo).
		when().post("https://www.medibuddy.in/WAPI/Labs/FetchPackageDetails").
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().statusCode(200).extract().response();
		
	}

}
