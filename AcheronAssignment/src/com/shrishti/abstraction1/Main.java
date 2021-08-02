package com.shrishti.abstraction1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Car("Swizz", 3578595);
		vehicle.internal();
		vehicle.external();
		System.out.println(vehicle.getMilage());
		vehicle.getDetails();
		Accessories accessories =(Accessories)vehicle;
		accessories.internal();
		accessories.external();

	}

}
