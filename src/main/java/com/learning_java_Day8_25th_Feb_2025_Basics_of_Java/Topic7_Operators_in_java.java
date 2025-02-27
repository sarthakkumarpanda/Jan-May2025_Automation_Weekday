package com.learning_java_Day8_25th_Feb_2025_Basics_of_Java;

public class Topic7_Operators_in_java {
	
	//1. Arithmetic Operators +   -   *   /   %   ++(increment operator)  --(decrement operator)
	
	//2. Assignment Operators  =  +=  -=  *=  /=  %=  $=  |=  ^=  >>=  <<=
	
	//3. Comparison Operators  ==  !=  >    <    >=    <=
	
	//4. Logical Operators  && (returns true if both statements are true), || (returns true if either statement is true)
	//                      !(reverse the result)

	public static void main(String[] args) {
		
		int i = 2;
		
		int x = 10;
		x += 5; //x = x+5
		System.out.println(x);
		
		int j = 10;
		int k = 20;
		  //false && true  - false
		if (!(j==k && k != j)){
			System.out.println("Logic is right");
		}else {
			System.out.println("Logic is absolutely wrong");
		}
		
	
	}

}
