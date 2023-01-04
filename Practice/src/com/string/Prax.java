package com.string;

import java.util.Scanner;
public class Prax {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("eneter a string");
		
		String string = scan.nextLine();
		
		char newChar;
		String newString = "";
		
		int length = string.length();
		
		int j = 0; 
		while(j != length) {
			
			if(string.charAt(j) == 'a' || string.charAt(j) == 'e' || string.charAt(j) == 'i' || string.charAt(j) == 'o'
					|| string.charAt(j) == 'u') {
				
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
		
	
		//System.out.println(k);
	


