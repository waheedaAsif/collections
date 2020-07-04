package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_0 {

	public static void main(String[] args) {

		
		LinkedList <String> a = new LinkedList<String>();
		
		//add
		
		a.add("a");
		a.add("b");
		a.add("c");
		
		System.out.println("LinkedList Print 1: " +a);
		
		// addfirst
		
		a.addFirst("waheeda");
		System.out.println("print 2 : " + a);
		
		// addLast
		
		a.addLast("Seiar");
		System.out.println("Print 3 " + a);
		
		//get
		
		System.out.println("Get Index : " + a.get(3));
		
		//set
		a.set(3, "A");
		System.out.println("set an index: " + a);
		
		//Remove (last/ first element)
		
		a.removeFirst();
		System.out.println("remove the first element: " + a);
		
		a.removeLast();
		System.out.println("remove the Last element: " + a);
		
		a.remove(2);
		System.out.println("remove the index : " + a);
		
		//for Loop
		System.out.println("**** forLoop*******");
		 for(int y = 0; y<a.size(); y++) {
			 System.out.println("For Loop: " + a.get(y));
			 
	   // EachLoop
			 System.out.println("**** Each Loop ******");
			 
			for(String i: a) {
				System.out.println("for EachLoop: "+ i); // not usint get method
		//iterator
				System.out.println("****** iterator**********");
		
				Iterator<String> w = a.iterator();
				
				while(w.hasNext()) {
				System.out.println(w.next());
			
		//While Loop
				
				System.out.println("******** While Loop *********");
				
				int x = 0;
				while(a.size()>x) {
					System.out.println(a.get(x));
					x++;
				}
					
					
				}
				
		
			}
		 }
	}

}
