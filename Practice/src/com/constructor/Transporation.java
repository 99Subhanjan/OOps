package com.constructor;

public class Transporation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle(5);
		Vehicle v3 = new Vehicle(2);
		
		
		Vehicle v4 = new Vehicle("Toyota", "Camry", 2018);
		System.out.println("Make of car: " + v4.make);
		System.out.println("Model of car: " + v4.model);
		System.out.println("Year of car: " + v4.year);
		
		Car car = new Car();

	}

}
