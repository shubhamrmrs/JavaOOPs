package com.hello.test;

import com.hello.oops.AXIS;
import com.hello.oops.Address;
import com.hello.oops.Bank;
import com.hello.oops.Circle;
import com.hello.oops.City;
import com.hello.oops.Country;
import com.hello.oops.Customer;
import com.hello.oops.Employee;
import com.hello.oops.ICICI;
import com.hello.oops.PatelCollege;
import com.hello.oops.Radharaman;
import com.hello.oops.Rectangle;
import com.hello.oops.Shape;
import com.hello.oops.StaticCustomer;
import com.hello.oops.University;

public class MainTest {

	public static void main(String[] args) {
	
		/*
		 * Constructor, Access Modifier, Class and Object
		 */
		System.out.println("::::::::::::::::: Constructor ::::::::::::");
		Customer cust = new Customer(121,"Amit");
		cust.name = "Shubham";
		//Customer cust = new Customer();
		System.out.println("method call");
		cust.showCustomerInfo();
		
		/*
		 * Static 
		 */
		System.out.println("::::::::::::::::: Static ::::::::::::");
		System.out.println(StaticCustomer.myDesignation);
		StaticCustomer.myDesignation = "ASE";
		System.out.println(StaticCustomer.appName());
		System.out.println(StaticCustomer.myDesignation);
		
		/*
		 * Encapuslation
		 */
		System.out.println("::::::::::::::::: Encapuslation ::::::::::::");
		Employee emp = new Employee();
		emp.setEmpId(001);
		emp.setEmpName("Amit");
		
		Address add = new Address();
		add.setAddressId(94);
		add.setCompleteAddress("Patna");
		
		emp.setAddress(add);
		
		System.out.println("Id :: "+emp.getEmpId()+"\nName :: "+emp.getEmpName()
		+"\nAddress Id:: "+emp.getAddress().getAddressId()
		+"\nAddress :: "+emp.getAddress().getCompleteAddress());
		
		/*
		 * Inheritence & Run time Polymorphism
		 */
		System.out.println("::::::::::::::::: Inheritence ::::::::::::");
		Shape shape;
		
		shape = new Circle(5);
		//Circle shape = new Circle(9);
		shape.draw();
		shape.welcome();
		
		shape = new Rectangle(4, 5);
		shape.draw();
		shape.welcome();
		
		/*
		 * Multilevel Inheritence
		 */
		City obj = new City("Maghi","Bhojpuri","Hindi");
		obj.display();
		obj.stateDisplay();
		obj.countryDisplay();
		
		/*
		 * Abstract Class and Interface (Abstraction)
		 */
		System.out.println("::::::::::::::::: Abstract Class ::::::::::::");
		Bank bank = new ICICI();
		System.out.println(bank.getRateOfInterest());
		bank = new AXIS();
		System.out.println(bank.getRateOfInterest());
		bank.sayHello();
		
		System.out.println("::::::::::::::::: Interface ::::::::::::");
		University u = new PatelCollege();
		u.degree();
		u = new Radharaman();
		u.degree();
	}

}
