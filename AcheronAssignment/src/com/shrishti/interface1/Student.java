package com.shrishti.interface1;

public class Student extends Details implements Hobbies {

	public Student(String name, String city) {
		super(name, city);
	}
	@Override
	public void printName() {
		System.out.println("Student printing");
	}

	@Override
	public void showHobbies() {
		System.out.println("Student hobbies");
	}

	public void check() {
		System.out.println("Student checking");
	}

	@Override
	public void joinCourse() {
		System.out.println("Student has joined course");
		
	}

	@Override
	public void showSports() {
		System.out.println("Student sports is shown");
	}

}
