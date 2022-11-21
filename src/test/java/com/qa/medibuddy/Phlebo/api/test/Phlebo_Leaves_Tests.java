package com.qa.medibuddy.Phlebo.api.test;

import static org.hamcrest.Matchers.lessThan;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.medibuddy.api.builders.SpecBuilder;
import com.qa.medibuddy.api.payloads.Payloads;
import com.qa.medibuddy.api.pojo.Apply_Phlebo_Leaves;
import com.qa.medibuddy.api.pojo.Approve_Phlebo_Leave;
import com.qa.medibuddy.api.pojo.ViewLeaves;
import com.qa.medibuddy.api.pojo.ViewPhleboLeavesByCity;
import com.qa.medibuddy.api.utils.Endpoints;
import com.qa.medibuddy.api.utils.Randomizer;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

public class Phlebo_Leaves_Tests  {

	Apply_Phlebo_Leaves applyLeaves = new Apply_Phlebo_Leaves();
	Approve_Phlebo_Leave approveLeaves = new Approve_Phlebo_Leave() ;
	ViewLeaves viewLeaves = new ViewLeaves();
	ViewPhleboLeavesByCity phleboLeavesByCity = new ViewPhleboLeavesByCity();

	/* @BeforeMethod
	public ValidatableResponse resusable (ValidatableResponse request) {

	 request = RestAssured.given().accept(ContentType.JSON).log().all().
		body(applyLeaves).
		when().post(Endpoints.APPLY_PHLEBO_LEAVE).
		then().spec(SpecBuilder.geResponseSpecification());

	 return request ; 

	}

	 */




	@Description("Apply Phlebo leave - case 1 : Should be Able to Apply the leave with all Mandatory Params")
	@Test(description = "Apply Phlebo Leaves" )
	public void  apply_Phleobo_Leave () {

		applyLeaves.setPhleboId(320);
		applyLeaves.setUnavailableDate(Randomizer.getCurrentDate());
		applyLeaves.setLeaveType("Sick Leave");
		applyLeaves.setRemarks("test");
		applyLeaves.setFirstHalfLeave(1);
		applyLeaves.setSecondHalfLeave(1);
		applyLeaves.setDoneBy("Dori Lal");

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(applyLeaves).
		when().post(Endpoints.APPLY_PHLEBO_LEAVE).
		then().spec(SpecBuilder.geResponseSpecification()).
		assertThat().time(lessThan(3000L)).statusCode(200);;


	}

	@Description("Apply Phlebo leave - case 2 : Phlebo id and Date is mandatory to Apply leaves")
	@Test
	public  void apply_Phleobo_Leave_without_ID_And_Date() {


		applyLeaves.setPhleboId(0);
		applyLeaves.setUnavailableDate("");
		applyLeaves.setLeaveType("Sick Leave");
		applyLeaves.setRemarks("Not well");
		applyLeaves.setFirstHalfLeave(1);
		applyLeaves.setSecondHalfLeave(0);
		applyLeaves.setDoneBy("Dori Lal");

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(applyLeaves).
		when().post(Endpoints.APPLY_PHLEBO_LEAVE).
		then().spec(SpecBuilder.geResponseSpecification()).
		assertThat().time(lessThan(3000L)).statusCode(200);
	}

	@Description("Apply Phlebo leave - case 3 : Should not be Able to Apply the leave for Already applied Date")
	@Test
	public  void apply_Phleobo_Leave_For_already_Applied_Dates() {


		applyLeaves.setPhleboId(320);
		applyLeaves.setUnavailableDate("2022-09-10");
		applyLeaves.setLeaveType("Sick Leave");
		applyLeaves.setRemarks("Not well");
		applyLeaves.setFirstHalfLeave(1);
		applyLeaves.setSecondHalfLeave(0);
		applyLeaves.setDoneBy("Dori Lal");

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(applyLeaves).
		when().post(Endpoints.APPLY_PHLEBO_LEAVE).
		then().spec(SpecBuilder.geResponseSpecification()).
		assertThat().time(lessThan(3000L)).statusCode(200);

	}

	@Description("Apply Phlebo Leave - Case 4 : Should be able to apply the leave for Second half " )
	@Test 
	public void apply_Phlebo_Leave_For_Second_Half() {

		applyLeaves.setPhleboId(320);
		applyLeaves.setUnavailableDate(Randomizer.getCurrentDate());
		applyLeaves.setLeaveType("Sick Leave");
		applyLeaves.setRemarks("Not well");
		applyLeaves.setFirstHalfLeave(0);
		applyLeaves.setSecondHalfLeave(1);
		applyLeaves.setDoneBy("Dori Lal");

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(applyLeaves).
		when().post(Endpoints.APPLY_PHLEBO_LEAVE).
		then().spec(SpecBuilder.geResponseSpecification()).
		assertThat().time(lessThan(3000L)).statusCode(200);


	}

	@Description("Apply Phlebo Leave - Case 5 : Should be able to apply FullDay Leave")
	@Test
	public void apply_Phelbo_Leave_For_FullDay() {

		applyLeaves.setPhleboId(320);
		applyLeaves.setUnavailableDate(Randomizer.getCurrentDate());
		applyLeaves.setLeaveType("Sick Leave");
		applyLeaves.setRemarks("Not well");
		applyLeaves.setFirstHalfLeave(1);
		applyLeaves.setSecondHalfLeave(1);
		applyLeaves.setDoneBy("Dori Lal");

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(applyLeaves).
		when().post(Endpoints.APPLY_PHLEBO_LEAVE).
		then().spec(SpecBuilder.geResponseSpecification()).
		assertThat().time(lessThan(3000L)).statusCode(200);

	}

	@Description("Approve phlebo Leave - Case 1 : Should be able to approve the phlebo Leave")
	@Test
	public void approve_Phlebo_Leave() {


		approveLeaves.setId(3);
		approveLeaves.setPhleboId("");
		approveLeaves.setApprovedBy("");
		approveLeaves.setStatus("Rejected");

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(approveLeaves).
		when().post(Endpoints.APPROVE_PHLEBO_LEAVE).
		then().spec(SpecBuilder.geResponseSpecification()).
		assertThat().time(lessThan(3000L)).statusCode(200);

	}

	@Description("View Phlebo Leave - case 1 : Should be able ot view the leaves of the phlebo for the same day ")
	@Test
	public void view_Phlebo_leaves() {


		viewLeaves.setFromDate(Randomizer.getCurrentDate());
		viewLeaves.setEndDate(Randomizer.getCurrentDate());
		viewLeaves.setPhleboId("320");

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(viewLeaves).
		when().post(Endpoints.VIEW_PHLEBO_LEAVES_BY_ID).
		then().spec(SpecBuilder.geResponseSpecification()).
		assertThat().time(lessThan(3000L)).statusCode(200);

	}

	@Description("View Phlebo Leave - case 2 : Should be able to view the leaves for 3 days ")
	@Test
	public void view_Phlebo_leaves_for_3_Days() {


		viewLeaves.setFromDate(Randomizer.getPreviousDate());
		viewLeaves.setEndDate(Randomizer.getNextDate());
		viewLeaves.setPhleboId("320");

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(viewLeaves).
		when().post(Endpoints.VIEW_PHLEBO_LEAVES_BY_ID).
		then().spec(SpecBuilder.geResponseSpecification()).
		assertThat().time(lessThan(3000L)).statusCode(200);

	}

	@Description("View Phlebo Leave - case 3 : Phlebo ID should be required ")
	@Test
	public void view_Phlebo_leaves_for_invalid_Phlebo() {


		viewLeaves.setFromDate(Randomizer.getPreviousDate());
		viewLeaves.setEndDate(Randomizer.getNextDate());
		viewLeaves.setPhleboId("");

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(viewLeaves).
		when().post(Endpoints.VIEW_PHLEBO_LEAVES_BY_ID).
		then().spec(SpecBuilder.geResponseSpecification()).
		assertThat().time(lessThan(3000L)).statusCode(200);

	}

	@Description("View Phlebo Leaves by City - case 1 : Should be able to view the phlebo leaves by city wise ")
	@Test
	public void view_Phlebo_Leaves_Based_On_City() {

		phleboLeavesByCity.setFromDate(Randomizer.getCurrentDate());
		phleboLeavesByCity.setEndDate(Randomizer.getCurrentDate());
		phleboLeavesByCity.setCity("Benagluru");

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(phleboLeavesByCity).
		when().post(Endpoints.VIEW_PHLEBO_LEAVES).
		then().spec(SpecBuilder.geResponseSpecification()).
		assertThat().time(lessThan(3000L)).statusCode(200);

	}

	@Description("View Phlebo Leaves by City - case 2 : Required Valid fields to fetch leaves  ")
	@Test
	public void view_Phlebo_Leaves_Based_On_City_InvalidTest() {

		phleboLeavesByCity.setFromDate("");
		phleboLeavesByCity.setEndDate(Randomizer.getCurrentDate());
		phleboLeavesByCity.setCity("Benagluru");

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(phleboLeavesByCity).
		when().post(Endpoints.VIEW_PHLEBO_LEAVES).
		then().spec(SpecBuilder.geResponseSpecification()).
		assertThat().time(lessThan(3000L)).statusCode(200);

	}



}
