package com.oops.daythree.employeepromotionsystem;

public class Employee {

	private int id;
    private String name;
    private Level designation;
    private double salary;

    public Employee(int id, String name, Level designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public void promote() {
        Level next = designation.getNextLevel();
        if (next != null) {
            designation = next;
            salary += 5000; 
            System.out.println(name + " promoted to " + designation + " New salary: " + salary);
        } else {
            System.out.println(name + " is already at the highest level: " + designation);
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name +
            ", Designation: " + designation + ", Salary: " + salary);
    }

    public int getId() {
        return id;
    }
}
