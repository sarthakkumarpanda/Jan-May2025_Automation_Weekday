package com.learning_java_Day15_19th_Mar_2025_Polymorphism;

public class Topic3_Can_main_method_be_overloaded { // YES

	public static void main(String[] Tom) {
		main(10, 20);
		main(Tom = new String[3], Tom = new String[4], Tom = new String[5]);
	}
	
	public static void main(String[] args1, String[] args2, String[] args3) {
		System.out.println("This is the main method being overloaded with 2 String arrays as arguments");
	}
	
	
	public static void main(int i, int j) {
		int k = i+j;
		System.out.println(k);
		test();
	}

	
	public static void test() {
		System.out.println(10 + 20);
	}
}
