package com.hello.oops;

public class City extends State {

	protected String cityLanguage;

	public City(String cityLanguage, String stateLanguage, String countryLanguage) {
		super(stateLanguage, countryLanguage);
		this.cityLanguage = cityLanguage;
	}

	public void display() {
		super.display();
		System.out.println("City Language");
		System.out.println("Country Lang : " + language);
		System.out.println("State Lang : " + stateLanguage);
		System.out.println("City Lang : " + cityLanguage);
	}

}
