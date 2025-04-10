package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Topic6_Generics {
	
	//Generics provide a way to parameterize types in java

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		
		
		List<Integer>list1 = new ArrayList<Integer>();
		list1.add(10);
		
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("Donkey", "Monkey");
		//mp.put(10, "Apple");
		
		Map<String, Integer> mp1 = new HashMap<String, Integer>();
		mp1.put("C++", 100);
		
	

	}

}
