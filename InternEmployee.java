package com.company.employeesystem;

public class InternEmployee extends Employee{

	private double stipend;

    public InternEmployee(int id, String name, double stipend) {
        super(id, name, 0);
        this.stipend = stipend;
    }

    @Override
    double calculateSalary() {
        return stipend;
    }
}
