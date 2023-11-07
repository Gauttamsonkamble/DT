package com.assignments.gauttam;

import java.util.Scanner;

// 4.	Write a Java program to find the factorial of a number

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		
		int number = sc.nextInt();
		
		int fact = 1;
		
		for(int i = 1;i<=number;i++)
		{
			fact = fact *i;
		}
		
		System.out.println("Factorial of number is = "+fact);

	}

}
