package com.qa.medibuddy.api.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Apply_Phlebo_Leaves {

	private int PhleboId ;
	private String UnavailableDate;
	private String LeaveType;
	private String Remarks;
	private int FirstHalfLeave;
	private int SecondHalfLeave;
	private String doneBy;

	@JsonProperty("PhleboId")
	public int getPhleboId() {
		return PhleboId;
	}
	
	public void setPhleboId(int phleboId) {
		PhleboId = phleboId;
	}
	
	@JsonProperty("UnavailableDate")
	public String getUnavailableDate() {
		return UnavailableDate;
	}
	public void setUnavailableDate(String unavailableDate) {
		UnavailableDate = unavailableDate;
		
	}
	
	@JsonProperty("LeaveType")
	public String getLeaveType() {
		return LeaveType;
	}
	public void setLeaveType(String leaveType) {
		LeaveType = leaveType;
	
	}
	
	@JsonProperty("Remarks")
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	
	@JsonProperty("FirstHalfLeave")
	public int getFirstHalfLeave() {
		return FirstHalfLeave;
	}
	public void setFirstHalfLeave(int firstHalfLeave) {
		FirstHalfLeave = firstHalfLeave;
	}
	
	@JsonProperty("SecondHalfLeave")
	public int getSecondHalfLeave() {
		return SecondHalfLeave;
	}
	public void setSecondHalfLeave(int secondHalfLeave) {
		SecondHalfLeave = secondHalfLeave;
	}
	
	@JsonProperty("doneBy")
	public String getDoneBy() {
		return doneBy;
	}
	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}
	
	
}
