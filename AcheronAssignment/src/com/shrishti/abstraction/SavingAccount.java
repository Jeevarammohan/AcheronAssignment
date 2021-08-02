package com.shrishti.abstraction;

public class SavingAccount extends Bank {
	public SavingAccount(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		super.balance -= amount - 10;
	}

	@Override
	void deposit(double amount) {
		super.balance += amount - 10;
	}

}
