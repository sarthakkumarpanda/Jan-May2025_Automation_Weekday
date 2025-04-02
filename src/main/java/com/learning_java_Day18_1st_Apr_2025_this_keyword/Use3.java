package com.learning_java_Day18_1st_Apr_2025_this_keyword;

public class Use3 {
	
	// this() can be used to invoke current class constructor
	
	
	public Use3() {
		System.out.println("This is a no argument constructor");
	}
	
	public Use3(int i) {
		this(); //invokes the current class Constructor
		System.out.println("Parameterized constructor");
		// this(); - do not do this as constructor call should always be the first statement inside a constructor
	}
	
	public Use3(String S1, int i) {
		this();
		System.out.println("This has 2 parameters");
	}
	
	
	public static void main(String[] args) {
		Use3 use3 = new Use3();
		
		Use3 use3_1 = new Use3(100);
		
		Use3 use3_2 = new Use3("John", 40);
	}

}
