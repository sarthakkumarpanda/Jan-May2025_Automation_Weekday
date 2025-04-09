package com.learning_java_Day20_8th_Apr_2025_Strings;

public class Topic4_SWhy_is_String_immutable {
	
	//immutable - something which does not change
	
	//Strings are immutable - Explain this interview question

	public static void main(String[] args) {
		
		
		final int i = 10; //final means immutable
	
		String S1 = new String("Apple");
		S1.concat("Cherry");
		System.out.println(S1); //The ouput will be Apple because String is immutable
		
		String password = new String("Angel");
		password.concat("Demon"); //String will not allow to change or concat like this
		System.out.println(password); //the answer still remains Angel
		
		
		passwordProtection();

	}
	
	
	public static void passwordProtection() {
		String S1 = new String("Secret@123");
		System.out.println("The password is : " + S1);
		
		S1 = S1.concat("Donkey");
		System.out.println("The updated password: " + S1);
	}
	
	public static void explanation() {
		/*
		 * What Happens? 
		 * 1. String S1 = new String("Secret@123"); "Secret@123" is a
		 * string literal → goes to the String Pool.
		 * 
		 * new String("Secret@123") creates a new String object in the Heap, copying the content from the pool.
		 * 
		 * So:
		 * 1 object in Heap → "Secret@123"
		 * 1 object in Pool (if not already there)
		 * 
		 * 2. System.out.println("The password is : " + S1); Prints:
		 *  The password is : Secret@123 3. S1 = S1.concat("Donkey");
		 * concat() does NOT change the original string (because strings are immutable in Java).
		 * 
		 * It creates a new String by adding "Donkey" to the end of "Secret@123".
		 * 
		 * That new string is: "Secret@123Donkey"
		 * 
		 * We are now assigning this new string back to S1, so now S1 points to the new
		 * string.
		 * 
		 * ⚠️ The old "Secret@123" string still exists in memory but is no longer
		 * referenced by S1.
		 * 
		 * 4. System.out.println("The updated password: " + S1); Prints:
		 * The updated password: Secret@123Donkey 💡 Summary: Strings
		 * are immutable (can't be changed once created).
		 * 
		 * concat() creates a new string, it doesn't modify the original.
		 * 
		 * You reassign S1 to this new string, so now S1 holds the updated value.
		 */
	}

}
