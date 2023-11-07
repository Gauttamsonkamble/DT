package com.assignments.gauttam;

//  3.	Write a program to input n numbers on command line argument and calculate maximum of them.

public class CommandLineArguments {

	public static void main(String[] args) {
	
		int arr[] = new int[args.length];
		
		
//		System.out.println(max);
		
		for(int i=0;i<args.length;i++)
		{
			arr[i] = Integer.parseInt(args[i]);
			System.out.println("Numbers are : "+arr[i]);
		}
		
		int max = arr[0];
		
		for (int i=1;i<args.length;i++)
		{
			
			if(arr[i] > max)
			{
				max = arr[i];
				
			}
		}

		System.out.println("\n Max Number = " +max);
	}

}
