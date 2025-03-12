package com.learning_java_Day12_11th_Mar_2025_Arryays;

public class Topic3_OneDimensionalArrays {
	
	//Declare an Array
	//Create an Array
	//Initialize an Array
	//Retrieve elments of the Array
	
	//1-D  []

	public static void main(String[] args) {
		
		//Declaration
		
		int a[];
		int[] b;
		int[]c;
		
		int[] b1, c1;//b1 is a 1-D array, c1 is also a 1-D array
		int b2[], c2[];  //b2 and c2 are both 1-D array
		int b3[], c3; //b3 is a 1-D array, c3 is just an integer
		int[] b4[], c4[]; //b4 is 2-D array, c4 is 2-D array
		int[] b5[], c5; //b5 - 2D, c5-1D array
		
		//Creation - is done using new keyword
		
		int d[];           //declaration of the array
		d = new int[5];    //created the array
		
		//joining declaration and creation
		
		int d1[] = new int[5];
		//what is the size of d1 array ?? //size is 5
		System.out.println("The size of d1 array is : " + d1.length);
		
		//we know that size of the array is 5. So n=5. Total elements are 5
		//1st element will have 0th index
		//last element will have (n-1)th index
	
		//initializing an array
		d1[0] = 11;
		d1[1] = 22;
		d1[2] = 33;
		d1[3] = 44;
		d1[4] = 55;
		//d1[5] = 66;
		
		//can I retrieve 6th element from d1 array ??
		//System.out.println("The 6th element of d1 array is :" + d1[5]);
		
		//how to retrieve all the elements within the array
		for(int i=0 ; i<d1.length ; i++) {
			System.out.println(d1[i]);
		}
		
		//determine the 3rd of the array
		System.out.println("The 3rd element of the array is : " + d1[2]);

	}

}
