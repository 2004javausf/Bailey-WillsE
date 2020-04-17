package com.revature.ol;

public class Calculator {
	
	static int a;
	static double b;
	
	public static void main(String[] args) {
		
		a=5;
		b=a;
		b=3.1;
		a=(int)b;
		Double d = 5.2;
		Integer e = 8;
		float f = 1.5f;
		float f2 = 1.5f;
		//System.out.println(b);
		//System.out.println(a);
//		add(3,6);
//		add(1.3, 4.5);
//		add(4,5,6);
//		System.out.println(add(1,2,3,4));
		System.out.println(add(d, e));
		System.out.println(add(f, f2));
	}
	
	//Parametric polymorphism the ability of the compiler to know what method to run based of needed types
	static int add(int a, int b) {
		System.out.println("This is 1");
		//System.out.println(a+b);
		return a+b;
	}
	
	static double add(double a, double b) {
		System.out.println("This is 2");
		//System.out.println(a+b);
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("This is 3");
		//System.out.println(a+b+c);
		return a+b+c;
	}
	
	static int add(int ...a) {
		System.out.println("This is 4");
		int total = 0;
		for(int i: a) {
			total = total+i;
		}
		return total;
	}

}
