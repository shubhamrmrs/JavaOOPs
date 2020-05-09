package com.hello.oops;

public class OverloadedClass {

	public static int sum(int a, int b) {
	
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		
		return a+b+c;
	}
	
	public static int sum(double a, int b) {
		Double d = a+b;
		return d.intValue();
	}
	
	public static int sum(String a, String b) {
		int c = Integer.parseInt(a) + Integer.parseInt(b);
		return c;
	}
	
	public static void main(String[] args) {
		//OverloadedClass obj = new OverloadedClass();
		//long = 1L; //Largest
		//int = 19999999999999999
		//short = 1312312
		//byte = 1;//Smallest
		
		
		/*
		 * Type Casting
		 */
		char c = 'A';
		System.out.println("ASCII Code : "+(int)c);
		System.out.println("ASCII Character : "+(char)65);
		
		System.out.println(OverloadedClass.sum((int)32L, (int)21L));
		System.out.println(OverloadedClass.sum(12.4, 2));
		System.out.println(OverloadedClass.sum(2, 5, 7));
		System.out.println(OverloadedClass.sum("3", "4"));
	}
	
}
