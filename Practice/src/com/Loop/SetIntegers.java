package com.Loop;
import java.util.Scanner;

public class SetIntegers {
/*	
	
	public static int check(int num) {
		
		int evenSum = 0;
		int oddSum = 0;
		
		if(num % 2 == 0) {
			evenSum = evenSum + num;
			return evenSum;
		}
		
		else {
			
			oddSum = oddSum + num;
			return oddSum;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		int evenSum = 0;
		int oddSum = 0;
		String string;
		char chr;
		
		do {
			System.out.println("Enter the two number");
			 num1 = scan.nextInt();
			 
			 num2 = scan.nextInt();
			 
			 check(num1);
			 check(num2);
			
			
			 string = scan.nextLine();
			System.out.println("Do you wish to continue, Enter Y for yes And N for No");
		    
			
		} while(string.equalsIgnoreCase("yes"));
		
		System.out.println("The sum of even numbers is " + evenSum);
		System.out.println("The sum of odd numbers is " + oddSum);
		
		

	}
*/
	
	public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
     
        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;
        
        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();
        
            if( number % 2 == 0)
            {
                evenSum += number;
            }
            else
            {
                oddSum += number;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
            
        }while(choice=='y' || choice == 'Y');
        
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }  
}
	


