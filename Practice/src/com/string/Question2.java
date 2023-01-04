// Write a program to input and display the sentence I love candies.


package com.string;

import java.util.Scanner; // to input the data

public class Question2 { 
	
	public static void string() {  // methond called string in Question2 class
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input the sentence 'I love candies' ");
		
		String message2 = scan.nextLine();
		
		String message3 = "I love candies";
		
		boolean isMatch = message2.equals(message3);
		
		
		while(isMatch != true) {
			System.out.println("Please enter the string as mention '" + message3 + " '" );
			
			message2 = scan.nextLine();
			isMatch = message2.equals(message3);
			
			
		}
		
		System.out.println("You have enter the same string");
		
		
		
		
	}
	

}
