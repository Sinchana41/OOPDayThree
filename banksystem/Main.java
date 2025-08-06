package com.oops.daythree.banksystem;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank();

		bank.createAccount("Sinchana", 1000);
		bank.createAccount("Shyam", 2000);
		bank.createAccount("Sushma", 500);

		bank.showAllAccounts();

		BankAccount acc1 = bank.findAccount(1001);
		BankAccount acc2 = bank.findAccount(1002);

		if (acc1 != null && acc2 != null) {
			System.out.println("\n-- Transfer ₹300 from Sinchana to Shyam --");
			if (acc1.transfer(acc2, 300)) {
				System.out.println("Transfer successful.");
			} else {
				System.out.println("Transfer failed.");
			}

			System.out.println("\n-- Withdraw ₹500 from Shyam --");
			if (acc2.withDraw(500)) {
				System.out.println("Withdrawal successful.");
			} else {
				System.out.println("Withdrawal failed.");
			}
		}

		bank.showAllAccounts();
	}
}
