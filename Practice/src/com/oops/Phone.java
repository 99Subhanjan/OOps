
/*Create a abstract class phone with three abstract method and one non abstract method 
 * and try to create two classes one is smart phone and another one is iphone and implement the phone class.
 */
package com.oops;

public abstract class Phone {
	
	public void lock() {  // Regualar Methond
		
		System.out.println("Now Your phone is locked ");
		
	}
	
	public abstract void majority(); // Abstract method

	public abstract void os();
	
	public abstract void manufractureName();
	
	public static int add(int a , int b) {
		return a + b;
	
	}
	


}
