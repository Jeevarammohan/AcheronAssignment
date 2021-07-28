package com.shrishti.training.oops;

public class Vehicle {
	String name;
	String model;
	double price;

	Vehicle(String name, String model, double price) {
		this.name = name;
		this.model = model;
		this.price = price;
	}

	void getDetails() {
		System.out.println("Name of the vehicle: " + name);
		System.out.println("Model of the vehicle: " + model);
		System.out.println("Price of the vehicle: " + price);

	}

}
