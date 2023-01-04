package com.exception;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		div(0, 6);
		System.out.println(add(7, 49));
		
		

	}
	
	public static void div(int divisor, int num) {
		try {
		System.out.println(num / divisor);
		}
		catch(Exception e) {
			
			System.out.println("an erro has occured");
			
		}
	}
	
	public static int add(int x, int y) {
		
		return x+y;
	}

}
