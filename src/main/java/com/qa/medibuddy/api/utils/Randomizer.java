package com.qa.medibuddy.api.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import io.qameta.allure.Description;

public class Randomizer {

	public static final String DATA = "ABCDEFGHIJKLMNOabcdefghijklmno1234567890";
	public static final String DATA1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmno";
	public static final String DATA2 = "1234567890";
	public static final String DATA3 = "123456789";
	public static final String DATA4 = "!@#$%^&*()_+=-{}:\"|<>?/.,;\'[]\'";
	public static final String DATE_FORMAT = "yyyy-MM-dd" ; 
	public static final long ONE_DAY_MILLI_SECONDS = 24 * 60 * 60 * 1000;
	public static Random random = new Random () ;

	@Description("This Method is used to Provide Current Date ")
	public static  String  getCurrentDate() {

		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
		String Current_date =  dateFormat.format(currentDate) ;
		return Current_date ;
	
	}

	@Description("This Method is used to Provide Next Date ")
	public static String getNextDate() {
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
		long nextDayMilliSeconds = currentDate.getTime()+ ONE_DAY_MILLI_SECONDS;
		Date nextDate = new Date(nextDayMilliSeconds);
		
		String Next_Date =  dateFormat.format(nextDate);
		return Next_Date ;

	}

	@Description("This Method is used to Provide Previous  Date ")
	public static  String getPreviousDate() {
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
		long previousDayMilliSeconds = currentDate.getTime() - ONE_DAY_MILLI_SECONDS;
		Date previousDate = new Date(previousDayMilliSeconds);
		//String previousDateStr = dateFormat.format(previousDate);
		String Previous_date = dateFormat.format(previousDate);
		return Previous_date ;

	}


	public static String randomEmail(String len) {

		StringBuilder sb = new StringBuilder(len);

		while(sb.length()<5){
			int index = (int)(random.nextFloat() * DATA.length());
			sb.append(sb.charAt(index));
		}
		String emailStr = sb.toString();

		return emailStr;
	}


	public static String randomAlphaNumeric(int len) {

		StringBuilder sb = new StringBuilder(len);

		for (int i = 0; i < len; i++) {
			sb.append(DATA.charAt(random.nextInt(DATA.length())));
		}
		return sb.toString();
	}

	public static String randomAlphabets(int len) {
		StringBuilder sb = new StringBuilder(len);

		for (int i = 0; i < len; i++) {
			sb.append(DATA1.charAt(random.nextInt(DATA1.length())));
		}
		return sb.toString();
	}

	public static String randomNumeric(int len) {
		StringBuilder sb = new StringBuilder(len);

		for (int i = 0; i < len; i++) {
			sb.append(DATA2.charAt(random.nextInt(DATA2.length())));
		}
		return sb.toString();
	}
	


	public static String randomNumberWithoutZero(int len){
		StringBuilder sb = new StringBuilder(len);

		for (int i = 0; i < len; i++) {
			sb.append(DATA3.charAt(random.nextInt(DATA3.length())));
		}
		return sb.toString();

	}

	public static String randomDecimalNumer(int len, int decimalPlace){
		StringBuilder sb = new StringBuilder(len+decimalPlace+1);
		for (int i = 0; i < len; i++) {
			sb.append(DATA2.charAt(random.nextInt(DATA2.length())));
		}
		sb.append(".");
		for (int i = 0; i < decimalPlace; i++) {
			sb.append(DATA3.charAt(random.nextInt(DATA3.length())));
		}
		return sb.toString();
	}

	public static String randomSpecialCharacters(int len){
		StringBuilder sb = new StringBuilder(len);

		for (int i = 0; i < len; i++) {
			sb.append(DATA4.charAt(random.nextInt(DATA4.length())));
		}
		return sb.toString();

	}

	public static int getRandomInteger(int maximum, int minimum){
		return ((int) (Math.random()*(maximum - minimum))) + minimum;
	}

}