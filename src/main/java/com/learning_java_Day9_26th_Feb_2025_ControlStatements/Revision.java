package com.learning_java_Day9_26th_Feb_2025_ControlStatements;

public class Revision {

	public static void main(String[] args) {
		//increment and decrement operations are basically addendum to logic. 
		
		//0 - false
		//1 - true
		//+ stands for plus which means add (addition)
		// ++ does not stand for addition. It stands for incrementation
		
		int i=1;
		int j=2;
		System.out.println(i + j);
		//System.out.println(i ++ j);
		
		System.out.println("**************************************");
		
		test();

	}
	
	public static void test() {
		//  increment or decrement can be attached to a variable
		// prior to the variable or post variable
		
		int i=1; //i has been initialized to 1
		i++; //this is a post increment operator //here i will become 2
		++i; //this is a pre increment operator //here i will become 3
		i++; //here i will become 4
		
		--i; //here i will become 3
		i--; //here i will become 2
		
		int j; //j has not been assigned or initialized any kind of value
		//now you want to equate j with i
		j = i++ + i++; //left to right
		
		//i was 4 and j was 5
		
		j = ++i + ++i;
	//  j = 5   +  6 = 11
	//  i = 5,     6
		
	
		
		System.out.println(i); //6
		System.out.println(j); //11
	}
	
	
}
