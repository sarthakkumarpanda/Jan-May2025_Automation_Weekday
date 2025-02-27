package com.learning_java_Day8_25th_Feb_2025_Basics_of_Java;

public class Topic11_Inc_Dec_Assignment {
	
	public static void main(String[] args) {
		
		int i=1;  //latest value of i is 1
		i++; //i will become 2
		int j = i++ + ++i;
		//  j = 2   + 4 = 6
		// i =   3,   4
		
		//latest value of i is 4
		//latest value of j is 6
		
		j--; //j becomes 5
		int k = --i - ++j;
		//  k = 3   -  6 = -3
		// i  = 3
		//j =        6
		
		System.out.println(i); //3
		System.out.println(j); //6
		System.out.println(k); //-3
		
		System.out.println("******************************************");
		
		another();
		
		
	}
	

	
	public static void another() {
		
		int i = 1; //latest value of i is 1
		--i; //i becomes 0
		int j = i++ - --i - ++i;
		//  j = 0   - 0   - 1 = -1
		// i  = 1,  0,   1
		
		//so i latest value is +1
		//j latest value is -1
		
		int k = j-- + j++ - --j + i--;
		//  k = -1  + (-2) - (-2) + 1 = -3 + 2 + 1 = 0
		//  j = -2, -1, -2                         = -2
		// i                                          0
		
		System.out.println(i); //0
		System.out.println(j); //-2
		System.out.println(k); //0
		
		
	}

}
