package com.Loop;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the positive integer");
		int num = scan.nextInt();
		
		while(num < 0) {
			System.out.println("Please enter the positve integer");
			num = scan.nextInt();
		}
		System.out.println("The multiplication table of " + num + " is below ");
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(num + " X " + i + " = " + i * num );
		}
		
		

	}

}
