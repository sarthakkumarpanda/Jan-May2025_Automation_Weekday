package com.learning_java_Day20_8th_Apr_2025_Strings;

public class Topic5_CharArray_vs_String {

	public static void main(String[] args) {
		
		String password = "Secret";
		System.out.println("Print the password: " + password);
		
		char[] c = {'S', 'e', 'c', 'r', 'e', 't'};
		System.out.println("The password is: " + c); //if you append the char array with a String like ""The password is: " then it will never reveal the value
		

	}

}
