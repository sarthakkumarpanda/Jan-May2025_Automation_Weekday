package com.learning_java_Day21_9th_Apr_2025_Exception_Handling;

public class Topic7_finally_Block {
	
	//1. finally block will execute no matter Exception will occur or not
	//2. finally block cannot be used alone
	//3. finally block can be executed with try block. You may choose not to use catch block but in case there is an Exception - it will not be handled
	
	//try block - which will have the risky code
	//catch block - which will handle the risky code
	//finally block - it is an imposing code

	public static void main(String[] args) {
		
		anotherExample();
	}
	
	public static void anotherExample() {
		try {
			int a = 10, b =0;
			int c = a/b;  //risky code
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("No matter I will be printed : " + (1+2));
		}
	}

}
