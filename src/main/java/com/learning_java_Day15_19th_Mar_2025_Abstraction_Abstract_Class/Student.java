package com.learning_java_Day15_19th_Mar_2025_Abstraction_Abstract_Class;

//An abstract class can hold abstract methods
//An normal class cannot hold abstract methods
//An abstract can hold normal methods

public abstract class Student {
	
	
	
	//that method is known as unimplemented method or undefined method. This is also known as abstract method
	//a method which does not have a body
	
	public void test() {
		//this is the body of the method. When a method has a body which is visible then it is a normal/simple/concrete
	}
	
	public abstract void studentMarksheet(); //this is a method which does not have a body
	// public static abstract void studentGraduationResult(); //abstract methods cannot be static
	
	public abstract void studentPlayGround();
	
	public abstract void studentSwimmingPool();
	
	
	public void studentLibrary() {
		System.out.println("This is a simple method or concrete method");
	}
	
	public static void studentMusicHall() {
		System.out.println("This is a static method of student");
	}

}
