package com.assignments.gauttam;

import java.util.Scanner;

// 2.	Java program to add two numbers!

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Numbers : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int ans = num1 + num2;
		
		System.out.println("Addition Of Number is = "+ans);

	}

}
