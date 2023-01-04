package com.oops;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Phone smartPhone = new SmartPhone();
		
		Phone iphone = new Iphone();
		
		
		smartPhone.majority();
		smartPhone.manufractureName();
		smartPhone.os();
		
		iphone.majority();
		iphone.manufractureName();
		iphone.os();
		
		System.out.println("The only thing that is common is lock; calling iphone lock first" );
		iphone.lock();
		System.out.println("then smartphone ");
		smartPhone.lock();
		
		System.out.println(Phone.add(5, 6));
		
		
		
		
		

	}

}
