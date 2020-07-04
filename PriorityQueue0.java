package Collections;

import java.util.PriorityQueue;

public class PriorityQueue0 {

	private static String peek;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PriorityQueue<String> pq= new PriorityQueue<String>();
		
		pq.add("a");
		pq.add("b");
		pq.add("c");
		pq.add("d");
		pq.add("e");
		pq.add("f");
		
		System.out.println("Head : " +pq. peek());
		System.out.println("Head : " +pq.element());
		
		System.out.println(pq);
		
		System.out.println("pq List " + pq);
		
		
	}

}
