package com.qa.medibuddy.Phlebo.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.medibuddy.api.builders.SpecBuilder;
import com.qa.medibuddy.api.payloads.Payloads;
import com.qa.medibuddy.api.pojo.Add_Labs;
import com.qa.medibuddy.api.pojo.Data;
import com.qa.medibuddy.api.pojo.Get_Orders;
import com.qa.medibuddy.api.pojo.On_Board_Newp_Spc_Code;
import com.qa.medibuddy.api.pojo.Update_Phlebo_Details;
import com.qa.medibuddy.api.utils.Endpoints;
import com.qa.medibuddy.api.utils.FakerUtils;
import com.qa.medibuddy.api.utils.Randomizer;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import org.testng.asserts.SoftAssert;


public class Phelo_Base_Test {

	Randomizer rm = new Randomizer ();
	Payloads po = new Payloads ();
	Endpoints ep = new Endpoints ();
	Get_Orders PostOrders = new Get_Orders();
	Add_Labs addLabs = new Add_Labs();
	On_Board_Newp_Spc_Code onboardSpc = new On_Board_Newp_Spc_Code();
	SoftAssert softassert = new SoftAssert();

	@Link("https://example.org")
	@Link(name = "allure", type = "mylink")
	@TmsLink("12345")
	@Issue("9876")
	@Description("This API is Used to create Order")
	@Test(description = "Create Order API" )
	public void create_Order_Test_API() {

		RestAssured.given(SpecBuilder.getRequestSpecification()).
		body(po.post_order_payload()).
		when().post(Endpoints.CREATE_ORDER_ENDPOINT).
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().statusCode(200);
	}

	@Test 
	public void check_Slot_by_City_API() {

		given().spec(SpecBuilder.getRequestSpecification()).
		body(po.check_slot_by_city_payload()).
		when().post(Endpoints.CHECK_SLOTS_BY_CITY_ENDPOINTS).
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().statusCode(200).extract().body().asPrettyString();

	}
	
	@Description("Test Case : Should be able to Fetch the Order with valid PhleboID")
	@Test(description = "GetOrders" )
	public void Post_get_Orders_API() {

		PostOrders.setPhleboId("224");

		given(SpecBuilder.getRequestSpecification()).
		body(PostOrders).
		when().post(Endpoints.GET_ORDERS).
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().statusCode(200);

	}
	
	@Description("Test Case : Shouldn't be able to Fetch the Order with Invalid PhleboID")
	@Test(description = "GetOrders" )
	public void get_orders_with_invalid_PhleboId() {
		

		PostOrders.setPhleboId(Randomizer.randomNumeric(3));

		given(SpecBuilder.getRequestSpecification()).
		body(PostOrders).
		when().post(Endpoints.GET_ORDERS).
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().statusCode(200);

		
	}

	@Test
	public void Post_add_labs_API() {

		addLabs.setLabName(Randomizer.randomAlphabets(6));
		addLabs.setProviderId("");
		addLabs.setAssistantphonenumber1(Randomizer.randomNumeric(10));
		addLabs.setAssistantphonenumber2("");
		addLabs.setLabaddressline1(Randomizer.randomAlphabets(8));
		addLabs.setLabaddressline2(FakerUtils.GenerateAddress());
		addLabs.setLabaddressline3("");
		addLabs.setEmail("test@test.com");
		addLabs.setCity("bengaluru");
		addLabs.setState("");
		addLabs.setPincode("560029");
		addLabs.setPackages("");
		addLabs.setWalletAmount("");
		addLabs.setSecurityDeposit("");

		given(SpecBuilder.getRequestSpecification()).
		body(addLabs).
		when().post(Endpoints.ADD_LABS).
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().statusCode(200);

	}

	@Test
	public void Post_Onboard_New_SPC_Code () {

		onboardSpc.setSpcName("Test");
		onboardSpc.setSpcCode(Randomizer.randomAlphabets(5));

		given(SpecBuilder.getRequestSpecification()).
		body(onboardSpc).
		when().post(Endpoints.ON_BOARD_NEW_SPC).
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().statusCode(200).extract().response();

		//Assert.assertEquals("New SPC Code Created", "New SPC Code Created");
		softassert.assertEquals("message" , "New SPC Code Created");

	}

	@Test
	public void Post_Update_Phlebo_Details() {

		Update_Phlebo_Details upd = new Update_Phlebo_Details();

		upd.setId(262);
		Data dataObj = new Data();
		upd.setData(dataObj);
		dataObj.setIsActive("0");
		dataObj.setDoneBy("himanshu.a@medibuddy.in");
		
		given(SpecBuilder.getRequestSpecification()).
		body(upd).
		when().post(Endpoints.POST_UPDATE_PHLEBO_DETAILS).
		then().spec(SpecBuilder.geResponseSpecification()).assertThat().statusCode(200).extract().response();

	}
}
