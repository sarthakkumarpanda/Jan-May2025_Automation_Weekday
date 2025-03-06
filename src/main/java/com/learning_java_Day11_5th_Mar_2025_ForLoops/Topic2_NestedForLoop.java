package com.learning_java_Day11_5th_Mar_2025_ForLoops;

public class Topic2_NestedForLoop {
	
	//for loop inside for loop
	//for loop inside while loop
	
	
	//for every iteration of the outer for loop, all the iterations of the inner for loop gets executed

	public static void main(String[] args) {
		
		
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("This is the outer for loop");
			
			for (int j=1 ; j<=5 ; j++) {
				System.out.println("This is inner for loop");
			}
			
			
			
		}
		
		

	}

}
