package com.learning_java_Day14_18th_Mar_2025_Classes_and_Objects;

public class Topic7_Calling_static_and_nonstatic {
	    //static can be called directly
		//static can be called using the classname
		//static entity can be called by static entity directly
		//static cannot call non static entities
	
	    //To access non-static entities you need an object
		//non static can call each other
		//non static can call static entities
		//object reference can call non-static entities but it can also call static entities(even though it is not recommended)
	
	static String firstname;
	static String lastname;
	static String email;
	static int telephone;
	static int age;
	
	String password;
	String confirmPassword;
	long accountNumber;
	int OTP;
	
	public static void main(String[] args) {
		firstname = "Tom";
		logic1();
		Topic7_Calling_static_and_nonstatic.logic2();
		Topic7_Calling_static_and_nonstatic reference = new Topic7_Calling_static_and_nonstatic(); //this is an object
		reference.password = "Selenium@123";
		reference.logic4("Selenium@123", "Selenium@123");
		reference.logic1();
		
	}
	
	public static void logic1() {
		System.out.println("This is static method logic1");
		logic2();
		lastname = "Alter";
		
	}

	public static void logic2() {
		System.out.println("This is static method logic2");
	}
	
	public static void logic3() {
		System.out.println("This is static method logic3");
	}
	
	public void logic4(String password, String confirmPassword) {
		this.password = password;
		this.confirmPassword = confirmPassword;
		logic5(123456789, 1234);
		logic1();
	}
	
	public void logic5(long accountNumber, int OTP) {
		this.accountNumber = accountNumber;
		this.OTP = OTP;
	}
}
