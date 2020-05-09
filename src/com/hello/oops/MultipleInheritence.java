package com.hello.oops;

interface Printable {
	void print();
}

interface Showable {
	void print();
}

class MultipleInheritence implements Printable, Showable {

	public void print() {
		System.out.println("Hello");
	}
	
	public static void main(String args[]) {
		MultipleInheritence obj = new MultipleInheritence();
		obj.print();
	
	}
}
