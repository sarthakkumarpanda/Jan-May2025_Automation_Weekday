package com.learning_java_Day14_18th_Mar_2025_Classes_and_Objects;

public class Topic3_Variables_in_Java {
	
	//Variables in java are divided into 3 types
	//1. Instance Variables
	//2. Static Variables
	//3. Local Variables
	
	int age; //age is a class variable. This is also known as an instance variable
	static double height; //height is a static variable because static keyword is associated with it
	//all static variables are class variables, but not all class variables are necessarily static.

	public static void main(String[] args) {
	

	}
	
	
	public static void logic() {
		int i = 20; //here i is a local variable
		//static int j = 25; //this is not possible. Local variables cannot be declared static. Does this mean j is non-static ? NO
		//Answer: Local variables are neither static nor non-static
	}

}
