package com.shrishti.training.oops;

public class Student {
	String name;
	int studentId;

	Student(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;
	}

	void getDetails() {
		System.out.println("Name of the student: " + name);
		System.out.println("Id of the student: " + studentId);
	}

	public String getGrades(int marks[]) {
		int size = marks.length;
		int sum = 0;
		for (int index = 0; index < size; index++) {
			sum += marks[index];
		}
		double average = sum / size;
		if (average > 90) {
			return "A Grade";
		} else if (average > 70) {
			return "B Grade";
		}
		return "C Grade";

	}

}
