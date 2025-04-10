package CollectionFramework;

import java.util.ArrayList;

public class Topic2_Arrays_vs_CollectionFramework {

	public static void main(String[] args) {
		
		
		//Difference 1- Arrays can store both primitive and non-primitive data but Collection framework can only store non-primitive
		
		int[] a = {1,2,3,4,5,6}; //here array is able to store primitive data
		
		Topic2_Arrays_vs_CollectionFramework obj1 = new Topic2_Arrays_vs_CollectionFramework();
		Topic2_Arrays_vs_CollectionFramework obj2 = new Topic2_Arrays_vs_CollectionFramework();
		Topic2_Arrays_vs_CollectionFramework obj3 = new Topic2_Arrays_vs_CollectionFramework();
		Topic2_Arrays_vs_CollectionFramework obj4 = new Topic2_Arrays_vs_CollectionFramework();
		
		Topic2_Arrays_vs_CollectionFramework[] references = {obj1, obj2, obj3, obj4}; //here array is storing 
		
		ArrayList al = new ArrayList();
		al.add("Java");
		al.add(10); //this 10 is not an integer. This is a Wrapper Class Object
		
		//Difference 2 - Arrays can mostly store homogeneous data excepting in some cases like int as it can be converted to other datatype
		// but Collection framework can store heterogeneous type of data
		
		int[] b = {1, 2, 3, 4};
		al.add(1);
		al.add("HelloWorld");
		al.add(12.34);
		
	}

}
