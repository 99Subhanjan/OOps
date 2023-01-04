package com.encapsulation;

public class Employee {
	
	private String name;
	private int salary;
	
	int getSalary() {
		
		return salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int s) {
		
		salary = s;
		
	}
	
	public void calaculateSalary() {
		
		System.out.println("monthly salary = "+ 30 * 10000);
	}
	


}




