package com.learning_java_Day11_5th_Mar_2025_Methods;

public abstract class Introduction_Methods {

	// What is a method(function)?
	// Methods are independent units of execution

	// How do you design or construct a method?
	// you can use either of the access modifiers - public, private, protected

	public static void test1() {
      //this is a public method
	}

	private static void test2() {
        //this is a private method
		//banking logic - you do not want to share this concept with anyone 
	}

	protected static void test3() {
       //this is a protected method
	}
	
	static void test4() {
		 //this is a default method
	}
	
	//How many types of methods are there ?
	//1. Concrete methods - if the method has a body
	//2. Unimplemented methods - a method which does not have a body and it is abstract in nature

	public static void main(String[] args) {

	}
	
	
	
	//this is an example of unimplemented method
	public abstract void learnSomething();

}
