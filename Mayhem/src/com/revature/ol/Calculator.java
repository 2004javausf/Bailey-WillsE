package com.revature.ol;

public class Calculator {
	
	static int a;
	static double b;
	
	public static void main(String[] args) {
		
		a=5;
		b=a;
		b=3.1;
		a=(int)b; 
		System.out.println(b);
		System.out.println(a);
		add(3,6);
		add(1.3, 4.5);
		add(4,5,6);
	}
	
	//Parametric polymorphism the ability of the compiler to know what method to run based of needed types
	static int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	static double add(double a, double b) {
		System.out.println(a+b);
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println(a+b+c);
		return a+b+c;
	}

}
