package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
	
	//collection Framework
	//List, Set, Queue, All interfaces in the Collection
	
	//Why?
	//Array object within Java is limited. Mainly that the arrray is immutable and you're given 
	//a lot of methods to work with
	
	/*
	 * Called Framework, provides interfaces and classes that allow developers to more easily manages 
	 * a group of objects
	 * Advantages:
	 * 	reduces effort (provides data structures and algorithms for you)
	 * 	Increases performance
	 *	 Encourages software reuse 
	 * 
	 * BUT!
	 * you have to use an object
	 * 
	 * What is a set
	 * 		Does not allow duplicate objects
	 * 		does not in general guarantee insertion order
	 * 		sets are equal if they contain the same elements
	 * 
	 * Hash Set
	 * 		Maintains no order, stores in a hash table, best performance
	 * Linked Hash Set
	 * 		Maintains insertion order, weaker performance
	 * TreeSet
	 * 		Maintains value order, very slow performance
	 */
	
	
	public static void main(String[] args) {
		
		Set<String> myFirstSet = new HashSet<String>();
		
		myFirstSet.add("Hello There");
		myFirstSet.add("Peter Pan");
		
		System.out.println(myFirstSet);
		
		Set<String>myOtherSet = new HashSet<>();
		myOtherSet.addAll(myFirstSet);
		
		System.out.println(myOtherSet);
		
		//Tree Set 
		
		Set<Integer> myFirstTree = new TreeSet<>();
		myFirstTree.add(12);
		myFirstTree.add(10);
		myFirstTree.add(13);
		myFirstTree.add(7);
		
		System.out.println(myFirstTree);
		
		Set<String> testTree = new TreeSet<>();
		testTree.add("...ldplsdp");
		testTree.add("77usnkald");
		testTree.add("Apples");
		testTree.add("apples");
		
		System.out.println(testTree);
		
		Set<Integer> myLinked = new LinkedHashSet<>();	
		myLinked.add(100);
		myLinked.add(20);
		myLinked.add(57);
		
		System.out.println(myLinked);
	}

}
