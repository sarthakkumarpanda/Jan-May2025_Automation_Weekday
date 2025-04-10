package com.learning_java_Day21_9th_Apr_2025_Exception_Handling;

import java.io.FileInputStream;

public class Topic10_throws_keyword {

	public static void main(String[] args) throws Exception {
		divideByZero(); //main method is acting as the caller method. main method is calling the method which has exception in it.
 //so now it is the responsibility of the caller method to handle the exception
		
		fileIsPresentOrNotAtAParticularLocation();
	}
	
	
	public static void fileIsPresentOrNotAtAParticularLocation() throws Exception {
		FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\OneDrive\\Desktop\\HP\\Logic.txt");
		//logic is to read the file or to write into the file
	}
	
	
	public static void divideByZero() {
		     int i = 1;
		     int j = i/0;
		     System.out.println(j);
	}

}
