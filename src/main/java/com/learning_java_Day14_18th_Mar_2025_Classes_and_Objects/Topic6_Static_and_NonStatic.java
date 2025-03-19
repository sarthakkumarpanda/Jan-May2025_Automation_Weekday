package com.learning_java_Day14_18th_Mar_2025_Classes_and_Objects;

public class Topic6_Static_and_NonStatic {
	//static is a keyword in java
	//static is used to create Class level variables and methods - 
	//static - anything which is associated with static actually belongs to the class and not the object
	//static members can be accessed using the class name itself, without the help of an object
	//use - commonly used for utility methods, constants and certain shared data among instances
	//static can be called directly
	//static can be called using the classname
	//static entity can be called by static entity directly
	//static cannot call non static entities
	
	static int count; //initialize a count variable to let' say zero
	
	public static void main(String[] args) {
		count = 25;
		Topic6_Static_and_NonStatic.displayCount();
		displayCount();
		stopCount();	
	}
	
	public static void displayCount() {
		System.out.println("The count is : " + count);
	}
	
	public static void stopCount() {
		System.out.println("Tired of counting: " + count);
	}

}


class NonStaticExplanation {
	//Non static variables and methods belong to instance of the class. It belongs to the Objectt
	//To access non-static entities you need an object
	//non static can call each other
	//non static can call static entities
	//object reference can call non-static entities but it can also call static entities(even though it is not recommended)
	
}
