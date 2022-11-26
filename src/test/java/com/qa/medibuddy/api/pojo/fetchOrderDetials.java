package com.qa.medibuddy.api.pojo;

import java.util.ArrayList;

public class fetchOrderDetials {

	private ArrayList<String> packageIds;

	public fetchOrderDetials() {

	}

	public fetchOrderDetials(ArrayList<String> packageIds) {
		this.packageIds =  packageIds ;

	}

	public ArrayList<String> getPackageIds() {
		return packageIds;
	}

	public void setPackageIds(ArrayList<String> packageIds) {
		this.packageIds = packageIds;
	}

}

