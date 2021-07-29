package com.shrishti.overload;

public class Employee {
	String employeeName;
	String designation;

	public Employee(String employeeName, String designation) {
		super();
		this.employeeName = employeeName;
		this.designation = designation;
	}

	public double calcBonus(double basicAllowance) {
		return basicAllowance * 0.0833;
	}

	public double calcBonus(double basicAllowance, double carAllowance) {
		return (basicAllowance + carAllowance) * 0.0833;
	}

	public double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
		return (basicAllowance + carAllowance + houseAllowance) * 0.0833;
	}

}
