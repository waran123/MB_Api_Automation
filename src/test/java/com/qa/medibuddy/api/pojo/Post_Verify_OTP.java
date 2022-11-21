package com.qa.medibuddy.api.pojo;

public class Post_Verify_OTP {

	private String phonenumber ;
	private String otp ;
	private String otpEvent ;
	private String otpDataId ;

	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getOtpEvent() {
		return otpEvent;
	}
	public void setOtpEvent(String otpEvent) {
		this.otpEvent = otpEvent;
	}
	public String getOtpDataId() {
		return otpDataId;
	}
	public void setOtpDataId(String otpDataId) {
		this.otpDataId = otpDataId;
	}
}
