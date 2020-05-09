package com.hello.oops;

public class StaticCustomer {
	
	public static String myDesignation;
	
	static {
		myDesignation = "hello";
	}
	
	/*
	 * Static
	 */
	public static String appName() {
		
		return "My First OOPS Project";
	}
	//end
}
