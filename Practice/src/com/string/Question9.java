// Write a program to delete all consonants from the string "Hello, have a good day"

package com.string;

import java.util.Scanner;


public class Question9 {
	
	public void delete() {
		
		Scanner scan = new Scanner(System.in);
		
		char newChar = ' ';
		String newString = "";
		
				
		System.out.println("Please enter the strin 'Hello, have a good day '");
		
		String string = scan.nextLine();
		String compare = "Hello, have a good day";
		
		
		
		boolean check  = string.equals(compare);
		
		while(check != true) {
			System.out.println("Please enter the strin 'Hello, have a good day");
			string = scan.nextLine();
			check = string.equals(compare);
			}
		
		int length = string.length();
		
		
		int j = 0; 
		while(j != length) {
			
			if(string.charAt(j) == 'a' || string.charAt(j) == 'e' || string.charAt(j) == 'i' || string.charAt(j) == 'o'
					|| string.charAt(j) == 'u')  {
				
				newChar = string.charAt(j); 
				
			}
			else if(string.charAt(j) == ' ' ){
				
				newChar = string.charAt(j); 
				
				
				
			}
			
			else {
				j++;
				
				continue;
			}
			
			j++;
			
			newString = newString + newChar;
		}
		
		System.out.println(newString);
		
		
		
		
		
	}

}
