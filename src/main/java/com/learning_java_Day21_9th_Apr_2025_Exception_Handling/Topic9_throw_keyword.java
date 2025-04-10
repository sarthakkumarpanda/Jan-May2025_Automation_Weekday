package com.learning_java_Day21_9th_Apr_2025_Exception_Handling;

public class Topic9_throw_keyword {
	
	//throw keyword is basically used for the Customer/user-defined Exceptions
	//if there is a pre-defined Exception - avoid using the throw keyword

	
	
	public static void divideByzero() {
		int a=10, b=0;
		int c = a/b;
		System.out.println(c);
		throw new ArithmeticException(); // this has to be the last statement in a method
		//System.out.println("Hello World");
	}
	
	public class ThrowExample {
	    public static void main(String[] args) {
	        int age = 15;
	        if (age < 18) {
	            throw new ArithmeticException("You must be 18 or older to vote.");
	        }
	        System.out.println("You are eligible to vote.");
	    }
	}

	public class ThrowWithTryCatch {
	    public static void checkNumber(int num) {
	        if (num < 0) {
	            throw new IllegalArgumentException("Number can't be negative");
	        } else {
	            System.out.println("Number is: " + num);
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            checkNumber(-5);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Caught Exception: " + e.getMessage());
	        }
	    }
	}

}


