package com.learning_java_Day11_5th_Mar_2025_Methods;

public class ParameterizedMethods {

	//What is parameterization ??
	//action performed on various parameters over the same logic again and again
	public static void main(String[] args) {
		
		addTwoNumbers(60,40);
		compareTwoValues("Hello", "World");
		compareTwoValues("Hello", "Hello");
	}
	
	
	public static void addTwoNumbers(int i, int j) {
		System.out.println(i+j);	
	}
	
	public static void compareTwoValues(String S1, String S2) {
		System.out.println(S1.equals(S2));
	}

}
