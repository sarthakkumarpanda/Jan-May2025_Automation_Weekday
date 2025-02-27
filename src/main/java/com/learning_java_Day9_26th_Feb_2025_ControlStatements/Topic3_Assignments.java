package com.learning_java_Day9_26th_Feb_2025_ControlStatements;

public class Topic3_Assignments {

	public static void main(String[] args) {
		// WAP to print the largest of 3 numbers
		
		int i = 20;
		int j = 30;
		int k = 40;
		
		if(i>j && i>k) {//false && false = false
			System.out.println("i is the greatest :" + i);
		}else if(j>k && j>i) { //false && true = false
			System.out.println("j is the greatest :" + j);
		}else {
			System.out.println("k is the greatest :" + k);
		}
		
		//LEAP YEAR ? Feb has 29 days it is a leap year
		//Logic of leap year
		
		//Either the year should be properly divisible by 400
		// OR
		//It should be properly divisible by 4 but not divisible by 100
		
		int year1 = 1996;
		int year2 = 1900;
		int year3 = 2002;
		int year4 = 2000;
		
		
		if((year1 % 400 == 0) || (year1 % 4 ==0 && year1 % 100 != 0)){
			System.out.println("Year1 is a leap year : " + year1);
		}else {
			System.out.println("Year1 is not a leap year");
		}
		
		if((year2 % 400 == 0) || (year2 % 4 ==0 && year2 % 100 != 0)){
			System.out.println("Year2 is a leap year : " + year2);
		}else {
			System.out.println("Year2 is not a leap year");
		}
		
		if((year3 % 400 == 0) || (year3 % 4 ==0 && year3 % 100 != 0)){
			System.out.println("Year3 is a leap year : " + year3);
		}else {
			System.out.println("Year3 is not a leap year");
		}
		
		
		if((year4 % 400 == 0) || (year4 % 4 ==0 && year4 % 100 != 0)){
			System.out.println("Year4 is a leap year : " + year4);
		}else {
			System.out.println("Year4 is not a leap year");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
