package com.shrishti.inheritance;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Account Type:");
		String accountType = scanner.next();
		Bank bank;
		switch (accountType) {
		case "S":
			bank = new SavingAccount(10000);
			break;
		case "A":
			bank = new CurrentAccount(10000);
			break;

		default:
			bank = new Bank(10000);
		}
		System.out.println("Balance: " + bank.getBalance());
		System.out.println("Enter the Withdrawel amount");
		double withdrawAmount = scanner.nextDouble();
		bank.withdraw(withdrawAmount);
		System.out.println("Balance after tax: " + bank.getBalance());
		System.out.println("Enter the Deposit amount");
		double depositAmount = scanner.nextDouble();
		bank.deposit(depositAmount);
		System.out.println("Balance after tax: " + bank.getBalance());
		scanner.close();

	}

}
