package com.encapsulation;

import java.util.Scanner;

public class Get {
	
	Scanner scan = new Scanner(System.in);
	
	private String name;
	private int age;
	
	public String getName() {
		//System.out.println("enter a name");
		//name = scan.nextLine();
		return name;
	}
	
	public int getAge() {
		
		return this.age;
	}
	
	public void  setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
