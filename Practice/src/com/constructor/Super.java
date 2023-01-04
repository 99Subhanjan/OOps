package com.constructor;

public class Super {
	
	String color;
	String name;
	int age;
	
	
	Super(){ // constructor 
		System.out.println("nothing");
	}
	
	Super(String color, String name, int age){
		
		this.color = color;
		this.name = name;
		this.age = age;
	}

}
