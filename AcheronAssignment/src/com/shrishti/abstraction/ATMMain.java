package com.shrishti.abstraction;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Account Type:");
		String accountType = scanner.next();
		Bank bank = null;
		switch (accountType) {
		case "S":
			bank = new SavingAccount(10000);
			break;
		case "A":
			bank = new CurrentAccount(10000);
			break;
		}
		if (bank == null) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		Bank bankObj = (Bank) bank;
		System.out.println("Balance: " + bankObj.getBalance());
		System.out.println("Enter the Withdrawel amount");
		double withdrawAmount = scanner.nextDouble();
		bank.withdraw(withdrawAmount);
		System.out.println("Balance after tax: " + bankObj.getBalance());
		System.out.println("Enter the Deposit amount");
		double depositAmount = scanner.nextDouble();
		bank.deposit(depositAmount);
		System.out.println("Balance after tax: " + bankObj.getBalance());
		scanner.close();

	}

}
