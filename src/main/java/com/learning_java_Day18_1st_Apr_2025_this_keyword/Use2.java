package com.learning_java_Day18_1st_Apr_2025_this_keyword;

public class Use2 {

	//this keyword can be used to invoke current class method(implicitly)
	
	void display() {
		System.out.println("Hello World");
	}
	
	void show() {
		     display(); 
		this.display(); //this is explicit use of this keyword
		
		//in case you are calling a current class method implicitly
		//even if you do not use the word this, by default the java compiler will associate this keyword to it.
	}
	
	
	public static void main(String[] args) {
		Use2 use2 = new Use2();
		use2.show();
		
	}
}
