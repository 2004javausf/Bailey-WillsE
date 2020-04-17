package com.revature.varargs;

public class FunWithVarArgs {
	
	/*
	 * Variable Length Argument
	 * Method that will take a variable number of arguments
	 * Java Automates and hides the process of creating and saving the values in an array
	 * prior to invoking the method
	 * Vararg Must be the last argument
	 * Can be of any type 
	 */
	
	public static void vaTest(int ... v) {
		System.out.print("Number of Args is: " + v.length + " Contents: ");
		for(int x:v) {
			System.out.print(x + " ");
		}
	}

	public static void main(String[] args) {
		
		vaTest(17);
		System.out.println("");
		vaTest(10, 15, 66, 89, 13);
		System.out.println("");
		vaTest();
		

	}

}
