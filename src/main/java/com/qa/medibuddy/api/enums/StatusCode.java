package com.qa.medibuddy.api.enums;

public enum StatusCode {

	SUCCESS(200,"OK"),
	UNAUTHORIZED(401,"Unauthorized"),
	BAD_REQUEST(400,"badRequest"),
	PAYMENT_REQUIRED(402,"paymentRequired"),
	FORBIDDEN(403,"forbidden"),
	NOT_FOUND(404,"notFound"),
	INTERNAL_SERVER(500,"internalServer"),
	BAD_GATEWAY(502,"badGateway"),
	NON_AUTHORITATIVE_INFORMATION(203,"nonAuthoritativeInformation");


	public int  statuscode ;
	public String message  ;

	StatusCode(int statuscode, String message) {

		this.statuscode= statuscode ;
		this.message = message ;

	}

	public int getCode() {
		return statuscode;
	}

	public void setCode(int statuscode) {

		this.statuscode = statuscode;
	}

	public String getMessage() {
		return message;
	}

	public  void setMessage(String message) {
		this.message = message;
	}


}
