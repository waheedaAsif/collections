package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

	public static void main(String[] args) {
	
		String [] data = {"Test", "Data", "Automation", "Job", "Test", "Data"};
		
	outter:	for(int i=0; i<data.length; i++) {
		for(int j = i +1; j <data.length; j++) {
			if (data[i].equals(data[j])) {
				System.out.println("duplicate " + data[i]);
				break outter;
			}
		}
			
		}
		
System.out.println("**************Using set to find duplicates*************");

     Set<String> temp = new HashSet<String>();
     int count = 0;
      for(String i: data) {
    	  if(temp.add(i) == true) {
    		 // if(!temp.add(i)) other way
    		  System.out.println("duplicate found using set " + i);
    		  count++;
    		  break;
    	  }
      }
	}




         
	        	
	        }
 