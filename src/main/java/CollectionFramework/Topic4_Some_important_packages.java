package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Topic4_Some_important_packages {
	
	//java.util.Collection - we can store the data directly

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Java");
		
		HashSet hs = new HashSet();
		hs.add("Apple");
		hs.add(true);
		
		//import java.util.Map - we store the data in key-value pair
		
		Map map = new HashMap();
		
		HashMap hm = new HashMap();
		hm.put(101, "Python");
		hm.put(100, "Java");

	}

}
