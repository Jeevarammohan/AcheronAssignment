package com.shrishti.overload;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		for (int emp = 1; emp <= 3; emp++) {
			String employeeName = scanner.next();
			String designation = scanner.next();
			Employee employee = new Employee(employeeName,designation);
			if (designation.equals(" Programmer")) {
				employee.calcBonus(10000);
			}
			else if (designation.equals("Manager")) {
				employee.calcBonus(10000,5000);
			}
			else if (designation.equals("Director")) {
				employee.calcBonus(10000, 50000, 4000);
			}
		}
		scanner.close();
	}

}
