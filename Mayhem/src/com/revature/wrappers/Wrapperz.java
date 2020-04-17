package com.revature.wrappers;

public class Wrapperz {
	
	/*
	 * Character - char
	 * Boolean - boolean
	 * Byte - byte
	 * Short - short
	 * Integer - int
	 * Long - long
	 * Float - float
	 * Double - double
	 */
	
	static int myInt = 3;
	static Integer myInteger = 10;
	static Double myDouble = 45.94;
	
	/*
	 * Autoboxing - implicit conversion from primitive types to wrapper class
	 * Unboxing - implicit conversion from a wrapper class to a primitive type
	 * Both types of boxing are an expensive process
	 */
	
	public static int addEmup(int a, int b) {
		return a+b;
	}
	
	public static Integer multiplyboi(Integer a, Integer b) {
		return a*b;
	}
	public static void main(String[] args) {
		
		System.out.println(addEmup(myInt,myDouble.intValue()));
		System.out.println(multiplyboi(myInt, myInteger));
		
	}

}
