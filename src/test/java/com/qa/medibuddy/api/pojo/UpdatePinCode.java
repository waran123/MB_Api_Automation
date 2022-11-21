package com.qa.medibuddy.api.pojo;

import java.util.List;

public class UpdatePinCode {

	private List<String> PincodesArr ; 
	private int providerId ; 
	private String cityName ; 

	public List<String> getPincodesArr() {
		return PincodesArr;
	}
	public void setPincodesArr(List<String> pincodesArr) {
		PincodesArr = pincodesArr;
	}
	public int getProviderId() {
		return providerId;
	}
	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
