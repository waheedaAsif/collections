package Collections;

import java.util.ArrayList;

public class ArrayList_RetailAll {

	public static void main(String[] args) {
		
		ArrayList <String> str1 = new ArrayList<String>();
	str1.add("ABC");
	str1.add("CDA");
	str1.add("E");
	ArrayList <String> str2 = new ArrayList<String>();
	str2.add("o");
	str2.add("u");
	str2.add("m");
	str2.add("ABC");
	str2.add("cda");// retainlAll is case sensitive so it doesn't returns "cda".
	
	System.out.println("Befor RetainAll: " +str1);
		str1.retainAll(str2);// returns all matching values of str1 and str2
		
		System.out.println("After RetainAll: "+ str1);
	}

	
	}


