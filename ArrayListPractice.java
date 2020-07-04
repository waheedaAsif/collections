package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		System.out.println("----------------ARRAYLIST--------------");
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("waheeda");
		ar.add("seiar");
		ar.add("ayat");
		ar.add("kawsar");
		ar.add("Muniar");
		
		ar.removeIf(x->(x.charAt(0) == 'M')); // removes any names that starts with character 'M'. Has to be 
		                                             // used with a loop
		
		for(String ab: ar) {
			System.out.println(ab);
			
		}
		
		System.out.println("---------------ArrayList1---------------------");
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(4);
		ar1.add(8);
		ar1.add(12);
		ar1.add(11);
		ar1.add(55);
		ar1.add(66);
		System.out.println(ar1);
		ar1.removeIf(n -> (n % 2 == 0)); //////// ask shams
		System.out.println(ar1);
		// Iterator
		Iterator<Integer> ite = ar1.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		
		}
		
		System.out.println("----------------Employee------------------");
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee("waheeda", 31, "HR1"));
		emp.add(new Employee("seiar", 32, "HR2"));
		emp.add(new Employee("Ayat", 7, "HR3"));
		emp.add(new Employee("kawsar", 5, "HR4"));
		
		//Iterator
		
		System.out.println("------------Iterator------------------");
		
		Iterator<Employee> iter = emp.iterator();
		while(iter.hasNext()) {
			
			Employee emp1 = iter.next();
			System.out.println( emp1.getName() + " " + emp1.getAge()+ " " + emp1.getDept());
		}
		
		
	}

}
