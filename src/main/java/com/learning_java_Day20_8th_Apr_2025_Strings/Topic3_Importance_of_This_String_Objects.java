package com.learning_java_Day20_8th_Apr_2025_Strings;

public class Topic3_Importance_of_This_String_Objects {

	public static void main(String[] args) {
		
		String S1 = "John"; //1 object is created directly inside the SCP/SLP
		
		String S2 = new String("John"); //1 object will be created in the Heap Memory
		
		//you are designing a framework where in you are doing data validation
		
		/*
		 
		String username = "john@doe.com";       //1
		String password = "ConstantTouch@1990"; //1
		String table_name = "DW_ER_UAT_MAS";    //1
		String schema_name = "Provider_MAS";    //1
		String server = "cca-ead-uat-bba.mas";  //1
		                                                           5 objects
		String firstname = "Lamba";
		String lastname = 'Lam";		
		*/
		
		
		String username = new String("john@doe.com");   //2
		String password = new String("ConstantTouch@1990"); //2
		String table_name = new String("DW_ER_UAT_MAS"); //2 
		String schema_name = new String("Provider_MAS"); //2 
		String server = new String("cca-ead-uat-bba.mas"); //2           //10 objects
		
		
		
		

	}

}
