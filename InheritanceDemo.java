package com.assignments.gauttam;


class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Doctor extends Person {
    private String specialization;
    private double consultationFee;

    // Constructor for Doctor
    public Doctor(String name, int age, String specialization, double consultationFee) {
        super(name, age);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    // Method to calculate salary for Doctor
    public double calculateSalary() {
        // Simple calculation for demonstration purposes
        return 5000 + consultationFee;
    }

    // Display method for Doctor
    public void display() {
        super.display();
        System.out.println("Specialization: " + specialization);
        System.out.println("Salary: $" + calculateSalary());
    }
}

class Engineer extends Person {
    private String field;
    private double hourlyRate;

    // Constructor for Engineer
    public Engineer(String name, int age, String field, double hourlyRate) {
        super(name, age);
        this.field = field;
        this.hourlyRate = hourlyRate;
    }

    // Method to calculate salary for Engineer
    public double calculateSalary() {
        // Simple calculation for demonstration purposes
        return 40 * hourlyRate * 4; // Assuming 40 hours per week and 4 weeks per month
    }

    // Display method for Engineer
    public void display() {
        super.display();
        System.out.println("Field: " + field);
        System.out.println("Salary: $" + calculateSalary());
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Creating a Doctor object
        Doctor doctor = new Doctor("Dr. SK", 35, "Psychological", 200);

        // Creating an Engineer object
        Engineer engineer = new Engineer("Gauttam SK", 28, "Software Engineer", 30);

        // Displaying information for Doctor
        System.out.println("Doctor Information:");
        doctor.display();
        System.out.println();

        // Displaying information for Engineer
        System.out.println("Engineer Information:");
        engineer.display();
    }
}
