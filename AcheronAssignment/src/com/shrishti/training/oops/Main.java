package com.shrishti.training.oops;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Vehicle class
		Vehicle vehicle = new Vehicle("Scooty", "Activa", 40000);
		vehicle.getDetails();

		// Bank class
		Bank bank = new Bank(100000);
		System.out.println("Enter the amount you want to withdraw: ");
		int withdrarAmount = scanner.nextInt();
		bank.withdraw(withdrarAmount);
		System.out.println("Enter the amount you want to deposit: ");
		int depositAmount = scanner.nextInt();
		bank.deposit(depositAmount);
		System.out.println("Balance Amount: " + bank.getBalance());

		// Student class
		for (int student = 1; student <= 2; student++) {
			System.out.println("Enter the student name:");
			String name = scanner.next();
			int studentId = scanner.nextInt();
			int marks[] = new int[5];
			System.out.println("Enter the marks for five subject:");
			for (int row = 0; row < 5; row++) {
				marks[row] = scanner.nextInt();
			}
			Student studentObj = new Student(name, studentId);
			studentObj.getDetails();
			studentObj.getGrades(marks);
		}

		scanner.close();

	}

}
