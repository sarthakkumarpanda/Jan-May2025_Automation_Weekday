package com.learning_java_Day9_26th_Feb_2025_ControlStatements;

public class Topic5_Forloop {
	
	public static void print1to10() {
		for(int i=1 ; i<=10 ; i++) {
			System.out.print(i + " ");
		}
	}
	
	public static void print100to1() {
		for(int i=100 ; i>=1 ; i-- ) {
			System.out.print(i + " ");
		}
	}
	
	public static void printFirst100EvenNumbers() {
		//2,4,6,8,10....................................,200
		for(int i=1 ; i<=100 ; i++) {
			System.out.print(2*i + " ");
		}
	}
	
	

	public static void main(String[] args) {
		print1to10();
		
		System.out.println();
		
		print100to1();
		
		System.out.println();
		
		printFirst100EvenNumbers();
	}

}
