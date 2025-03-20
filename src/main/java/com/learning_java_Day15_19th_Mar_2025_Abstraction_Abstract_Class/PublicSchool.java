package com.learning_java_Day15_19th_Mar_2025_Abstraction_Abstract_Class;

public class PublicSchool extends Student{ //I am trying to extend an Abstract Class - Normal Class extends Abstract Class
	
	//whenever a normal class extends an Abstract class, then you need to implement the unimplemented methods of the Parent(Abstract) Class

	@Override
	public void studentMarksheet() {
	System.out.println("Student's Marksheet will be mailed individually");
	}

	@Override
	public void studentPlayGround() {
	System.out.println("Student's playground will be open on Sundays in summer holidays");	
	}

	@Override
	public void studentSwimmingPool() {
    System.out.println("Swimming pool will be closed on Thursday evenings");		
	}
	
	
	public void hallAssembly() {
		
	}
	
	public void schoolCafeteria() {
		
	}
	
	

}
