package com.shrishti.inheritance;

public class Bank {
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(double amount) {
		balance -= amount;
	}

	void deposit(double amount) {
		balance += amount;
	}

	double getBalance() {
		return balance;
	}

}
