package com.constructor;
import java.util.Scanner;

public class Vehicle {
	
	Scanner scan = new Scanner(System.in);
	
	String make;
	String model;
	int year;
	Vehicle(){
		System.out.println("car has 4 wheels");
	}
	
	Vehicle(int x){
		//System.out.println("Enter the number of wheels");
		//x = scan.nextInt();
		if(x == 2) {
			System.out.println(x + " Wheels vehicle is Bike");
		}
		else if(x == 4) {
			System.out.println(x + " wheels vehicle is car");
		}
		else {
			System.out.println(x + " Wheels couldnt specify the vechile");
		}	
	}
	
	Vehicle(String make, String model, int year){
		this.make = make;
		this.model = model;
		this.year = year;
		
	}

}
