package com.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//import java.util.ArrayDeque;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
public class Queues {

	//Ordered List of objects related to insertion order 
	//First In First Out
	//Methods: 
	//		poll, remove, peek, and element
	
	//Other principle is: First in Last Out 
	
	public static void main(String[] args) {
		
		Queue<String> myFirstQueue = new LinkedList<>();
		Queue<Integer> myOtherQ = new PriorityQueue<>();
		Queue<String> myOtherQ2 = new ArrayDeque<>();
		
		myFirstQueue.add("Peter Pan");
		myFirstQueue.add("Banjo");
		myFirstQueue.add("Spawn");
		myFirstQueue.add("Apple");
		
		System.out.println(myFirstQueue);
		
		System.out.println(myFirstQueue.poll()); //Poll, returns top value then removes it
		System.out.println(myFirstQueue);
		System.out.println(myFirstQueue.poll());
		System.out.println(myFirstQueue);
		System.out.println(myFirstQueue.poll());
		System.out.println(myFirstQueue);
		System.out.println(myFirstQueue.poll());
		System.out.println(myFirstQueue);
		
//		System.out.println(myFirstQueue.remove()); //Remove does the same thing as Poll but throws exception 
//		//if queue is empty
//		System.out.println(myFirstQueue);
//		
//		System.out.println(myFirstQueue.peek());//returns top value but doesn't remove it
//		System.out.println(myFirstQueue);
//		
//		System.out.println(myFirstQueue.element());//same as peek but throws exception if queue is empty
//		System.out.println(myFirstQueue);
		
		for(Object i:myFirstQueue) {
			System.out.println(i);
		}
	}

}
