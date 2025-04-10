package com.learning_java_Day21_9th_Apr_2025_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Topic3_CompileTime_vs_RunTime_Exceptions {
	
	//CompileTime(Checked) exceptions are the exceptions which can be handled by the compiler at compile time
	//RunTime(Unchecked) exceptions are the exceptions which cannot be handled byu the compiler at compile time
	
	//Exceptions always occur at RunTime. Exceptions never occur at CompileTime

	public static void main(String[] args) {
		//example();
		anotherExample();

	}
	
	public static void fileIsPresentOrNotAtAParticularLocation() throws FileNotFoundException {
		FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\OneDrive\\Desktop\\HP\\Logic.txt");
		//What if the path you are specifying is incorrect ?
		//What if the file has been deleted while you are executing the code?
		//What if the file name has changed ?
		
		//So this is an example of CompileTime Exception
	}
	
	
	public static void classNotFoundExceptionExample() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//So this is also an example of CompileTime Exception
	}
	
	public static void example() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5/0); //is Eclipse giving any kind of warning here ? No. So this is an example of RunTime Exception 
		System.out.println(6); 
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
	}

	public static void anotherExample() {
		int a = 10, b =0;
		int c = a/b; //this is bad code. But Compiler is not warning. So this is also an example of Runtime Exception
		System.out.println(c);
	}
	
	
	
	
	
	
}
