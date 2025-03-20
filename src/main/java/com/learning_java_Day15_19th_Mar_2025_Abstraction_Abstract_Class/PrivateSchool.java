package com.learning_java_Day15_19th_Mar_2025_Abstraction_Abstract_Class;

public class PrivateSchool extends Student{

	public static void main(String[] args) {
		PrivateSchool privateschool = new PrivateSchool(); //Able to create the object of the Child class which is not abstract
		privateschool.studentMarksheet();
		privateschool.studentPlayGround();
		privateschool.studentSwimmingPool();
		
		//In this example our parent class is an abstract class. Can I make its object ???
		
		//Student student = new Student();  //can never create the object of Abstract Class
		
		Student student = new PrivateSchool(); //here the parent class reference is pointing to the Child class Object
		student.studentLibrary();
		student.studentPlayGround();
		
		// PrivateSchool ps = new Student(); //Child class cannot point to Abstract Class Parent object

	}

	@Override
	public void studentMarksheet() {
			
	}

	@Override
	public void studentPlayGround() {
		
		
	}

	@Override
	public void studentSwimmingPool() {
		
		
	}

}
