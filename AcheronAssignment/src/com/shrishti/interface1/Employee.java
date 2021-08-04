package com.shrishti.interface1;

public class Employee extends Details {

	public Employee(String name, String city) {
		super(name, city);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void joinCourse() {
		System.out.println("Employee has joined the course");
	}

	@Override
	public void showSports() {
		System.out.println("Sports method");

	}

}
