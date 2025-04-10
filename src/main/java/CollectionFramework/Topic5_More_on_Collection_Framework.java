package CollectionFramework;

import java.util.ArrayList;

public class Topic5_More_on_Collection_Framework {
	
	//Iterable
	//Collection 
	//List, Set, Queue

	public static void main(String[] args) {
		ArrayListClass();

	}
	
	public static void ListInterface() {
		//ArrayList
		//LinkedList
		//Vector [Legacy Class]
		//Stack [Legacy Class as well child class of Vector]
	}
	
	public static void ArrayListClass() {
		ArrayList al = new ArrayList();
		al.add(true);
		al.add(10);
		al.add("Java");
		
		System.out.println(al);
		al.remove("Java");
		al.add(10);
		
		System.out.println(al);
	}

}
