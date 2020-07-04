package Collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> vec1 = new Vector<Integer>();
		vec1.add(42);
		vec1.add(7);
		vec1.add(35);
		
		System.out.println("size: " + vec1.size());
		System.out.println("Capacit: " + vec1.capacity());
		
		System.out.println("Value 0: " +vec1.get(2));
		
		Vector<Employee> vec2 = new Vector <Employee>();
		Employee emp1 = new Employee("John Smith", 30, "HR");
		vec2.add(emp1);
		Employee emp2 = new Employee("Waheeda", 31, "HR");
		vec2.add(emp2);
		Employee emp3 = new Employee("Seiar", 31, "US bank");
		vec2.add(emp3);
		
		Employee emp0 = vec2.lastElement();
		int index = vec2.indexOf(emp2);
		System.out.println("Index of emp2 " + index);
		
		vec2.insertElementAt(emp2, 1);
		
		System.out.println("Size: " + vec1.size());
		for(int i=0; i< vec2.size(); i++) {
			System.out.println("Value for index" +i+ " " + vec2.get(i).getName());
		}
		System.out.println("Name:" + emp0.name);
		System.out.println("Name:" + vec2.get(0).getName());
		
		
	}

}
