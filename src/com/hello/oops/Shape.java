package com.hello.oops;

public class Shape {
	//public final class Shape {
	
	/*
	 * We cannot extend final class
	 * We cannot override and implement final method
	 * We cannot changer the value of final variable, will act like constant
	 */
	
	protected int dimension;
	
	public Shape(int dimension) {
		System.out.println("Super class constructor");
		this.dimension = dimension;
	}

	/*public final void draw() {
		System.out.println("Drawing Shape");
	}*/
	
	public void draw() {
		System.out.println("Drawing Shape");
	}
	
	public void welcome(){System.out.println("Welcoming you...");}  

}
