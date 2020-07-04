package Collections;
import java.util.Iterator;

import java.util.ArrayList;


public class ArrayListConcept {

	public static void main(String[] args) {
		
		//int a []  = new int[3]; // static array problem with this is the size is fixed.
  
		//dynamic array---ArrayList
		// it contain duplicate values
		// maintain insertion order
		// not synchronized so arraylist is slow compare to other array
		// it allows random access to fetch the element because it stores the values onto the basis of indexes.
		
		ArrayList ar = new ArrayList();// non generic arraylist
		
		ar.add("waheeda");  //0
		ar.add("seiar");  //1
		ar.add(30);      //2
		ar.add(2.40);
		ar.add(true);
		
		
		ar.remove(2);
		ar.set(2, 30);
		
		System.out.println("Replace index of " + "x" + ": " + ar.get(2)); // shams
		
		System.out.println(ar.size()); // return the size of array
		System.out.println(ar.get(2)); // return the index value
		
		for(int i = 0; i<ar.size(); i++) {  // with loop we can return all the values that we have in arrayList.
			System.out.println(ar.get(i));
		}	
		//ArrayList<String> ar1 = new ArrayList<String>()	;
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		
		ar1.add(1000);
		ar1.add(20000000);
		ar1.add(300000000);
		
		for(int i = 0; i<ar1.size(); i++) {
			System.out.println("Size for ar1: " + ar1.get(i)); // return all array ar1 values
		}
		// For EachLoop
		
		for(Integer i: ar1) {
			System.out.println("For eachloop: " + i); // return all array ar1 values
		
		}
		 // for loop
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		
		ar2.add(1000);
		ar2.add(8);
		ar2.add(7);
		ar2.add(6);
		ar2.add(5);
		ar2.add(4);
		
		ar2.addAll(ar1);
		
		for(int i = 0; i<ar2.size(); i++) {
			System.out.println("Size for ArrayList ar2 Before RetainAll: " + ar2.get(i));
		}
		
		ar2.retainAll(ar1);
		ar2.removeAll(ar1);
		
		ar2.add(300);
		ar2.add(400);
		ar2.add(500);
		
		// ar2.remove(3);
		
		for(int i = 0 ; i<ar2.size(); i++) {
			System.out.println("after retain all: " + ar2.get(i)); // ask Shams
		
		}
		// for Each = -------- how to print index zero in the below question
		
		 for(int i: ar2) {
			 System.out.println(i);
		 }
		 
		 // iterator
		 
		Iterator<Integer> it = ar2.iterator();
		 while(it.hasNext()) {
			 System.out.println("iterator:: " + it.next());
		 }
		 System.out.println("------------------retainAll-----------------");

		 

		 
		}
		
	}

		
		
		