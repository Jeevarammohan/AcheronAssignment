package com.shrishti.training.oops;

public class Bank {
	double balance;

	Bank(double balance) {
		this.balance = balance;
	}

	public void withdraw(int amount) {
		this.balance -= amount;
	}

	public void deposit(int deposit) {
		this.balance += deposit;
	}

	public double getBalance() {
		return balance;
	}

}
