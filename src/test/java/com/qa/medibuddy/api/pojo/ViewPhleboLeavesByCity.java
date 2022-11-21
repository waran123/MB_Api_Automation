package com.qa.medibuddy.api.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ViewPhleboLeavesByCity {

	
	private String FromDate ;
	private String  EndDate; 
	private String City; 
	
	@JsonProperty("FromDate")
	public String getFromDate() {
		return FromDate;
	}
	public void setFromDate(String fromDate) {
		FromDate = fromDate;
	}
	
	@JsonProperty("EndDate")
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	
	@JsonProperty("City")
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}

}
