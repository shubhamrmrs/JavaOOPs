package com.hello.oops;

public class State extends Country {
	protected String stateLanguage;

	public State(String stateLanguage, String countryLanguage) {
		super(countryLanguage);
		this.stateLanguage = stateLanguage;
	}

	public void display() {
		super.display();
		System.out.println("State Language");
		System.out.println("Country Lang : "+language);
		System.out.println("State Lang : " + stateLanguage);
	}
	
	public void stateDisplay() {
		System.out.println("State Lang : " + stateLanguage);
	}

}
