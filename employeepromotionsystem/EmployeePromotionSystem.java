package com.oops.daythree.employeepromotionsystem;

import java.util.Scanner;

public class EmployeePromotionSystem {

	private static Employee[] employees = new Employee[5];
	private static int count = 0;
	
	private static Employee findEmployeeById(int id) {
		for (int i = 0; i < count; i++) {
			if (employees[i].getId() == id) {
				return employees[i];
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n--- Employee Promotion System ---");
			System.out.println("1. Add Employee");
			System.out.println("2. Promote Employee");
			System.out.println("3. Show All Employees");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine(); 

			switch (choice) {
			case 1:
				if (count < employees.length) {
					System.out.print("Enter ID: ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter Name: ");
					String name = sc.nextLine();
					System.out.print("Enter Designation (JUNIOR, MID, SENIOR, LEAD): ");
					String levelStr = sc.nextLine().toUpperCase();
					Level level = Level.valueOf(levelStr);
					System.out.print("Enter Salary: ");
					double salary = sc.nextDouble();
					employees[count++] = new Employee(id, name, level, salary);
				} else {
					System.out.println("Employee limit reached.");
				}
				break;
			case 2:
				System.out.print("Enter Employee ID to promote: ");
				int id = sc.nextInt();
				Employee emp = findEmployeeById(id);
				if (emp != null) {
					emp.promote();
				} else {
					System.out.println("Employee not found.");
				}
				break;
			case 3:
				for (int i = 0; i < count; i++) {
					employees[i].displayInfo();
				}
				break;
			case 4:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 4);
		sc.close();
	}

	
}
