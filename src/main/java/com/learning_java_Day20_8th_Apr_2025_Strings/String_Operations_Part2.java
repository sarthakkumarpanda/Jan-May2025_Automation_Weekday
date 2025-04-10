package com.learning_java_Day20_8th_Apr_2025_Strings;

public class String_Operations_Part2 {
	
	public static void main(String[] args) {
		/* please refer to package part1
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
		*/		
		subSequenceMethod();
		substringMethod();
		replaceMethod();
		replaceFirstMethod();
		replaceAllMethod();
		indexOfMethod();
		lastIndexOfMethod();
		containsMethod();
		charAtMethod();
		endsWithMethod();
		startsWithMethod();
	}
	
	
	public static void subSequenceMethod() {
		String S1 = "The Sky is Blue";
		System.out.println(S1.subSequence(1, 9));
		CharSequence S2 = S1.subSequence(2, 7);
		//e Sky i
		
	}
	
	public static void substringMethod() {
		String S1 = "The Sky is Blue";
		System.out.println(S1.substring(5));
		System.out.println(S1.substring(5, 12));
		
	}
	
	public static void replaceMethod() {
		String S1 = "This is cold";
		System.out.println(S1.replace("is", "was"));
	}
	
	public static void replaceFirstMethod() {
		String S1 = "This is cold";
		System.out.println(S1.replaceFirst("is", "was"));
	}
	
	public static void replaceAllMethod() {
		String S1 = "This is cold and windy and too much snow";
		//Regular Expressions can be used in this method
		System.out.println(S1.replaceAll("is(.)", "was"));
		System.out.println(S1.replaceAll("is(.*)", "was"));
		System.out.println(S1.replaceAll(" ", "_"));
		//System.out.println(S1.replaceAll(" ", "$")); //this is not going to work
		//System.out.println(S1.replaceAll(" ", "+").replaceAll("+", "-"));
		System.out.println(S1.replaceAll(" ", "_").replaceAll("_", "+"));
		
	}
	
	
	public static void indexOfMethod() {
		//total length of a String - represents total characters in the String
		//each character is taking up an index position
		
		String S1 = "This is Selenium";
		System.out.println(S1.indexOf('S'));
		System.out.println(S1.indexOf("Selenium"));
		
	}
	
	public static void lastIndexOfMethod() {
		String S1 = "This is Selenium";
		System.out.println(S1.lastIndexOf('e'));
	}
	
	public static void containsMethod() {
		String S1 = "Hello";
		String S2 = "Hello123";
		System.out.println(S1.contains(S2));
		
	}
	
	public static void charAtMethod() {
		String S1 = "This is Selenium";
		System.out.println(S1.charAt(12));
	}
	
	public static void endsWithMethod() {
		String S1 = "This is Selenium";
		System.out.println(S1.endsWith("nium"));
	}
	
	
	public static void startsWithMethod() {
		String S1 = "This is Selenium";
		System.out.println(S1.startsWith("Thi"));
	}
	
	/*
	Homework: -
	 
	 toLowerCase()
	 toUpperCase()
	 valueOf()
	 toCharArray()
	 StringBuffer Class
	 StringBuilder Class
	 methods inside StringBuilder and StringBuffer classes
	 String vs StringBuffer vs StringBuilder
	 
	 
	 */
	
	
	

}
