package com.revature.classtypes;

/*
 * special type of class that can't be instantiated 
 * specify what a class must do, but not how it dies it
 * lack instance variables
 * characterized by behavior
 * can mimic multiple inheritance w/ interfaces 
 * classes can implement interface zero to many
 * interfaces can extend other interfaces zero to many
 * All variables are implicitly static, public, and final (java8) *
 */

public interface Hunt {
	void findPrey();
}
