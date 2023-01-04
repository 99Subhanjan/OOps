package com.string;

import java.util.Scanner;

public class Question10 {
	public void occurrence() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String string = scan.nextLine();
		
		string = string.toLowerCase();
		
		int length = string.length();
		
		int occur = 0; 
		
		char[] alph = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
				'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		System.out.println(string.chars());
		
		/*for(int i = 0; i < (length + 1); i++) {
			
			for(int j = 0; j < 26; j++) {
								
				if(string.charAt(i) == alph[j]) {
					
					string.chars();
					
					}
				
			}
			
			System.out.println(string.charAt(i) + " = " + occur);
			
			
			
		} */
		
		
		
		
		
		
		
		
		
		
	}

}
