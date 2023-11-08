package com.assignments.gauttam;

/* 5 . Write a java program which initialization earning of an employee. 
The program should calculate the income tax to be paid by the
employee as per the criteria given below: Slab rate IT rate Upto Rs.
50,000 Nil Upto Rs. 60,000 10% on additional amount Upto Rs. 
1,50,000 20% on additional amount Above Rs. 1,50,000 30% on 
additional amount Hint: - Run: - java calculates 1,25,000 Result:-
income tax is....*/


import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the income of the employee: Rs. ");
        double income = scanner.nextDouble();
        scanner.close();

        double taxAmount = calculateIncomeTax(income);
        System.out.println("Income tax is: Rs. " + taxAmount);
    }

    public static double calculateIncomeTax(double income) {
        double taxAmount = 0;

        if (income <= 50000) {
            // No income tax for income up to Rs. 50,000
            taxAmount = 0;
        } else if (income <= 60000) {
            // 10% tax on the amount exceeding Rs. 50,000
            taxAmount = (income - 50000) * 0.10;
        } else if (income <= 150000) {
            // 10% on the income between Rs. 50,001 to Rs. 60,000
            // 20% on the amount exceeding Rs. 60,000
            taxAmount = (10000 * 0.10) + ((income - 60000) * 0.20);
        } else {
            // 10% on the income between Rs. 50,001 to Rs. 60,000
            // 20% on the income between Rs. 60,001 to Rs. 150,000
            // 30% on the amount exceeding Rs. 150,000
            taxAmount = (10000 * 0.10) + (90000 * 0.20) + ((income - 150000) * 0.30);
        }

        return taxAmount;
    }
}
