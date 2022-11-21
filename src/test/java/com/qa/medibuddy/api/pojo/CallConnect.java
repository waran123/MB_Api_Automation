package com.qa.medibuddy.api.pojo;

public class CallConnect {
	
	private String from ;
	private String to ;
	
	public CallConnect () {
		
	}
	
	
	
public CallConnect (String from  , String to ) {
		
	this.from = from;
	this.to = to ;
	
	}
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}

	

}
