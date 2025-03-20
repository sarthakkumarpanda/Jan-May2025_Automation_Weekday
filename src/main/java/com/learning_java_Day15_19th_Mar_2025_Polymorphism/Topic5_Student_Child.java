package com.learning_java_Day15_19th_Mar_2025_Polymorphism;

public class Topic5_Student_Child extends Topic5_School_Parent{ //inheritance
	//Child Class extends Parent Class
	
	//How to achieve Method Overriding?
	//Criteria 1: Method name should be the same
	//Criteria 2: Class name should be different
	//Criteria 3: Parameters/Arguments should be the same
	//Criteria 4: Inheritance has to be there

	public static void main(String[] args) {
		Topic5_Student_Child reference = new Topic5_Student_Child();
		reference.education();
		reference.fees(200);
		reference.annualFunction("Upto Grade 6", "Upto Grade 10", "Upto Grade 12");

	}
	
	//access modifier of the over-ridden method inside the child Class should be equal or higher than the Parent Class
	//final, static and private methods cannot be overriden
	public void education() {
		System.out.println("Student's education");
	}
	
	
	public void fees(int fee) {
		System.out.println("Student's mandatory fee");
	}
	
	
	public void annualFunction(String lowerGrade, String midSenior, String senior) {
		System.out.println("Student's annual function celebration");
	}
	
	

}
