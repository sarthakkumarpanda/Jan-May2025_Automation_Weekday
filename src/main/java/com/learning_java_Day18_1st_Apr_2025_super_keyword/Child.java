package com.learning_java_Day18_1st_Apr_2025_super_keyword;

//super keyword is used to refer to immediate parent class instance variable
//can be used to invoke immediate parent class method
//super() can be used to invoke immediate parent class constructor.

public class Child extends Parent{
	
	int i=20;
	
	
	public static void main(String[] args) {
		Child child = new Child(); //When you create an object of a subclass (like Child), the constructor of the parent class (Parent) is automatically called first — even if you don't explicitly call it.
		child.show(50);
		Child child1 = new Child("Green");
		
		
	}
	
	void show(int i) {
	 System.out.println(super.a);
	 super.takeAway();
	}
	
	public Child() {
		
	}
	
	public Child(String S1) {
		super(S1);
	}
	


}
