package com.hello.oops;

public class ICICI extends Bank {

	@Override
	public double getRateOfInterest() {
		System.out.println("ICICI");
		return 11.50;
	}

}
