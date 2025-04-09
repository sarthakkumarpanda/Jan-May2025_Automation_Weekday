package com.learning_java_Day20_8th_Apr_2025_Strings;

public class Topic2_MemoryLocations {
	/*
	  
	In Java there are 5 memory locations
	1. Heap Memory
	2. Stack Memory
	3. PC Register
	4. Method area
	5. Native Method area
	
	 */
	
	//Strings have been given a special memory location within Heap Memory. 
	//This special place is known as SCP / SLP (String Constant Pool / String Literal Pool)

	public static void main(String[] args) {
		

		
		//this is 1 object being created and it will directly store in the SCP/SLP area
	}
	
	
	
	public static void understandingStringsBetter() {
		String S1 = new String(); //1 String object is created and it is referred by S1 inside the Heap Memory
		String S2 = new String("Java"); //2 Objects will be created. one Object is created because of new Keyword and it will bn in Heap Memory
		                                //the 2nd object will be created in the SCP/SLP area
		String S3 = new String("Java"); //1 object will be created
		
		String S4 = "Java";
		String S5 = "Python"; //1 new object will be created in SCP/SLP
		
		String S6 = "Python"; //a new object will not be created. Rather the reference will change from S5 to S6
	}
	
	public static void example() {
		String S10 = "Python";  //1 object is created in the SCP/SLP area. 
	}

}
