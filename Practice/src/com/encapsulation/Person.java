package com.encapsulation;

import java.util.Scanner;

public class Person {
	
	/*String name;
	int height;
	int age;
	String address; */
	
	public static void main(String[] args) {
		
		
		/*Employee e = new Employee();
		
		e.setName("James");
		e.setSalary(300000);
		work();
		
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}
	
	
	public static void work() {
		int t;
		System.out.println("I work for MYSELF");
	}*/
		
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("enter a name");
		
		//String name = scan.nextLine();
		
		Get get = new Get();
		
		//String name = get.getName(); 
		 
		 System.out.println("the output is from the getmethondfsdsd");
		
		//System.out.println(name);
		
		System.out.println("from setter methond");
		
	    get.setName("James");
		get.setAge(55);
		
		String name = get.getName();
		
		System.out.println(name);

   }
	
}
