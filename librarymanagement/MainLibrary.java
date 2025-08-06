package com.oops.daythree.librarymanagement;

import java.util.Scanner;

public class MainLibrary {

	public static void main(String[] args) {
		Library library = new Library();
		Scanner sc = new Scanner(System.in);
        
		library.addBook("Java Basics", "Author A");
		library.addBook("C++ ", "Author B");
		library.addBook("Python ", "Author C");
		library.addBook("Algorithms", "Author D");
		library.addBook("Data Structures", "Author E");

		int choice;
		do {
			System.out.println("\n1. List Available Books\n2. Issue Book\n3. Return Book\n4. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
            sc.nextLine();
			switch (choice) {
			case 1:
				library.listAvailableBooks();
				break;
			case 2:
				System.out.print("Enter title to issue: ");
				String issueTitle = sc.nextLine();
				library.issueBook(issueTitle);
				break;
			case 3:
				System.out.print("Enter title to return: ");
				String returnTitle = sc.nextLine();
				library.returnBook(returnTitle);
				break;
			case 4:
				System.out.println("Exiting Library System...");
				break;
			default:
				System.out.println("Invalid choice.");
			}
		} while (choice != 4);

		sc.close();
	}


}
