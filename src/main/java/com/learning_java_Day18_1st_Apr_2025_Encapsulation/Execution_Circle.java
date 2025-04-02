package com.learning_java_Day18_1st_Apr_2025_Encapsulation;

public class Execution_Circle {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setAreaOfACircle(100, 3.141); //calling the setter method by passing your own parameters
		System.out.println(circle.getAreaOfCircle()); //calling the getter method to get your output as per your input

	}

}
