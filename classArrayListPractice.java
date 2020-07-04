package Collections;

public class classArrayListPractice {

	public static void main(String[] args) {
		
 int[] data = {78, 2, 3, 1, 5,6, 6,1 };
 
	outter:	for(int i = 0; i<data.length; i++) {
	        for(int j = i+1; j<data.length; j++) {
	        	if(data[i]== data[j]) {
	        	System.out.println(data[i]);
	        	
	}
	        }
}
 
 String [] point = {"a","b","c","a"};
 outter:	for(int i = 0; i<point.length; i++) {
     for(int j = 0; j<point.length; j++) {
     	if(point[i].equals(point[j]));
     	System.out.println(point[i]);
	       break outter;
     }
}}
}

