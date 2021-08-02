package com.shrishti.abstraction;

public class CurrentAccount extends Bank {

	public CurrentAccount(double balance) {
		super(balance);
		this.balance = balance;
	}

	@Override
	void withdraw(double amount) {
		super.balance -= amount - 20;
	}

	@Override
	void deposit(double amount) {
		super.balance += amount - 20;
	}
}
