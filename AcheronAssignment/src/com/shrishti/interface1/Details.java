package com.shrishti.interface1;

public abstract class Details implements Training, Sports {
	String name;
	String city;
	public Details(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	void printDetails() {
		System.out.println("Name: " + name + "\nCity: " + city);
	}
}
