package com.hello.oops;

import java.util.Calendar;
import java.util.Date;

public class DateAndCalendar {
	public static void main(String[] args) {
	
		Date d = new Date();
		System.out.println("Date :: "+d.toString());
		System.out.println("Date :: "+d.toGMTString());
		System.out.println("Date :: "+d.getDate());
		
		d.setDate(9);
		System.out.println("Date after modify:: "+d.getDate());
		System.out.println("Date :: "+d.toString());
		
		
		Calendar cal = Calendar.getInstance();
		System.out.println("Cal : "+cal.getTime());
		cal.set(2019, 0, 7);
		System.out.println("Cal after set : "+cal.getTime());
		cal.setTime(d);
		System.out.println("Date after modify:: "+d.toString());
		
		/*
		 * Array 
		 */
		String[] names = {"AMit","Shubham"};
		
		System.out.println("Size : "+names.length);
		
		String[] names1 = new String[2];
		names1[0] = "Amit";
		
		
		Employee[] emp = new Employee[2];
		
		Employee e = new Employee();
		e.setEmpId(1);
		e.setEmpName("AMit");
		e.setAddress(new Address());
		emp[0]= e;
		
		
		
		
		
	}

}
