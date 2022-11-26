package com.qa.medibuddy.api.pojo;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// POJO = Plain Old Java Object 

public class Get_All_Order {


	@JsonIgnoreProperties(ignoreUnknown = true )
	private ArrayList<String> city; 
	private String appointmentFromDate ;
	private String appointmentToDate ;
	private Boolean tabular ;
	private Boolean phleboOrderCount ;


	public Get_All_Order() {

	}


	public Get_All_Order(ArrayList<String> city , String appointmentFromDate , String appointmentToDate , Boolean tabular ,Boolean phleboOrderCount) {

		this.city = city  ;
		this.appointmentFromDate = appointmentFromDate ;
		this.appointmentToDate = appointmentToDate ;
		this.tabular = tabular ;
		this.phleboOrderCount = phleboOrderCount ;

	}



	public String getAppointmentFromDate() {
		return appointmentFromDate;
	}

	public void setAppointmentFromDate(String  date) {
		this.appointmentFromDate = date;
	}

	public String getAppointmentToDate() {
		return appointmentToDate;
	}

	public void setAppointmentToDate(String string) {
		this.appointmentToDate = string;
	}

	public Boolean getTabular() {
		return tabular;
	}

	public void setTabular(Boolean tabular) {
		this.tabular = tabular;
	}

	public Boolean getPhleboOrderCount() {
		return phleboOrderCount;
	}

	public void setPhleboOrderCount(Boolean phleboOrderCount) {
		this.phleboOrderCount = phleboOrderCount;
	}


	public void setCity(ArrayList<String> city) {

		this.city = city;

	}

	public ArrayList<String> getCity(){
		return city ;

	}


}
