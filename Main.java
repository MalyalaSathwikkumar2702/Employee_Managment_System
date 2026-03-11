package com.company.employeesystem;
import java.util.*;
public class Main {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        int choice;

        do {

            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Full Time Employee");
            System.out.println("2. Add Intern Employee");
            System.out.println("3. Display Employees");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Base Salary: ");
                    double salary = sc.nextDouble();

                    System.out.print("Enter Bonus: ");
                    double bonus = sc.nextDouble();

                    employees.add(new FullTimeEmployee(id, name, salary, bonus));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int iid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String iname = sc.nextLine();

                    System.out.print("Enter Stipend: ");
                    double stipend = sc.nextDouble();

                    employees.add(new InternEmployee(iid, iname, stipend));
                    break;

                case 3:
                    for (Employee emp : employees) {

                        emp.displayDetails();
                        System.out.println("Salary: " + emp.calculateSalary());
                        System.out.println("---------------------");

                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
