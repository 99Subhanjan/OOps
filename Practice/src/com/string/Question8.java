package com.string;

import java.util.Scanner;

public class Question8 {
	
	public void vowelsCon() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		
		String string = scan.nextLine();
		
		string = string.toLowerCase();
		
		int vowels = 0;
		int consonents = 0;
		int whiteSpace = 0;
		int i = string.length();
		
		for(int j = 0; j < i; j++) {
			
			if(string.charAt(j) == 'a' || string.charAt(j) == 'e' || string.charAt(j) == 'i' || string.charAt(j) == 'o'
					|| string.charAt(j) == 'u') {
				
				vowels = vowels + 1;
				
			}
			
			else if(string.charAt(j) == ' '){
				
				whiteSpace = whiteSpace + 1;
				
			}
			
			else {
				
				consonents += 1;
			}
			

		}
		
		System.out.println("Vowels are " + vowels);
		System.out.println("Consonents are " + consonents );
		System.out.println("White Space are " + whiteSpace);
		
	}

}
