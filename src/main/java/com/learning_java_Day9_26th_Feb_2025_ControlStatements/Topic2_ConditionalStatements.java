package com.learning_java_Day9_26th_Feb_2025_ControlStatements;

public class Topic2_ConditionalStatements {

	public static void main(String[] args) {
	
		
		//if (you study hard) - then eventually you will get a job
		//else you will do what you were doing before
		
		//Syntax of if
		
		if(1<2) { //condition is true. So the control will come inside body of if
		 System.out.println("The condition is correct so this line will be printed");
		}
		
		if(200 > 500) { //condition is false
			System.out.println("Grass is Green");
		}
		
		if(300 > 100) {
			System.out.println(true);
		}
		
		
		
		if(200 != 200) {
			System.out.println("Rose is Red");
		}else {
			System.out.println("Rose is not Red");
		}

	}

}
