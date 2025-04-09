package com.learning_java_Day20_8th_Apr_2025_Strings;

public class Topic6_Split_Operation {
	//Splitting is done by the split() method
	//Is used to break a string into multiple parts based on a specific character known as 'demiliter'
	//This delimiter can be space, comma, etc
	
	//The split() method returns an array of Strings - important interview question
	//if the delimiter is not found, the array will just have the original string
	//if there are multiple spaces or special characters, handle them wisely

	public static void main(String[] args) {
		splitBySpace();
		splitByComma();
		splitByHyphen();
		splitByHyphenBetterApproach();

	}
	
	public static void HomeAssignment() {
		String emails = "john.cena@wwe.com, drew_pitch@yahoo.com, jake_wally@gmail.com";
		//Please extract username and domains from multiple emails
	}
	
	
	public static void splitBySpace() {
		String sentence = "I love Automation";
		System.out.println(sentence);
		 String[] words =  sentence.split(" ");
		 
		 for(String word : words) {
			 System.out.println(word);
		 }
	}
	
	public static void splitByComma() {
		String data = "apple, banana, orange, grapes";
		 String[] fruits = data.split(",");
		                   
		 
		 for(String fruit : fruits) {
			 System.out.println(fruit.trim());
		 }
	}
	
	public static void splitByHyphen() {
		String date = "2024-04-08";
		String[] parts = date.split("-");
		System.out.println("Year : " + parts[0]);
		System.out.println("Month : " + parts[1]);
		System.out.println("Day : " + parts[2]);
	}
	
	public static void splitByHyphenBetterApproach() {
	    String date = "2024-04-08";
	    String[] parts = date.split("-");

	    String[] labels = {"Year", "Month", "Day"};

	    for (int i = 0; i < parts.length; i++) {
	        System.out.println(labels[i] + " : " + parts[i]);
	    }
	}
	
	

}
