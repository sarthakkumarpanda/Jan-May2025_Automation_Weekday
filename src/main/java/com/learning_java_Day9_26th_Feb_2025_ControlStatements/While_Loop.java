package com.learning_java_Day9_26th_Feb_2025_ControlStatements;

public class While_Loop {
	
	
	public static void assignment() {
		
		//WAP to print first 20 multiples of 10 and add all the multiples and give the sum
		//10,20,30,........200
		//10+20+30+....+200 = ????? sum ?????
		
		int i = 1;
		int sum = 0;
		while( i<=20) {
			System.out.print(i*10 + " ");
			sum = sum + (i*10);
			i++;
			System.out.println();
			System.out.println("Individual sum is:  " + sum);
		}
		
		System.out.println("Total sum is : " + sum);
		
	}
	
	public static void whatiswhileloop() {
		//when the end point is not clear
		//when something tends to infinity we use while loop
		
	}

	public static void main(String[] args) {
		
		assignment();
		
		/*
		 * int i = 1; while(i<=6) { System.out.println(i); //i is still 1, 2, 3 i++; //i
		 * becomes 2, now 2 will become 3, 4 }
		 */
		
		//WAP to print first 20 natural numbers using While loop
		int j = 1;
		while(j<=20) {
			System.out.print(j + " "); 
			j++; 
		}
		
		System.out.println();
		
		//WAP to print in reverse 100 to 1
		
		int k = 100;
		while (k >= 1) {
			System.out.print(k + " ");
			k--;
		}
		
		System.out.println();
		
		//WAP to print first 20 multiples of 10
		int l = 1;
		while(l <= 20) {
			System.out.print(l * 10 + " ");
			l++;
		}
		
		System.out.println();
		
		
	}

}
