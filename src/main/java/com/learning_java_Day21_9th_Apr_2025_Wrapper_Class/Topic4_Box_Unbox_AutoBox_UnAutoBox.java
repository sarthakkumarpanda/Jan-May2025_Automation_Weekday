package com.learning_java_Day21_9th_Apr_2025_Wrapper_Class;

public class Topic4_Box_Unbox_AutoBox_UnAutoBox {
	
	//Boxing - Conversion of primitive data type to Wrapper Class Object
	//Unboxing - Conversion of Wrapper Class Object to primitive data type

	public static void main(String[] args) {
		boxing();	
		autoboxing();
		unboxing();
		autounboxing();
	}
	
	public static void boxing() {
		int a = 10;
		Integer b = Integer.valueOf(a);
		System.out.println("The converted value of a primitive data type into a Wrapper Class Object is : " + b);	
	}
	
	public static void autoboxing() {
		int a = 10;
		Integer b = a;
		System.out.println("The wrapper class object is : " + b);
	}
	
	public static void unboxing() {
		Integer result = 100;
		int newResult = result.intValue();
		System.out.println("The primitive int value is : " + newResult);
	}
	
	public static void autounboxing() {
		Integer result = 100;
		int newResult = result;
		System.out.println("The primitive int value is : " + newResult);
	}

}
