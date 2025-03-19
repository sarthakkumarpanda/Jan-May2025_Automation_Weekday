package com.learning_java_Day14_18th_Mar_2025_Classes_and_Objects;

public class Topic1_Introduction_to_Class {
	
	//Various definitions of a Class in java
	//1. Class is a blueprint or a template which allows a developer to convey his/her logic
	//2. It represents set of properties that are common to all the objects of one type
	//3. Class does not occupy memory space because it is not a physical entity
	//4. Class is known as collection of methods, objects, variables, blocks, constructors and also adjancent classes

	
	public static void main(String[] args) {
		//this is a method
		Topic1_Introduction_to_Class obj = new Topic1_Introduction_to_Class(); //is the object
	}
	
	static {
		//this is a block
	}
	
	int i=10; //this is a variable
	
	public void test() {
		//this is a non-static method
	}
	
	public Topic1_Introduction_to_Class() {
		//this is a constructor
	}

}

 class Ending_Discussion_of_Classes {
	//this is known as an adjacent class
	//the adjacent class has to have a default access modifier
}
