package com.automation.Day17_Mar_26th_2025_DateTimeStamp;

import java.util.Date;

public class TimeStamp {
	

	public static String dateTimeStamp() {
		Date date = new Date();
		System.out.println(date); //Wed Mar 26 18:21:44 EDT 2025
	   //Wed Mar 26 18:22:13 EDT 2025
		//first remove the space and replace it with underscore
		//replace the : with underscore
		// Wed_Mar_26_18_22_13_EDT_2025
		
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(timeStamp);
		
		return "seleniumpanda" + timeStamp + "@gmail.com"; 
	}

}
