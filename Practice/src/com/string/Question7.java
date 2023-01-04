/*Write a program that takes your full name as input and displays the abbreviations of the first and middle names 
except the last name which is displayed as it is. For example, if your name is Robert Brett Roser, then the output 
should be R.B.Roser. */

package com.string;

import java.util.Scanner;

public class Question7 {
	
	public void name() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your full name");
		
		String name = scan.nextLine();
		
		char firstCharOfName = name.charAt(0);
		
		int i = name.indexOf(" ", 0);
		
		char firstCharOfMiddleName = name.charAt(i+1);
		
		int j = name.indexOf(" ", i+1);
		
		String lastName = name.substring(j);
		
		System.out.println("The abbreviations of your " + name + " is " + firstCharOfName + "." + firstCharOfMiddleName + "." + lastName);
		
		
		
		
			
			
		}
		
	}

