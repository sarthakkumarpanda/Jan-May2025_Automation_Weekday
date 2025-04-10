package com.learning_java_Day21_9th_Apr_2025_Exception_Handling;

public class Topic4_How_to_handle_Exceptions {

	public static void main(String[] args) {
		
		anotherExample();
	}
	
	public static void anotherExample() {
		int a = 10, b =0;
		int c = a/b;
		System.out.println(c);
	}
	
	public static void explanation() {
	/*
	 Step 1: The programmer will do a logical mistake. Inside a method
	 Step 2: Compiler is not able to interfer, that means this is not a CompileTime(Checked) Exception
	 Step 3: This method which holds the logical mistake will create an Object
	 Step 4: This object will have 3 things: 1. Name of the Exception
	                                         2. Description of the Exception
	                                         3. Stacktrace
	 Step 5: Even though the method created that Object, it is under no position to handle the object
	 Step 6: It will pass the object to JVM
	 Step7: JVM will check whether it can handle the exception. If not it will pass it to Default Exception Handler
	 Step 8: But before handing over this object to DEH, jvm will abruptly terminate the program
	 Step 9: DEH will print the exception details in the output console
	 */
	}
	
	public static void howToHandleExceptionManually() {
		//Java gives you 5 different keywords to handle the exception manually
		//1. try
		//2. catch
		//3. finally
		//4. throw
		//5. throws
		
	}

}
