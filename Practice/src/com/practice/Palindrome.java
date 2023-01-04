package com.practice;
import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindromes(int num) {
		
		int temp = num;
		int reverse = 0;
		int remainder;
		
		while(temp > 0) {
			
			remainder = temp % 10;
			temp = temp / 10;
			reverse = reverse * 10 + remainder;
		}
		if(reverse == num) {
			System.out.println( + num +" is an plaindrome ");
			return true;
		}
		else {
			System.out.println(num +" is not plaindrome ");
			return false;
		}
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the positive integer");
		int num = scan.nextInt();
		
		while(num < 0) {
			System.out.println("enter the positive integer");
			num = scan.nextInt();
		}
		
		System.out.println(isPalindromes(num));

	}
	
	/*
	 * final keyword
	 * final keyword when applied with methond must be beofre returing type 
	 */

}
