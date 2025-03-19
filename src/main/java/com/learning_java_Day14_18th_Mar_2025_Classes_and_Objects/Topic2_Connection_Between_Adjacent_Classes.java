package com.learning_java_Day14_18th_Mar_2025_Classes_and_Objects;

public class Topic2_Connection_Between_Adjacent_Classes {

	public static void main(String[] args) {
		
     Logic1.addition();
     Logic1.subtraction();
     Logic2.multiply();
	}

}

class Logic1 {
	
	public static void addition() {
		System.out.println(10 + 90);
		
		String S1 = "Hello"; //String is a datatype but it is also a pre-defined Class in java
	}
	
	public static void subtraction() {
		System.out.println(10 - 5);
	}
	
	
}

class Logic2{
	
	public static void multiply() {
		System.out.println(10 * 90);
	}
}
