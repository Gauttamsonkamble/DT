package com.assignments.gauttam;

 // 6. Write a program to print the following pattern given n as argument:
 //	 [for input 3] 122333


import java.util.Scanner;

public class NumberPatternQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Number : ");
		 int num = sc .nextInt();
	        printNumberPattern(num);
	    }

	    static void printNumberPattern(int n) {
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i);
	            }
	        }
	        System.out.println();

	}

}

