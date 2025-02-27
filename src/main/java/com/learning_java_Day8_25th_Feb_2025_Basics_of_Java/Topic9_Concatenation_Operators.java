package com.learning_java_Day8_25th_Feb_2025_Basics_of_Java;

public class Topic9_Concatenation_Operators {

	public static void main(String[] args) {
		//concatention means joining. It is not adding
		
		int i = 10;
		int j = 20;
		int k = 30;
		String firstname = "John";
		String lastname = "Cena";
		
		System.out.println(i + j + k + firstname + lastname);
		System.out.println(firstname + lastname + i + j + k);
		System.out.println(i+j+firstname + lastname + k);

	}

}
