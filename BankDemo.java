package com.assignments.gauttam;

import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a bank account with an initial balance
        System.out.print("Enter account holder's name: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Enter initial balance: $");
        double initialBalance = scanner.nextDouble();

        BankAccount myAccount = new BankAccount(accountHolder, initialBalance);

        // Perform operations on the bank account
        System.out.println("Current Balance: $" + myAccount.getBalance());

        System.out.print("Enter deposit amount: $");
        double depositAmount = scanner.nextDouble();
        myAccount.deposit(depositAmount);

        System.out.println("Current Balance: $" + myAccount.getBalance());

        System.out.print("Enter withdrawal amount: $");
        double withdrawalAmount = scanner.nextDouble();
        myAccount.withdraw(withdrawalAmount);

        System.out.println("Current Balance: $" + myAccount.getBalance());

        scanner.close();
    }
}


