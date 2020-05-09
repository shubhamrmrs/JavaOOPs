package com.hello.oops;

public class Circle extends Shape {

	public Circle(int dimension) {
		super(dimension);
		System.out.println("Circle constructor");
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("Drawing Circle");
		System.out.println("dimension :: " + dimension);
		double area = 3.14 * dimension;
		System.out.println("Area : " + area);
	}
}
