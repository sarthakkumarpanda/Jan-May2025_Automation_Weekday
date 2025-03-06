package com.learning_java_Day11_5th_Mar_2025_ForLoops;

public class PatternProgramming3 {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {

			for (int j=5; j>=i; j--) {
				System.out.print("* ");
			}

			System.out.println();

		}
		
		
		
		System.out.println();
		
		another();

	}
	
	
	public static void another() {
		for (int i=1; i<=5; i++) {

			for (int j=i; j<=5; j++) {
				System.out.print("* ");
			}

			System.out.println();

		}
	}

}
