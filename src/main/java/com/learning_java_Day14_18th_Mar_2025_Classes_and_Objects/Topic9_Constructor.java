package com.learning_java_Day14_18th_Mar_2025_Classes_and_Objects;

public class Topic9_Constructor {
	
	//Constructors initialize Object
	//Constructors will never create an Object
	//Constructors help in optimizing code
	//All the access modifiers will work while designing constructors
	//Constructors are invoked by default when an object is created
	//Constructors do not have a return type not even void
	//Constructor is a block. It looks like a method but it is not a method
	
	
	//there is a University which has close to 5000 students
	//in the student portal page there are overall 30 entries and 5 are mandatory
	
	//1 student = 30 lines of code
	//5000 students = 150000 lines of code
	
	String firstname; //what is the default value of a String ??? null
	String lastname;
	int DOB; //mmddyyyy   //what is the default value of an int ?? 0
	String address;
	int mobileNumber;
	boolean graduated; //what is the default value of boolean ?? false
	
	
	public Topic9_Constructor(String firstname, String lastname, int DOB, String address, int mobileNumber, boolean graduated) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.DOB = DOB;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.graduated = graduated;
		
	}
	
	

	public static void main(String[] args) {
		
		Topic9_Constructor student1 = new Topic9_Constructor("Tom", "Alter", 10191990, "1 Hathaway St", 987654321, true);
		System.out.println(student1.firstname + student1.lastname + student1.DOB + student1.address + student1.mobileNumber + student1.graduated);
		

	}
	
	public static void crazyWayOfEnteringStudentDetails() {
		String student1FirstName = "Tom";
		String student1LastName = "Alter";
		int student1DOB = 10192003;
		int student1mob = 987654321;
		boolean student1grad = true;
		
		String student2FirstName = "John";
		String student2LastName = "Cena";
		int student2DOB = 10192003;
		int student2mob = 987654321;
		boolean student2grad = true;
	}

}
