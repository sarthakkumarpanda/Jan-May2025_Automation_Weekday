package com.learning_java_Day14_18th_Mar_2025_Classes_and_Objects;

public class Topic4_Define_Objects {
	
	//Definition: Object is collection of all the non-static entities of the class
	//            Object is instance of a Class
	
	String name;
	int age;
	static int no_of_paws;
	String color;
	String behavior;

	public static void main(String[] args) {
		//static entity. So main method cannot be part of the Object
	}
	
	public static void checkBehavior() {
		System.out.println("Labradors are docile");
	}
	
	public void foodie() {
		System.out.println("Labradors eat anything");
	}

}

//name, age, color, behavior, foodie() - these are the non-static entities of the Class
