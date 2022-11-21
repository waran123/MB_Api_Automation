package com.qa.medibuddy.api.pojo;

public class Update_Phlebo_Details {
	
	private int id ;
	private Data data ;
	
	public Update_Phlebo_Details(){
		
	}
	
	public Update_Phlebo_Details(int id , Data data ){
		this.id = id ;
		this.data = data ;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int string) {
		this.id = string;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	
}


