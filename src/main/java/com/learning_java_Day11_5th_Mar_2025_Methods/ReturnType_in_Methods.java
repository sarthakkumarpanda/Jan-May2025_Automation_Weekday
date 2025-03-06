package com.learning_java_Day11_5th_Mar_2025_Methods;

public class ReturnType_in_Methods {
	
	//Return of/on Investment ??
	//401k - 1000$
	
	//60 years old - you expect to be a millionaire
	//your investment portfolio - Fidelity investments
	//Fidelity investments - is a function

	public static void main(String[] args) {
		
		int k = mathematicsLogic(25,75);
		System.out.println(k);
		
		String S3 = joinTwoStrings("Hello", "World");
		System.out.println(S3);
	}
	
	
	public static int mathematicsLogic(int i, int j) {
		int k = i+j;
		return k; //this is int
	}
	
	
	public static String joinTwoStrings(String S1, String S2) {
		String S3 = S1 + S2;
		return S3;
	}

}
