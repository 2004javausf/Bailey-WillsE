package com.revature.classtypes;
/*
 * Special class that can't be instantiated (aka no objects of the animal (in this case) types specifically) 
 * The reason we use abstract because we want to set up a structure or features
 * Every Abstract class will contain at least 1 abstract method
 * abstract can contain concrete methods
 * "contract based" - abstract methods must be overidden in subclass
 */
public abstract class Animal {
	//abstract method
	public abstract void breathe();
	

}
