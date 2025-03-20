package com.learning_java_Day15_19th_Mar_2025_Polymorphism;

public class Topic2_Method_Overloading {

	    //How to achieve Method Overloading?
		//Criteria 1: Method name should be the same
		//Criteria 2: Should be in the same class
		//Criteria 3: Parameters/Arguments should be different
	
	public static void main(String[] args) {
		name();
		name("Hello");
		name("Hello", "World");
		name(100);
		
		Topic2_Method_Overloading reference = new Topic2_Method_Overloading();
		reference.name(10, 20);

	}
	
	public static void name() {
		System.out.println("This is a no argument method");
	}
	
	public static void name(String S1) {
		System.out.println("This is a single argument method");
	}
	
	public static void name(String S1, String S2) {
		System.out.println("This has two arguments");
	}
	
	public static void name(int i) {
		System.out.println("This is single argument but int datatype");
	}
	
	public void name(int i, int j) {
		System.out.println("This is two arguments but int datatype");
	}

}
