package Collections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


 
public class HashMapClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Map<Integer,String> data = new HashMap<Integer,String>();
		 
		 data.put(1, "Jack");
		 data.put(2, "Ben");
		 
		 System.out.println(data.get(1)); // return the value for key
		 System.out.println(data.keySet()); // return key for HashMap
		 System.out.println(data.values()); // return values
		 System.out.println(data.size());   // return size
		 System.out.println(data);
		 
		
		 
		 // taking any object putting in hashing algorithum  and create hash code.
		 
		 Map<String,ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
		 
		 ArrayList<String> m2020 = new ArrayList<String>();
		 m2020.add("Jack");
		 m2020.add("Ben");
		 m2020.add("Kevin");
		 
		hm.put("Feb2020",new ArrayList<String>());
		hm.put("May2020", m2020);
		
		hm.get("Feb2020").add("First Student");
		hm.get("Feb2020").add("Second Student");
		
		System.out.println(hm);
		System.out.println("Feb2020 " + hm.get("Feb2020"));
		System.out.println("May2020 " + hm.get("May2020"));
		
		for(String i : hm.get("May2020")) {
			System.out.println(i);
		}
		 
       System.out.println("----------------------------");
      for (String outter : hm.keySet()) {
    	  
    	   for(String inner : hm.get(outter)) {
    	 
		System.out.println(inner);
       }
      }
	}
}


