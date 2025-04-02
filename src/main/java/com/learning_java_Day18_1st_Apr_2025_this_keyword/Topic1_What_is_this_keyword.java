package com.learning_java_Day18_1st_Apr_2025_this_keyword;

public class Topic1_What_is_this_keyword {
	//this keyword is a reference variable which refers to the Object
	
	int i; //this is an instance variable. Part of the object
	
	
	void setValues(int i) { //x is a local variable
		this.i = i; //this keyword refers to the current class instance variable
	}
	
	
	void getShow() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		Topic1_What_is_this_keyword reference = new Topic1_What_is_this_keyword();
		reference.setValues(100);  //x is set to 100
		reference.getShow();
	}

}
