//Write a program with a method named getTotal that accepts two integers as an argument and return its sum. 
//Call this method from main( ) and print the results.

package com.practice;

import java.util.Scanner;

public class Sum {
	
	public static int getTotal(int a,  int b) {
		int sum;
		sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("the sum of " + a + " and " + b + " is " + getTotal(a, b)  );
		
		
		System.out.println("sum is " + getTotal(5,6) );
		
		
			
			
			
		}

	}


