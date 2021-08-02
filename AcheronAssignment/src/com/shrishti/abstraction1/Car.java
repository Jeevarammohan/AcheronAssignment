package com.shrishti.abstraction1;

public class Car extends Vehicle {

	public Car(String model, double price) {
		super(model, price);
	}

	@Override
	double getMilage() {
		return 78;
	}

	@Override
	void internal() {
		System.out.println("This is internal");
	}

	@Override
	void external() {
		System.out.println("This is external");
	}

}
