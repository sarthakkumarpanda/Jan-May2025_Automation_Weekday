package com.learning_java_Day9_26th_Feb_2025_ControlStatements;

public class Topic4_Nested_if {

	public static void main(String[] args) {
		
		//1st condition - your age should be > than 18
		//2nd condition - you should be a Citizen
		
		//Eligible to vote.
		
		int age = 20;
		boolean isThatPersonCitizen = true;
		
		if(age >= 18) {
			if(isThatPersonCitizen) {
				System.out.println("The person is eligible to vote");
			}
		}
	}

}
