package com.revature.control;

public class LoopyLoops {
	
	/*
	 * If Statement
	 * for decision making
	 * providing multiple paths of execution
	 * 
	 * if(conditional){
	 * 		what to do if true
	 * }
	 * else if (second conditional){
	 * 		what to do if 2nd conditional is true
	 * }
	 * else{
	 * 		what to do if above statements are false
	 * }
	 * 
	 * Switch cases 
	 * provides multiple paths of execution based on some value 
	 * the "switch" is based on an integer numeric, a string, a char, a boolean, or enum.
	 */
	
	static String color;
	public static void whatColor(String color) {
		switch (color) {
			case "green" :
				System.out.println("Color is green");
				break;
			case "purple" :
				System.out.println("Color is purple");
				break;
			case "blue" :
				System.out.println("Color is blue");
				break;
			case "teal" :
				System.out.println("Color is teal");
				break;
			default:
				System.out.println("That ain't no color");
		}
	}
	
	/*
	 * For loops
	 * for(a;b;c){
	 * 		do something
	 * }
	 * a is variable declaration (counter)
	 * b is the condition tha controls how far the loop will run
	 * c is the incrementor/decrementor
	 */
	
	public static void forLoopFunness (int p) {
		for(int i=p; i>0 ; i--) {
			//break
			if(i==10) {
				//break;
				continue;
			}
			System.out.println(i);
		}
	}
	
	/*enhanced for loop aka for each
	 * for (x:<Array or Collection>){
	 * 	do something
	 * }
	 * 
	 * good for moving through an iterable object
	 * more CPU efficient 
	 * no issues with index out of bounds- not size dependent
	 * good for access elements in one collection
	 * bad for adding or removing
	 */
	
	static int[] myArray = {11,33,44,5,77,22,66,243};
	public static void forEachFun(int[] a) {
		for(int i:a) {
			System.out.println(i);
		}
	}
	
	/*
	 * While Loops
	 * while(conditional){
	 * 		do something
	 * }
	 * 
	 * do while
	 * do {
	 * 		do thing
	 * }
	 * while (conditional)
	 */
	public static void wileyWhile(int i) {
		while(i++ < 10) {
			System.out.println("boring");
		}
	}
	
	public static void wileyDoWhile(int i) {
		do {
			System.out.println("not so boring");
			i++;
		}
		while(i<10);
	}

	public static void main(String[] args) {
		
		whatColor("teal");
		forLoopFunness(100);
		forEachFun(myArray);
		wileyWhile(5);
		wileyWhile(12);
		wileyDoWhile(7);
		wileyDoWhile(14);
	}
	
	/*
	 * Conditionals
	 * Logical Operators
	 * < > <= >= != ==
	 * OR
	 * a|b - bit wise
	 * a||b - short circuit OR If a is true, return true w/o b
	 * AND
	 * a&b - bit wise
	 * a&&b checks both and evaluates true if both are true
	 * EQUALS
	 * ==
	 * compares values of primatives 
	 * compare the reference for objects. NOT THE CONTENTS
	 * .equals()
	 * method inherited Object
	 * All reference types have it
	 * looking at content
	 */

}
