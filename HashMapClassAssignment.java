package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class HashMapClassAssignment {

	public static void main(String[] args) {
		HashMap<Integer, ArrayList<String>> str = new HashMap<Integer, ArrayList<String>>();
		
		ArrayList<String> first = new ArrayList<String>();
		first.add("Collections");
		first.add("ArrayList");
		
		ArrayList<String> second = new ArrayList<String>();
		second.add("Inheritance");
		second.add("Parent");
		
		ArrayList<String> third = new ArrayList<String>();
		third.add("Polymorphism");
		third.add("Super");
		
		ArrayList<String> fourth = new ArrayList<String>();
		fourth. add("Abstraaction");
		
		ArrayList<String> fifth = new ArrayList<String>();
		fifth.add("Abstract");
		
		str.put(1, first);
		str.put(2, second);
		str.put(3, third);
		str.put(4, fourth);
		str.put(5, fifth);

		
		for(int outter : str.keySet()) {
			for(String j : str.get(outter)){
				System.out.println(outter+" "+j);

			}
			
		}
		//System.out.println(str);
		//for(Map.Entry x: str.entrySet()) {
			//System.out.println(x.getKey()+" "+ x.getValue());
			}
		
		HashMap<Integer, ArrayList<String>> str1 = new HashMap<Integer, ArrayList<String>>();
		
//	str1.put(1, new ArrayList<String>());
//	str1.put(2, new ArrayList<String>());
//	str1.put(3, new ArrayList<String>());
//	str1.put(4, new ArrayList<String>());
//	str1.put(5, new ArrayList<String>());
//
//	str1.get(1).add("Collections In Java");
//	str1.get(2).add("Queue");
//		//System.out.println(str1);
	}


      
      
      
      
      
      
      
      
      
      
      
      
