//Write a method named isEven that accepts an int argument. The method should return true if 
//the argument is even, or false otherwise. Also write a program to test your method.


package com.practice;

import java.util.Scanner;
public class Evenorodd {
	
	public static boolean isEven(int a) {
		if(a % 2 == 0 ) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a integer");
		
		int a = scan.nextInt();
		
		if(isEven(a)) {
			System.out.println(isEven(a) +". Number is even");
		}
		else {
			System.out.println(isEven(a) +". Number is an odd");
		}
		
		//System.out.println(isEven(a));

	}

}
