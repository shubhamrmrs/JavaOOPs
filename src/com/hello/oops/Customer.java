package com.hello.oops;

public class Customer {
	
	int customerId;
	public String name;

	public Customer() {
		System.out.println("This is default / no-args constructor");
	}
	
	public Customer(int customerId, String nm) {
		System.out.println("This is parametrized constructor");
		this.customerId = customerId;
		name = nm;
	}
	
	private String welcomeMsg() {
		return "Welcome ";
	}
	
	public void showCustomerInfo() {
		
		System.out.println(welcomeMsg()+name+", Youd CID is "+customerId);
	}
	
}
