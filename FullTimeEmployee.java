package com.company.employeesystem;

public class FullTimeEmployee extends Employee{

	private double bonus;

    public FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}
