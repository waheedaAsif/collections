package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapShamsQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, ArrayList<ArrayList<String>>> data = new HashMap<Integer, ArrayList<ArrayList<String>>>();
		
		data.put(1, new ArrayList<ArrayList<String>>());// value-creating outter array list
		data.get(1).add(new ArrayList<String>()); // value - creating the inner array list
		data.get(1).add(new ArrayList<String>()); // value - creating the inner array list
		
		
		data.get(1).get(0).add("Java");
		data.get(1).get(0).add("Test");
		data.get(1).get(0).add("Automation");
		
		data.get(1).get(1).add("Jack");
		data.get(1).get(1).add("Ben");
		data.get(1).get(1).add("Mike");
		
		System.out.println(data);
		
		for(Integer mapKeys : data.keySet()) {
			// data.get(mapKeys) this gives me the ArrayList<ArrayList<String>>
			for (ArrayList<String> innerLists : data.get(mapKeys)) {
				//System.out.println(innerLists);
				for (String values : innerLists) {
					System.out.println(values + " ");
				}
				System.out.println();
			}
	}

}
}