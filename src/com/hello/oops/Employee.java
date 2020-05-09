package com.hello.oops;

/*
 * For Encapsulation by Java Bean / POJO / Plain Old Java Object class
 */
public class Employee {

	private int empId;
	private String empName;
	private Address address;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
