package com.hello.oops;

public class Student {
	private int stdId;
	private String name;

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int stdId, String name) {
		super();
		this.stdId = stdId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + "]";
	}
	
	

}
