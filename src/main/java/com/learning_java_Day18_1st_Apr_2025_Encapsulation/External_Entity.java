package com.learning_java_Day18_1st_Apr_2025_Encapsulation;

public class External_Entity {

	public static void main(String[] args) {
		Student_EnclosedUnit student = new Student_EnclosedUnit();
		student.setData("John", 10, 3.4);
		
		System.out.println(student.getNameOfStudent());
		System.out.println(student.getageOfStudent());
	    System.out.println(student.getHeightOfStudent());

	}

}
