package com.hello.oops;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("before exception");
		try {
			Integer[] names1 = new Integer[2];
			names1[0] = 101;
			try {
				names1[1] = Util.parseStringIntoInteger(args[0]);
			} catch (NumberFormatException ex) {
				System.out.println("NumberFormatException -> " + ex.getMessage());
				ex.printStackTrace();
			}
			try {
				int div = 10 / 0;
			} catch (ArithmeticException ex) {
				System.out.println("In ArithmeticException : " + ex.getMessage());

				ex.printStackTrace();
			}
			System.out.println("kkkkkkkk");

		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("In ArrayIndexOutOfBoundsException : " + ex.getMessage());

			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("In Exception : " + ex.getMessage());

			ex.printStackTrace();
		} finally {
			System.out.println("finally.............");
		}
		System.out.println("after exception");
	}
}
