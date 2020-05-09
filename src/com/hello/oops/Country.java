package com.hello.oops;

public class Country {

	protected String language;

	public Country(String language) {
		this.language = language;
	}

	public void display() {
		System.out.println("Country Language");

	}

	public void countryDisplay() {
		System.out.println("Country Lang : " + language);
	}

}
