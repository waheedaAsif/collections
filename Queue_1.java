package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Queue<Integer> s = new LinkedList<Integer>();
		 
		 s.add(10);
		 s.offer(20);
		 s.add(30);
		 s.offer(40);
		 s.add(50);
		 System.out.println(s.peek()); // printing first element if nothing is left return null
		 System.out.println(s.element()); // printing first element if nothing left return exception
		 
		 s.poll();
		 System.out.println(s);// return null element if nothing left in queue
		 s.remove();
		 System.out.println(s);
	}

}
