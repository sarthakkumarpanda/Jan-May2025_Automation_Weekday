package com.learning_java_Day15_19th_Mar_2025_Polymorphism;

public class Topic5_School_Parent { //this is the parent class
	
	
	void education() {
		System.out.println("School's education");
	}
	
	public void fees(int fee) {
		System.out.println("School's mandatory fee");
	}
	
	public void annualFunction(String lowerGrade, String midSenior, String senior) {
		System.out.println("School's annual function celebration");
	}
	
	public static void checkBook() {
		System.out.println("School's checkbook");
		//this method cannot be overriden in the Child Class
	}

}
