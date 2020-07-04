package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapHomeWork {

	public static void main(String[] args) {
		

		 HashMap<Integer,String> hm = new HashMap<Integer,String>();
		 
		 hm.put(1, "ForLoop");
		 hm.put(2, "Inhertance");
		 hm.put(3, "Collection");
		 hm.put(4, "Polymorphosim");
		 hm.put(5, "Abstraction");
		 
		 for(Map.Entry m : hm.entrySet()) {
				System.out.println(m.getKey()+ " " + m.getValue());
				
		Map<String, ArrayList<String>> test = new HashMap<String,ArrayList<String>>();
		
		ArrayList<String> ar1 = new ArrayList<String>();
		
		ar1.add("EachLoop");
		ar1.add("Inhertance");
		ar1.add("Collections");
		ar1.add("Polymorphism");
		ar1.add("Abstraction");
		
		test.put(" EachLoop", new ArrayList<String>());
		test.put(" Inhertance", ar1);
		test.put(" Collections", ar1);
		test.put(" polymorphism", ar1);
		test.put(" Abstraction", ar1);
		
		test.get("EachLoop").add("First Degree");
		test.get("Inhertance").add("Second Degree");
		test.get("Collections").add("Third Degree");
		test.get("Polymorphism").add("4th Degree");
		test.get("Abstraction").add("5th Degree");
		
		System.out.println(test);
//		for(String x : ar1.get(test) {
//			System.out.println(x);
//		}
	}
	}
}
