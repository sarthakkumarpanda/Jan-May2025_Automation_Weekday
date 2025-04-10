package com.learning_java_Day20_8th_Apr_2025_Strings;

public class String_Operations_Part1 {

	public static void main(String[] args) {
		lengthMethod();
		trimMethod();
		trimAndLengthMethodTogether();
		isEmptyMethod();
		equalsMethod();
		equalsIgnoreCaseMethod();
		compareToMethod();
		compareToIgnoreCaseMethod();
		concatMethod();
		joinMethod();
	}
	
	
	public static void lengthMethod() {
		String S1 = "I am learning Automation";
		System.out.println(S1.length()); //length() just checks the total number of characters
		
		String S2 = null;
		//System.out.println(S2.length());
	}
	
	
	public static void trimMethod() {
		String S1 = "   I am learning             Selenium With Java    ";
		System.out.println(S1);
		System.out.println(S1.trim()); //trim method will remove the spaces in beginning and end of the String. It will not take care of space in between
	}
	
	public static void trimAndLengthMethodTogether() {
		String S1 = "     We are learning Automation With Selenium Java      ";
		System.out.println("The length of this String before trim operation is : "  + S1.length()); //56 characters
		//System.out.println(S1.trim());  //We are learning Automation With Selenium Java
		//String S2 = S1.trim();
		//System.out.println("The length of this String after trim operation is : "  + S2.length());
		System.out.println("The String after trim operation is : " + S1.trim().length());
		//trim().length() works
		//length().trim() does not work
		//length().trim().length() does not work	
	}
	
	
	public static void isEmptyMethod() {
		String S1 = "";
		System.out.println("To check whether S1 is empty or not : " + S1.isEmpty()); //returns boolean
		boolean b1 = S1.isEmpty();
		System.out.println(b1);
	}
	
	public static void equalsMethod() {
		String S1 = "Orange";
		String S2 = "Orange";
		
		System.out.println("Checking equals method for these two Strings : " + S1.equals(S2));
	}
	
	public static void equalsIgnoreCaseMethod() {
		String S1 = "Orange"; //lower case
		String S2 = "ORANGE"; //UPPER CASE
		System.out.println("Checking equals method for these two Strings : " + S1.equalsIgnoreCase(S2));
		
	}
	
	public static void compareToMethod() {
		String S1 = "Blue";
		System.out.println(S1.length());
		String S2 = "Blue Lagoon";
		System.out.println(S2.length());
		System.out.println("Trying to compare two string : " + S2.compareTo(S1));
		//no of characters in S2 - no of characters in S1	
	}
	
	public static void compareToIgnoreCaseMethod() {
		String S1 = "Blue";
		System.out.println(S1.length());
		String S2 = "BLUE";
		System.out.println(S2.length());
		
		System.out.println("Trying to compare two string : " + S2.compareTo(S1));
		System.out.println("Trying to compare two string : " + S2.compareToIgnoreCase(S1));
		//no of characters in S2 - no of characters in S1	
	}
	
	public static void concatMethod() {
		String S1 = "Hello";
		String S2 = "World";
		System.out.println("Concatenation these Strins : " + S1.concat(S2));
	}
	
	public static void joinMethod() {
		String S1 = "Hello";
		String S2 = "World";
		String S3 = "Java";
		System.out.println(String.join(":", S1, S2, S3));
		System.out.println(String.join("_", S1, S2, S3));
		System.out.println(String.join("&", S1, S2, S3));
		
	}
	

}
