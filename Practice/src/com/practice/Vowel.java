//Write a value-returning method, isVowel that returns the value true if a given character is a vowel, and otherwise returns 
//false. In main() method accept a string from user and count number of vowels in that string.

package com.practice;
import java.util.Scanner;

public class Vowel {
	
	public static boolean isVowel(char d) {
		if(d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') {
			
			return true;
		}
		else {
			
			return false;
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String string = scan.nextLine();
		
		System.out.println("enter the position of the string where you want is that character is vowel or not");
		
		int i = scan.nextInt();
		
		char a = string.charAt(i);
		
		System.out.println(a);
		
		System.out.println(isVowel(a));
		
		int length = string.length();
		int countVowel = 0;
		int countSpace = 0;
		int countConsonant = 0;
		
		for(int j = 0; j < length; j++) {
			
			if(string.charAt(j) == 'a' || string.charAt(j) == 'e' || string.charAt(j) == 'i' ||
					string.charAt(j) == 'o' || string.charAt(j) == 'u') {
				countVowel = countVowel + 1;
			}
			else if(string.charAt(j) == ' ') {
				countSpace = countSpace + 1;
			}
			else {
			countConsonant = countConsonant + 1;		
		}
		
		}
		
		System.out.println("Number of vowels in "+ string + " is " + countVowel);
		System.out.println("Number of space in "+ string + " is " + countSpace);
		System.out.println("Number of consonant in "+ string + " is " + countConsonant);
			
		
	
		
		

	}

}
