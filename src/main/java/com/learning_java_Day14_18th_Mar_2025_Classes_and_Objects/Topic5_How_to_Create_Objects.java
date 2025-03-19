package com.learning_java_Day14_18th_Mar_2025_Classes_and_Objects;

public class Topic5_How_to_Create_Objects {
	
	//In Java there are 5 ways to create Object
	//1. new keyword[99.99% of Objects in java are created using new keyword]
	//2. newInstance() method
	//3. clone() method
	//4. Deserialization
	//5. factory methods
	
	//Java is an Object Oriented Programming Language
	
	String name;
	int age;
	double height;
	int rollNumber;

	public static void main(String[] args) {
		
		Topic5_How_to_Create_Objects reference = new Topic5_How_to_Create_Objects();
		reference.name = "Eric";
		reference.age = 25;
		reference.height = 6.0;
		reference.rollNumber = 1;
		
		Topic5_How_to_Create_Objects reference1 = new Topic5_How_to_Create_Objects();
		reference1.name = "Adam";
		reference1.age = 25;
		reference1.height = 6.2;
		reference1.rollNumber = 2;
		
		reference.test();
	}
	
	public void test() {
		System.out.println("Learning concept of Objects in java");
	}

}
