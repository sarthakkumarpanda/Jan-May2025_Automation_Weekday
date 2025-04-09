package com.learning_java_Day20_8th_Apr_2025_Strings;

public class Topic6_StringOperations {

	public static void main(String[] args) {
		lengthmethod();
		trimmethod();
		trimandlengthmethodtogether();

	}
	
	public static void lengthmethod() {
		String S1 = "I am learning Java";
		System.out.println("Total characters: " + S1.length());
		
		String S2 = null;
		//System.out.println(S2.length()); //NullPointerException
	}
	
	public static void trimmethod() {
		String S1 ="   I     am    learning    Java   ";
		System.out.println(S1);
		System.out.println(S1.trim()); //trim method will remove the spaces in beginning and end of the string. It will not take care of the spaces in between
	}
	
	public static void trimandlengthmethodtogether() {
		String S1 = "   We are learning Selenium     and    Java    together    ";
		System.out.println("The length of the String before trim operation : " + S1.length());
		System.out.println(S1.trim());
		System.out.println("The length of the String after trim operation : " + S1.trim().length());
	}

}
