package com.learning_java_Day12_11th_Mar_2025_Arryays;

public class Topic5_Two_Dimensional_Arrays {
	
	    //Declare an Array
		//Create an Array
		//Initialize an Array
		//Retrieve elments of the Array
		
		//2-D  [][]

	public static void main(String[] args) {
		
		int[][] a;
		int a1[][];
		int[][] a2;
		int[] a3[];
		
		
		int[][] b1, c1; //both are 2-Ad arrays
		int[] b2, c2[]; //b2 is 1-D, c2 is 2-D
		int[] b3[], c3[]; //b3 - 2D, c3-2D
		int[][] b4, c4[]; //b4 is 2d but c4 is 3d
		//int[][]b5, []c5; //since c5 is the 2nd variable - the dimension cannot be mentioned ahead of the variable
		
		
		
		int d[][] = new int[3][4]; //we are actually creating a matrix. This is a 3X4 matrix. 3 rows and 4 cols
		
		d[0][0] = 100;
		d[0][1] = 200;
		d[0][2] = 300;
		d[0][3] = 400;
		
		d[1][0] = 100;
		d[1][1] = 200;
		d[1][2] = 300;
		d[1][3] = 400;
		
		d[2][0] = 100;
		d[2][1] = 200;
		d[2][2] = 300;
		d[2][3] = 400;
		
		//declaration + Creation + Initialization
		
		int e[][] = new int[][] { {100, 200, 300, 400},
				                  {100, 200, 300, 400},
				                  {100, 200, 300, 400}};
		
       int f[][] = { {100, 200, 300, 400},
                     {100, 200, 300, 400},
                      {100, 200, 300, 400}};
       
       //retrieve all the elements of array f
       
       for(int i=0 ; i<f.length ; i++) {
    	   for(int j=0 ; j<=f[i].length-1 ; j++) {
    		   System.out.print(f[i][j] + " ");
    	   }
    	   
    	   System.out.println();
       }
	}

}
