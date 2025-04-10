package com.learning_java_Day21_9th_Apr_2025_Exception_Handling;

public class Topic5_Try_Catch_Block {

	public static void main(String[] args) {
		
		//anotherExample();
		example2();
	}

	public static void anotherExample() {
		try {
			int a = 10, b =0;
			int c = a/b; //risky code
			System.out.println(c);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(20 + 30);
		}
	}
	
	public static void example2() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
	}
}
