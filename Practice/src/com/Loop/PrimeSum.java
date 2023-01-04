//github Education@Dec1899
//git hub SubhanjanP

package com.Loop;

public class PrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			 count = 0;
			
			for(int j = 1; j <= i; j++) {
				
				
				
				if(i % j == 0) {
					
					count = count + 1;
					
				}
			}
			
			if(count == 2) {
				
				sum = sum + i;
			}
			
		}
		System.out.println("The sum of prime numbers between 1 and 10 is " +sum);

	}

}
