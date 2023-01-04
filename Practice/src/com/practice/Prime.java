//Write a method named isPrime, which takes an integer as an argument and returns true if the argument is a prime number, 
//or false otherwise. Also write main method that displays prime numbers between 1 to 500.

package com.practice;
import java.util.Scanner;

public class Prime {
	
	public static boolean isPrime(int num) {
		int count = 0;
		for(int i = 1 ; i <= num ; i++ ) {
			
			if (num % i == 0) {
				count = count + 1;
			}
		}
		
		if(count == 2) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("enter an integer");
		
		
		
		
		int num = scan.nextInt();
		
		if(isPrime(num)) {
			System.out.println(isPrime(num) +"." + num + " is a prime number");
		}
		else {
			System.out.println(isPrime(num) +"." + num + " is not prime number");
		}
		
		
		
		System.out.println("Prime numbers between 1 to 500 are");
		for(int i = 1; i <= 500; i++) {
			
			int co = 0;
			
			for(int j = 1; j <= i; j++) {
				
				
				
				if (i % j == 0) {
					
					co = co + 1;
				}
		
			}
			
			if (co == 2) {
				System.out.println(" " + i);
			}
			
			
			
			
		}
		
	}
	

}
