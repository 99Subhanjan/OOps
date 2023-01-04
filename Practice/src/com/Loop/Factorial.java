package com.Loop;
import java.util.Scanner;

public class Factorial {
	
	public static int Factorial(int num) { 
		int fac= 1;
		while(num >= 1) {
			fac = fac * num;
			num--;
		}
		return fac;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer ");
		int num = scan.nextInt();
		
		System.out.println("Factorical of " + num + " is " + Factorial(num) );

	}

}
