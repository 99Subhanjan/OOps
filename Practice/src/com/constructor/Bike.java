package com.constructor;

public class Bike {
	
	public void name(String name) {
		System.out.println("your bike name is " + name);
	}
	
	public static boolean check(String color) {
		
		if(color == "red") {
			
			return true;
		}
		else {
			return false;
		}
	}

}
