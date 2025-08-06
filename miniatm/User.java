package com.oops.daythree.miniatm;

public class User {

	private int pin;
	private double balance;

	public User(int pin, double balance) {
		this.pin = pin;
		this.balance = balance;
	}

	public boolean validPin(int pin) {
		return this.pin==pin;
	}

	public double getBalance() {
		return this.balance;
	}

	public boolean deposit(double amount) {
		if(amount>0) {
			this.balance=this.balance+amount;
			return true;
		}
		return false;
	}

	public boolean withDraw(double amount) {
		if(amount>0 && this.balance>=amount) {
			this.balance=this.balance-amount;
			return true;
		}
		return false;
	}

}
