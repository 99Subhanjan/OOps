package com.Loop;
import java.util.Scanner;

public class Dowhlie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question question = new Question();
		question.Ram();
		//question.Ram();
		
		Scanner scan = new Scanner(System.in);
		
		
		String string;
		int sum = 0;
		int num1;
		int num2;
		
		do {
			System.out.println("Enter two numbers");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			
			sum = num1 + num2;
			
			System.out.println("Do you wish to continue y/n ?");
			string = scan.nextLine();
		} while(string == "yes" || string == "YES");
		
		System.out.println("Sum is " + sum);
		

	}

}
