package com.learning_java_Day21_9th_Apr_2025_Exception_Handling;

public class Topic6_Print_StackTrace {

	public static void main(String[] args) {
		try {
			int a = 10, b =0;
			int c = a/b; //risky code
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace(); //this will print the ExceptionName, Description and stack trace
			System.out.println(e); //this will print the ExceptionName, Description only
			System.out.println(e.getMessage()); //only Description
			System.out.println(e.toString());//this will print the ExceptionName, Description only
		}

	}

}
