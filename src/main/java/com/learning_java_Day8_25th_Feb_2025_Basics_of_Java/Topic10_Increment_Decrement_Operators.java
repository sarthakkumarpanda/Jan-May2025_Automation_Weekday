package com.learning_java_Day8_25th_Feb_2025_Basics_of_Java;

public class Topic10_Increment_Decrement_Operators {
	
	//  ++
	//  --

	public static void main(String[] args) {
		
	int i = 1; //what is the latest value of i ?? 1
	i++; //what is the latest value of i ?? 2
	
	int j = 1;
	j = i++; //i becomes 3 because the ++ operator is attached to the body of i so it has to increment itself
	System.out.println(j); //2
	System.out.println(i); //3
	
	//i was 3
	//j was 2
	
	int k = 2; //here k is 2
	k = ++j; //here k will be 1+2 = 3, and j will become 3 as well
	j = i++; //j will become 3, and i will become 4
	
	System.out.println(i); //4
	System.out.println(j); //3 
	System.out.println(k); // 3
	

	}

}
