package com.shrishti.inheritance;

public class SavingAccount extends Bank {

	public SavingAccount(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance -= amount - 10;
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		balance += amount - 10;
	}

	double getBalance() {
		return balance;
	}

}
