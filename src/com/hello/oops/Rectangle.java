package com.hello.oops;

public class Rectangle extends Shape {

	private int width;

	public Rectangle(int dimension, int width) {
		super(dimension);
		System.out.println("Rectangle constructor");

		this.width = width;
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("Drawing Rectangle");
		double area = dimension * width;
		System.out.println("length " + dimension + "\nwidth " + width + "\narea " + area);
	}

}
