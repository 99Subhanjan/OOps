package com.Loop;
import java.util.Scanner;

public class Reverse {
	
	public static int reverse(int num) {
		
		int remainder;
		int reverse = 0;

		while(num > 0) {
			
			remainder = num % 10;
			num = num / 10;
			reverse = reverse * 10 + remainder;
		}
		
		return reverse;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		
		int num = scan.nextInt();
		
		System.out.println("The reverse of " + num + " is "+ reverse(num));
		
		
	}

}
