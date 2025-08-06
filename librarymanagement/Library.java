package com.oops.daythree.librarymanagement;

public class Library {

	private Book[] books = new Book[5];
	private int count = 0;

	public void addBook(String title, String author) {
		if (count < books.length) {
			books[count++] = new Book(title, author);
		} else {
			System.out.println("Library is full. Cannot add more books.");
		}
	}

	public void issueBook(String title) {
		for (int i = 0; i < count; i++) {
			if (books[i].getTitle().equalsIgnoreCase(title)) {
				if (!books[i].isIssued()) {
					books[i].issue();
					System.out.println("Book issued: " + title);
				} else {
					System.out.println("Book already issued.");
				}
				return;
			}
		}
		System.out.println("Book not found.");
	}

	public void returnBook(String title) {
		for (int i = 0; i < count; i++) {
			if (books[i].getTitle().equalsIgnoreCase(title)) {
				if (books[i].isIssued()) {
					books[i].returnBook();
					System.out.println("Book returned: " + title);
				} else {
					System.out.println("Book was not issued.");
				}
				return;
			}
		}
		System.out.println("Book not found.");
	}

	public void listAvailableBooks() {
		System.out.println("\nAvailable Books:");
		boolean found = false;
		for (int i = 0; i < count; i++) {
			if (!books[i].isIssued()) {
				books[i].display();
				found = true;
			}
		}
		if (!found) {
			System.out.println("No available books.");
		}
	}


}
