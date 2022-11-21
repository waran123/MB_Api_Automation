package com.qa.medibuddy.api.utils;

import com.github.javafaker.Faker;

public class FakerUtils {

	static Faker fake = new Faker();

	public static String Generate_first_Name() {

		return "name" + fake.regexify("[A-za-z0-9 ,-_]{20}");

	}
	
	public static String GenerateAddress() {
		return "address" + fake.regexify("[A-za-z0-9 ,-&+_]{25}");
	}
	

	public static String GenerateEmail() {
		return "email" + fake.phoneNumber();
	}
}

