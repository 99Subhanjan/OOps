/* Write a program to check if the letter 'e' is present in the word 'Umbrella'.
 * Write a program to check if the word 'orange' is present in the "This is orange juice".
 * Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".
 */

package com.string;

import java.util.Scanner;

public class Question4 {
	
	public void check() {
		
		Scanner scan = new Scanner(System.in);
		
		String string = "Umbrella";
		
		boolean check = string.contains("e");
		
		System.out.println("the letter 'e' is present in the word " + string + " ? " + check);
		
		
	}
	
	public void checks() {
		
		String name = "This is orange juice";
		
		boolean check = name.contains("orange");
		
		System.out.println("The word 'orange is present in the word "+ name + " ? "+ check);
		
		
		
	}
	
	public void occurrence() {
		
		String name = "Hello, World";
		int first = name.indexOf('o');
		int last = name.lastIndexOf('o', name.length());
	
		System.out.println("first occurrence of letter 'o' is " + first + "\nlast occurrence of letter 'o' is "+ last);
		
	}

}
