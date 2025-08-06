package com.oops.daythree.miniatm;

import java.util.Scanner;

public class MiniATM {

	private User[] users;
	private int[] failedAttempts;

	public MiniATM() {
		users = new User[5];
		failedAttempts = new int[5];

		// Initialize 5 predefined users
		users[0] = new User(1111, 5000);
		users[1] = new User(2222, 3000);
		users[2] = new User(3333, 7000);
		users[3] = new User(4444, 10000);
		users[4] = new User(5555, 2000);
	}

	private int validateLogin(int pin) {
		for (int i = 0; i < users.length; i++) {
			if (users[i].validPin(pin)) {
				if (failedAttempts[i] >= 3) {
					System.out.println("Account locked due to multiple failed attempts.");
					return -1;
				}
				return i;
			}
		}

		for (int i = 0; i < users.length; i++) {
			failedAttempts[i]++;
		}

		System.out.println("Incorrect PIN. Attempts have been recorded.");
		return -1;
	}
	public void start() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your 4-digit PIN: ");
		int inputPin = sc.nextInt();

		int userIndex = validateLogin(inputPin);
		if (userIndex == -1) {
			System.out.println("Access denied. Please try again later.");
			return;
		}

		boolean exit = false;
		while (!exit) {
			System.out.println("\n---- ATM Menu ----");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Your balance: ₹" + users[userIndex].getBalance());
				break;
			case 2:
				System.out.print("Enter amount to deposit: ₹");
				double depositAmount = sc.nextDouble();
				if (users[userIndex].deposit(depositAmount)) {
					System.out.println("Deposit successful.");
				} else {
					System.out.println("Invalid deposit amount.");
				}
				break;
			case 3:
				System.out.print("Enter amount to withdraw: ₹");
				double withdrawAmount = sc.nextDouble();
				if (users[userIndex].withDraw(withdrawAmount)) {
					System.out.println("Please collect your cash.");
				} else {
					System.out.println("Insufficient balance or invalid amount.");
				}
				break;
			case 4:
				exit = true;
				System.out.println("Thank you for using the ATM.");
				break;
			default:
				System.out.println("Invalid choice.");
			}
		}

		sc.close();
	}

}
