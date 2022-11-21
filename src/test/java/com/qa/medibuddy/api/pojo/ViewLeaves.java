package com.qa.medibuddy.api.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ViewLeaves {


	private String FromDate;
	private String EndDate;
	private String PhleboId; 


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

	@JsonProperty("PhleboId")
	public String getPhleboId() {
		return PhleboId;
	}
	public void setPhleboId(String phleboId) {
		PhleboId = phleboId;
	}

}
