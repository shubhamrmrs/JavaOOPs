package com.hello.oops;

public class StringDemo {
	public static void main(String[] args) {
		String str = "Welcome";
		System.out.println(str);
		System.out.println("Hello " + str);
		System.out.println("length : " + str.length());
		System.out.println("Upper case : " + str.toUpperCase());
		System.out.println("Lower Case : " + str.toLowerCase());
		System.out.println("3rd index value : " + str.charAt(3));
		System.out.println(str.concat(" Amit"));
		System.out.println("Contains : " + str.contains("w"));// immutable as it
																// is creating
																// new object
																// for any
																// operations

		if (str.endsWith("e")) {
			System.out.println("Welcome");
		} else {
			System.out.println("none of these");
		}

		if (str.startsWith("W")) {
			System.out.println("Welcome");
		} else {
			System.out.println("none of these");
		}

		if (str.equals("welcome")) {
			System.out.println("It is welcome");
		} else if (str.equalsIgnoreCase("welcome")) {
			System.out.println("It is Welcome");
		} else {
			System.out.println("None of these");
		}
		
		
		StringBuilder sb = new StringBuilder("hello");
		sb.append(" ").append("user");
		
		System.out.println("sb :: "+sb.toString());
		
	}
}
