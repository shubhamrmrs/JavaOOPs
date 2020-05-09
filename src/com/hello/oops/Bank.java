package com.hello.oops;

public abstract class Bank {

	public Bank() {
		System.out.println("Bank Constructor");
	}
	
	public abstract double getRateOfInterest();
	
	public void sayHello() {
		System.out.println("Hello Users");
	}
}
