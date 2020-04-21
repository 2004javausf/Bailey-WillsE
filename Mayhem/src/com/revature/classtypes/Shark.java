package com.revature.classtypes;

public class Shark extends Fish implements Hunt {

	@Override
	public void swim() {
		System.out.println("I am swimming underwater");
		
	}

	@Override
	public void breathe() {
		System.out.println("I breathe underwater");
		
	}

	@Override
	public void findPrey() {
		System.out.println("I eat fishes");
		
	}

}
