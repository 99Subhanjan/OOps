package com.constructor;
import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your bike name");
		
		String name = scan.nextLine();
		//System.out.println("enter the num of your bike");
		String col = "red";
	
		
		Bike bike = new Bike();
		
		//System.out.println(bike.name(name));
		//bike.check(color);
		System.out.println(bike.check(col));
		

	}

}
