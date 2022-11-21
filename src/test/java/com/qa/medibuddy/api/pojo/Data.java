package com.qa.medibuddy.api.pojo;

public class Data {

	private String IsActive ;
	private String doneBy ; 
	
public Data () {}

public Data(String IsActive , String doneBy ) {
	
	this.IsActive = IsActive;
	this.doneBy = doneBy;
}
	
	public String getIsActive() {
		return IsActive;
	}
	public void setIsActive(String isActive) {
		this.IsActive = isActive;
	}
	public String getDoneBy() {
		return doneBy;
	}
	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}
}
