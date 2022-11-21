package com.qa.medibuddy.api.utils;

public class Endpoints {

	//This java class will give you the Endpoints which are consuming Phlebo Services
	
	public  static String BASE_URL = "https://phleboservice-testV2.medibuddy.in";
	public static String CREATE_ORDER_ENDPOINT = BASE_URL +"/createorder";
	public static String CHECK_SLOTS_BY_CITY_ENDPOINTS = BASE_URL +"/slot/checkSlotByCity";
	public static String POST_GET_ALL_ORDERS = BASE_URL +"/getAllOrders";
	public static String GET_LAB_TESTS= BASE_URL +"/getLabtest?city=Bengaluru";
	public static String GET_ORDERS = BASE_URL+"/getorders";
	public static String ADD_LABS = BASE_URL +"/addlabs";
	public static String ON_BOARD_NEW_SPC = BASE_URL +"/onboardNewSPCCode";
	public static String POST_SEND_OTP = BASE_URL+"/sendotp";
	public static String POST_VERIFY_OTP = BASE_URL +"/verifyotp";
	public static String POST_CALL_CONNECT = BASE_URL +"/callConnect";
	public static String POST_UPDATE_PHLEBO_DETAILS = BASE_URL +"/updatePhleboDetails";
	public static String APPLY_PHLEBO_LEAVE = BASE_URL +"/applyPhleboLeave";
	public static String APPROVE_PHLEBO_LEAVE = BASE_URL +"/approvePhleboLeave";
	public static String VIEW_PHLEBO_LEAVES_BY_ID = BASE_URL +"/viewPhleboLeaveById";
	public static String VIEW_PHLEBO_LEAVES = BASE_URL +"/viewAllPhleboLeaves";
	public static String UPDATE_PINCODES = BASE_URL+"/onboardPhlebo/updatePincodes";
	
	

}
