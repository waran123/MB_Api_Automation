package com.qa.medibuddy.api.pojo;

public class Approve_Phlebo_Leave {

	private int Id ; 
	private String PhleboId ;
	private String ApprovedBy ;
	private String Status ; 

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getPhleboId() {
		return PhleboId;
	}
	public void setPhleboId(String phleboId) {
		PhleboId = phleboId;
	}
	public String getApprovedBy() {
		return ApprovedBy;
	}
	public void setApprovedBy(String approvedBy) {
		ApprovedBy = approvedBy;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}

}
