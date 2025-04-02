package com.learning_java_Day18_1st_Apr_2025_Encapsulation;

public class Student_EnclosedUnit {
	
	//1. Declare some instance variables as private
	
	private String name;
	private int age;
	private double height;
	
	//2. We use getter and setter methods which should be associated with these instance variables
	
	
	public void setData(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public String getNameOfStudent() {
		return name;
	}
	
	public int getageOfStudent() {
		return age;
	}
	
	public double getHeightOfStudent() {
		return height;
	}
}
