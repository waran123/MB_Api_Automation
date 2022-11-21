package com.qa.medibuddy.Phlebo.api.test;
import java.util.ArrayList;
import org.testng.annotations.Test;
import com.qa.medibuddy.api.builders.SpecBuilder;
import com.qa.medibuddy.api.pojo.Get_All_Order;
import com.qa.medibuddy.api.utils.Endpoints;
import com.qa.medibuddy.api.utils.Randomizer;
import io.qameta.allure.Description;
import io.restassured.RestAssured;


public class Phlebo_Get_Api_Tests {

	Randomizer rm = new Randomizer();
	Get_All_Order go = new Get_All_Order ();

	@Description("This Api Fetch the Lab details Based on the City ")
	@Test
	public void get_Lab_Tests() {

		RestAssured.given().spec(SpecBuilder.getRequestSpecification())
		.when().get(Endpoints.GET_LAB_TESTS).then().spec(SpecBuilder.geResponseSpecification())
		.assertThat().statusCode(200);
	}


	@Description("This APi Is Used to fetch the Orders Based on the City")
	@Test
	public void post_Get_All_Order() { 

		ArrayList<String> a = new ArrayList<String>();
		a.add("benguluru");

		go.setCity(a);
		go.setAppointmentFromDate(Randomizer.getCurrentDate());
		go.setAppointmentToDate(Randomizer.getNextDate());
		go.setPhleboOrderCount(true);
		go.setTabular(true);

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(go).
		when().post(Endpoints.POST_GET_ALL_ORDERS).
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().statusCode(200).extract().response();

	}



}
