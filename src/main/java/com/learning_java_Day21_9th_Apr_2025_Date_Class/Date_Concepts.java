package com.learning_java_Day21_9th_Apr_2025_Date_Class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Concepts {


	public static void main(String[] args) {
		
		//Current Date and Time
		Date date = new Date();
		System.out.println(date);
		
		//Simple Date Format
		SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String finalDateFormat = simple.format(date);
		System.out.println("The final formatted date as per our choicse is : " + finalDateFormat);
		
		comparingTwoDates();
	}
	
	
	public static void comparingTwoDates() {
		//let's compare the current date and the date which will occur after 20 seconds
		Date date1 = new Date(); //current date
		Date date2 = new Date(System.currentTimeMillis() + 20000);  //after 20 seconds
		
		boolean b1 = date1.before(date2);
		boolean b2 = date1.after(date2);
		
		if(b1 == true) {
			System.out.println("Date logic is true");
		}else if(b2 == true) {
			System.out.println("Date logic is false");
		}
		
	}

}
