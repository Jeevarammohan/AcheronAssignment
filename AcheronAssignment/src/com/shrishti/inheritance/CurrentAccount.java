package com.shrishti.inheritance;

public class CurrentAccount extends Bank {
	
	public CurrentAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		super.balance -= amount - 20;
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		super.balance += amount - 20;
	}

	double getBalance() {
		return super.balance;
	}

}
