package com.learning_java_Day11_5th_Mar_2025_ForLoops;

public class ForLoop_inside_WhileLoop {

	public static void main(String[] args) {

		int a = 1;
		while (a == 1) { // true condition

			for (int j = 1; j < 9; j++) {
				System.out.println(50 + 50);
			}

			System.out.println("This is the body of the while loop which acts as the outer loop");
			a++;

		}

		System.out.println("The while body will not be executed because condition is false inside while loop");
	}

}
