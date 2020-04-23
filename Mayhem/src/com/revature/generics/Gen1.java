package com.revature.generics;

/*
 * Generics
 * using a type as a parameter 
 * writing code that can handle different types of objects 
 * we use angle brackets <> to denote that something is a generic 
 * this allows us to ensure type safety
 * adds stability and reusability to our code 
 * Placeholder are usually used (T,E,?,etc.)
 */

public class Gen1<T> {
	
	//declare an object of type T
	T ob;
	//pass the constructor a reference to an object of type T
	Gen1(T o){
		ob=o;
	}
	//return on
	T getOb() {
		return ob;
	}
	
	//show the type of T
	void showType() {
		System.out.println("Type of T is: " + ob.getClass().getName());
	}

}
