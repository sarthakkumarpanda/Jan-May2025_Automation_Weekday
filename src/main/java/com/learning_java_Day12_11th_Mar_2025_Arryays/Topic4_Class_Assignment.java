package com.learning_java_Day12_11th_Mar_2025_Arryays;

public class Topic4_Class_Assignment {
	
	//Declare, create, initialize a 1-D array which represents 9 car companies
	//Determine the name of the car company which is in the 4th index
	//Retrieve names of all the car companies

	public static void main(String[] args) {
		
		
		String carCompanies[];
		
		carCompanies = new String[9];
		
		carCompanies[0] = "BMW";
		carCompanies[1] = "Lexus";
		carCompanies[2] = "Mercedes";
		carCompanies[3] = "Toyota";
		carCompanies[4] = "Honda";
		carCompanies[5] = "Nissan";
		carCompanies[6] = "Ford";
		carCompanies[7] = "Chevrolet";
		carCompanies[8] = "Chevrolet";
		
		System.out.println("The car company in the 4th index: " + carCompanies[3]);
		
		for(int i=0 ; i<carCompanies.length ; i++) {
			System.out.println(carCompanies[i]);
		}
		
	
		
		

	}

}
