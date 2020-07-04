package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // Java HashMap class extends AbstractMap class and implements the Map interface which allows us 
		// to store key and value pair,where key should be unique.
		
		//                Points to Remember
		// HashMap contains values based on the key.
		// Only contain unique keys.
		// May have one null key and multiple null values.
		// Its non synchronized.
		// HashMap maintains no order.
		// the initial default capacity of java HashMap class is 16 with a load factor of 0.75.
		
		
		HashMap<Integer,String>map = new HashMap<Integer,String>(); // to store key and value pair in hashmap.
		
		map.put(1,"Fish");
		map.put(2,"Birds");
		map.put(3, "chicken");
		map.put(4, "Beef");
		
		System.out.println("Iterating Hashmap...");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		
		HashMap<Integer,String> hm = new HashMap <Integer,String>();
		
		hm.put(100, "waheeda");
		hm.put(200, "seiar");
		hm.put(300, "ayat");
		
		
		System.out.println("After invoking put()method");
		
		
		hm.putIfAbsent(400, "kawsar");  // to add key and value.
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		HashMap<Integer,String>map1 = new HashMap<Integer,String>();
		
		map.put(500, "Shams");
		
		map.putAll(hm);
		System.out.println("After invoking putAll()method");
		for(Map.Entry m :map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
		
		
		
	}

}
