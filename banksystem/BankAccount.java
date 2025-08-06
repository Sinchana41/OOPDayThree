package com.oops.daythree.banksystem;

public class BankAccount {

	private static int nextAccountNumber=1000;

	private int accountNumber;
	private String ownerName;
	private double balance;

	public BankAccount(String ownerName, double initialBalance) {
		this.accountNumber = nextAccountNumber++;
		this.ownerName = ownerName;
		this.balance = initialBalance;
	}

	//Zero balance account
	public BankAccount(String ownerName) {
		this(ownerName, 0);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public double getBalance() {
		return balance;
	}	

	public boolean deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			return true;
		}
		return false;
	}

	public boolean withDraw(double amount) {
		if(amount>0 && balance>=amount) {
			balance=balance-amount;
			return true;
		}
		return false;
	}

	public boolean transfer(BankAccount target,double amount) {
		if(this.withDraw(amount)) {
			return target.deposit(amount);
		}
		return false;
	}

	public void displayInfo() {
		System.out.println("\nAccount Number: " + accountNumber);
		System.out.println("Owner: " + ownerName);
		System.out.println("Balance: ₹" + balance);
	}

}
