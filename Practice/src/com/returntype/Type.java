package com.returntype;

import java.util.Scanner;

public class Type {// Type
	
	public static String name (String a, String b) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your first name");
		
		a = scan.nextLine();
		
		System.out.println("Enter your last name");
		
		b = scan.nextLine();
		
		String fullName = a + b;
		
		return  fullName;
	}
	
	public static String check(String b ) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a checking string");
		
		b = scan.nextLine();
		
		return b;
		
		

		
	}

}
