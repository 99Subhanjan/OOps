package com.Loop;

public class Sum {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		int sum = 0;
		do {
			
			sum = sum + i;
		    i++;
		} while(i <= 10);
		
		System.out.println("Sum of 10 numbers is " + sum);

	}

}
