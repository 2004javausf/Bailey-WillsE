package com.revature.driver;

import java.util.Date;

import com.revature.beans.Human;//<-- Grabs information from  the human class 
//import com.revature.beans.*
//Static import - this only grabs static members of the class
//static import com.revature.beans.Human;

public class Driver {
		
		//single line comment
		/*
		 * multi
		 * line 
		 * comment
		 */
		
		/*
		 * "WORA principle - write once run anywhere"
		 * OOP
		 * Widespread use
		 * good documentation
		 * Oracle owns Java currently
		 * Sun microsystems used to own it
		 * Version 1.8 is the most commonly used version
		 * 
		 * JVM - java virtual machine
		 * 		convert compiled Java code into machine code that the processor can use
		 * 		this provides portability 
		 * JRE - java runtime environment
		 * 		JVM + Libraries 
		 * 		Everything that we need to run Java
		 * JDK -java development kit 	
		 * 		JVM + JRE
		 * 		Complier, etc...
		 * 		Everything you need to write Java
		 * Object Oriented Programming 
		 *  Java is ^!
		 *  unit of programmability is the object
		 *  Objects have states and behaviors 
		 *  States- aka fields, attributes, variables, etc. 
		 *  Behaviors- aka methods 
		 *  Classes- blueprint or template of an object 
		 */
	public static void main(String[] args) {
		Date d = new Date();
		Date e = new Date();
		java.sql.Date f = new java.sql.Date(0);
		/*
		 * public- access modifier, everything can access it
		 * static- do not need to instantiate to use/belongs to the class
		 * void- this is the return type
		 * String [] args- parameters used for this method 
		 */
		
		
		System.out.println("Go Knights!");
		Human h = new Human();
		h.setName("Matt");
		h.setAge(34);
		h.setWeight(270);
		System.out.println(h);
		System.out.println(h.getName());
		Human h2 = new Human();
		h2.setAge(28);
		h2.setName("Elliott");
		h2.setWeight(185);
		System.out.println(h2);
		System.out.println(h2.getName());
		
	}

}
