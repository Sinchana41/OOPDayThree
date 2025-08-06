package com.oops.daythree.banksystem;

public class Bank {

	private BankAccount[] accounts;
	private int count;

	public Bank() {
		accounts = new BankAccount[10]; // max 10 accounts
		count = 0;
	}

	public boolean createAccount(String ownerName, double initialBalance) {
		if (count >= accounts.length) {
			System.out.println("Cannot create more accounts.");
			return false;
		}
		accounts[count++] = new BankAccount(ownerName, initialBalance);
		return true;
	}

	public BankAccount findAccount(int accNum) {
		for (int i = 0; i < count; i++) {
			if (accounts[i].getAccountNumber() == accNum) {
				return accounts[i];
			}
		}
		return null;
	}

	public void showAllAccounts() {
		System.out.println("Bank Accounts :");
		for (int i = 0; i < count; i++) {
			accounts[i].displayInfo();
		}
	}


}
