package com.company.employeesystem;

abstract class Employee {
	protected int id;
    protected String name;
    protected double baseSalary;

    // Constructor
    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    // Abstract method
    abstract double calculateSalary();

}
