package com.lab;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		String choice="yes";
		Scanner sc =new Scanner(System.in);
		
		while(choice.equals("yes")) {
		   
			System.out.println("Enter number :");
		    int n=sc.nextInt();
		    checkPrime(n);
		    System.out.println("Do you want to continue(yes/no) :");
		    choice=sc.next().toLowerCase();
		}

	}
	
	
	static void checkPrime(int n)
	{
		
		boolean flag=false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			
			}
					
		}
		
		if(flag==true)
			System.out.println(n+" is not a prime number.");
		else
			System.out.println(n+" is a prime number.");
		
		
	}

}
