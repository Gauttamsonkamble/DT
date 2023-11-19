package com.assignments.gauttam;



abstract class Employee {
    protected String name;
    protected double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Abstract method to calculate net salary (to be implemented by subclasses)
    public abstract double calculateNetSalary();

    // Method to display employee information
    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Net Salary: $" + calculateNetSalary());
    }
}

class Manager extends Employee {
    private double allowance;

    public Manager(String name, double basicSalary, double allowance) {
        super(name, basicSalary);
        this.allowance = allowance;
    }

    // Override the abstract method to calculate net salary for Manager
    @Override
    public double calculateNetSalary() {
        // Example calculation: Net Salary = Basic Salary + Allowance
        return basicSalary + allowance;
    }
}

class Clerk extends Employee {
    private double overtimeHours;
    private double hourlyRate;

    public Clerk(String name, double basicSalary, double overtimeHours, double hourlyRate) {
        super(name, basicSalary);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    // Override the abstract method to calculate net salary for Clerk
    @Override
    public double calculateNetSalary() {
        // Example calculation: Net Salary = Basic Salary + Overtime Pay
        return basicSalary + (overtimeHours * hourlyRate);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        // Example usage of Manager class
        Manager manager = new Manager("Gauttam SK", 50000, 10000);
        System.out.println("Manager's Information:");
        manager.displayInformation();
        System.out.println();

        // Example usage of Clerk class
        Clerk clerk = new Clerk("Robert", 30000, 10, 20);
        System.out.println("Clerk's Information:");
        clerk.displayInformation();
    }
}
