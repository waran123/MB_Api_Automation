package com.qa.medibuddy.api.payloads;

import java.util.HashMap;
import java.util.Map;

import com.qa.medibuddy.api.utils.Randomizer;

public class Payloads{

	public HashMap<String, String> post_order_payload() {

		HashMap<String ,String > create_order_map = new HashMap <String , String >();

		create_order_map.put("appointmentId","");
		create_order_map.put("appointmentProvider","Medibuddy");
		create_order_map.put("currentStatusId","1");
		create_order_map.put("RequestNextStatus","101");
		create_order_map.put("patientName","MediBuddy TEST Demo");
		create_order_map.put("patientEmail","waranwicky@gmail.com");
		create_order_map.put("patientPhonenumber1","7550112671");
		create_order_map.put("patientPhonenumber2","");
		create_order_map.put("addressline1","ABC - Streeet ");
		create_order_map.put("addressline2","");
		create_order_map.put("addressline3","");
		create_order_map.put("city","");
		create_order_map.put("state","");
		create_order_map.put("pincode","");
		create_order_map.put("appointmentTime","");
		create_order_map.put("labtestId","");
		create_order_map.put("labTestName","COVID-19 RT-PCR - Swab Test");
		create_order_map.put("phleboAssign","");
		create_order_map.put("assignedBy","");
		create_order_map.put("orderStatusId","");
		create_order_map.put("orderStatusMessage","");
		create_order_map.put("timeOfConfirmation","");
		create_order_map.put("orderConfirmationImageGuids","");
		create_order_map.put("reachedLocation","");
		create_order_map.put("reachedLocationTime","");
		create_order_map.put("orderConfirmationImageGuids","");
		create_order_map.put("sampleTaken","");
		create_order_map.put("sampleTakenTime","");
		create_order_map.put("confirmedBylabs","");
		create_order_map.put("ReportGuid","");
		create_order_map.put("HoursOfcycle","");
		create_order_map.put("recheduledorderId","");
		create_order_map.put("recheduleComment", "");
		create_order_map.put("patientGender","");
		create_order_map.put("patientDOB","");
		create_order_map.put("contractId","");
		create_order_map.put("age","25");

		return create_order_map ;
	}

	public Map<Object, Object> check_slot_by_city_payload() {

		Map<Object,Object> check_slot_by_city = new HashMap<Object , Object >();
		check_slot_by_city.put("days", 4);
		check_slot_by_city.put("city", "Bengaluru");
		check_slot_by_city.put("pincode", "560029");
		check_slot_by_city.put("contract", "PPMC");
		return check_slot_by_city ;
	}

	public static Map<String, String> call_connect() {

		Map<String, String > callConnectMap = new HashMap<String,String>();

		callConnectMap.put("from", "8879071056");
		callConnectMap.put("to", "7550112671");
		return callConnectMap ;

	}

	public static Map<String,String> applyLeaves(){
		
		Map<String, String > applyLeaveMap = new HashMap<String,String>();
		
		applyLeaveMap.put("doneBy","Dori Lal");
		applyLeaveMap.put("PhleboId", "224");
		applyLeaveMap.put("UnavailableDate","2022-09-09");
		applyLeaveMap.put("LeaveType","Sick Leave");
		applyLeaveMap.put("Remarks","test");
		applyLeaveMap.put("FirstHalfLeave","1");
		applyLeaveMap.put("SecondHalfLeave","1");
		
		return applyLeaveMap ; 
		
	}
}
