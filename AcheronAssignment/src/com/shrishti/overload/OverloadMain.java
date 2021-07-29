package com.shrishti.overload;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		for (int emp = 1; emp <= 3; emp++) {
			System.out.println("Enter the employee Name:");
			String employeeName = scanner.next();
			System.out.println("Enter the designation:");
			String designation = scanner.next();
			Employee employee = new Employee(employeeName, designation);
			if (designation.equalsIgnoreCase("Programmer")) {
				System.out.println(employeeName + "'s Bonus : " + employee.calcBonus(10000));
			} else if (designation.equalsIgnoreCase("Manager")) {
				System.out.println(employeeName + "'s Bonus : " + employee.calcBonus(10000, 5000));
			} else if (designation.equalsIgnoreCase("Director")) {
				System.out.println(employeeName + "'s Bonus : " + employee.calcBonus(10000, 50000, 4000));
			}
		}
		scanner.close();
	}

}
