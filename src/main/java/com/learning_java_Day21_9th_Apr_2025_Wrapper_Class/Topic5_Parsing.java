package com.learning_java_Day21_9th_Apr_2025_Wrapper_Class;

public class Topic5_Parsing {
	//Parsing means converting a String representation of a value into its corresponding data type

	public static void main(String[] args) {
		
		stringToInteger();
		stringToDouble();
		stringToBoolan();
		stringToByte();
		stringToShort();
		stringToLong();
		stringToFloat();
		stringToChar();
	}
	
	public static void stringToChar() {
		//Special Case as Java doesn’t have a Character.parseChar() method.
		String symbol = "$";
		char ch = symbol.charAt(0);  // get the first character
		System.out.println("Character: " + ch);
	}
	
	
	public static void stringToInteger() {
		String price1 = "400";
		String price2 = "600";
		//System.out.println("the total price : " + (price1 + price2));
		
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		System.out.println("the total price : " + (p1 + p2));	
	}
	
	public static void stringToDouble() {
		String price1 = "400.12";
		String price2 = "600.88";
		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);
		System.out.println("the total price : " + (p1 + p2));
	}
	
	public static void stringToBoolan() {
		String result1 = "true";
		String result2 = "false";
		boolean r1 = Boolean.parseBoolean(result1);
		boolean r2 = Boolean.parseBoolean(result2);
		
		System.out.println(r1 == r2);
	}
	
	public static void stringToByte() {
		String val1 = "10";
		String val2 = "20";
		
		byte b1 = Byte.parseByte(val1);
		byte b2 = Byte.parseByte(val2);
		System.out.println("Byte total: " + (b1 + b2));
	}

	public static void stringToShort() {
		String val1 = "3000";
		String val2 = "4000";
		
		short s1 = Short.parseShort(val1);
		short s2 = Short.parseShort(val2);
		System.out.println("Short total: " + (s1 + s2));
	}

	public static void stringToLong() {
		String val1 = "100000";
		String val2 = "200000";
		
		long l1 = Long.parseLong(val1);
		long l2 = Long.parseLong(val2);
		System.out.println("Long total: " + (l1 + l2));
	}

	public static void stringToFloat() {
		String val1 = "45.76";
		String val2 = "34.24";
		
		float f1 = Float.parseFloat(val1);
		float f2 = Float.parseFloat(val2);
		System.out.println("Float total: " + (f1 + f2));
	}


}
