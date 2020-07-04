package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashMap is a class implements Map Interface
		// extends AbstractMap
		// contains only unique elements
		// store the values - key- value pair
		//it may have one null key and multiple null values
		// it maintains no order
		//hashmap is non synchronized
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
			System.out.println(hm);
			hm.remove(3);
			System.out.println(hm);
			
			HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
			
			Employee e1 = new Employee("seiar", 27, "admin");
			Employee e2 = new Employee("waheeda",26, "QA");
			Employee e3 = new Employee("shams", 24, "Dev");
			
			emp.put(1, e1);
			emp.put(1, e2);
			emp.put(1, e3);
			
			// traverse the hashmap:
			for(Entry<Integer, Employee> m : emp.entrySet()) {
				int key = m.getKey();
				Employee e = m.getValue();
				System.out.println("Employee " + key + " Info");
				
				System.out.println(e.name +" "+ e.age +" "+ e.dept);
				
				
				
				
				
			}
		}
	}


