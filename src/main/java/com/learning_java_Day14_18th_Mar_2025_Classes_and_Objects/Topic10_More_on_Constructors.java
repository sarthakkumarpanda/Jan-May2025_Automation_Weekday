package com.learning_java_Day14_18th_Mar_2025_Classes_and_Objects;

public class Topic10_More_on_Constructors {
	
	//Types
	//1. default constructor - the moment an object is created, jvm by default creates this constructor which cannot be seen via naked eye
	//2. User defined / Copy constructor
	//3. Parameterized constructors(user defined)
	
	String model;
	String color;

	public static void main(String[] args) {
		Topic10_More_on_Constructors reference = new Topic10_More_on_Constructors();
		
		Topic10_More_on_Constructors reference1 = new Topic10_More_on_Constructors("BMW", "White");
		reference1.displayCarInfo();

	}
	
	public Topic10_More_on_Constructors() {
		//this is user defined constructor
	}
	
	public Topic10_More_on_Constructors(String model, String color) { //it is user defined but it is parameterized
		this.model = model;
		this.color = color;
	}
	
	public void displayCarInfo() {
		System.out.println("The model of the car is: " + model + ", the color of the car is : " + color);
	}
	

}
