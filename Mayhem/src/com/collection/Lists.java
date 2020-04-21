package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
	
	/*
	 * List
	 * 	A list is indexed 
	 * 	Allows duplicates 
	 * 	An Ordered Sequenced
	 */
	public static void main(String[] args) {
		
		List<String> myFirstList = new ArrayList<>();
		
		myFirstList.add("We're Doing Great");
		myFirstList.add("Writing a String");
		myFirstList.add("Dope City");
		myFirstList.add("Cool");
		
		System.out.println(myFirstList);
		
		myFirstList.set(1, "New String");
		
		System.out.println(myFirstList);
		
		List<String> myOtherList = new LinkedList<>();
		myOtherList.addAll(myFirstList);
		
		System.out.println(myOtherList.remove(0));
		
		/*
		 * Search: find a specified object in the list and return its position
		 * indexOf();
		 * lastIndexOf();
		 * if object doesn't exist you'll get a -1
		 */
		
		/*
		 * Range view methods:
		 * 	subList(); first number is inclusive the second number is exclusive meaning (2, 4) 2 and 3 will be
		 * in sublist 4 will not
		 */
		
	}

}
