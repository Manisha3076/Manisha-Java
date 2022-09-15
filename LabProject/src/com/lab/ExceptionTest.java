package com.lab;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s1,s2;
		int i1,i2,res;
		System.out.println("Enter first  number  : ");
		s1=sc.next();
		System.out.println("Enter Second  number  : ");
		s2=sc.next();
		try
		{
	    	i1=Integer.parseInt(s1);
	    	i2=Integer.parseInt(s2);
	    	res=i1/i2;
	      	System.out.println("Result= "+res);
	    	
		}catch(NumberFormatException ne)
		{
			 System.out.println("Format Mismatch");
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Invalid Division.");
		}
		catch(Exception e)
		{
			System.out.println("Exception Encountered..");
			
		}
		finally
		{
			System.out.println("Exception Handling Completed.");
			
		}
		
	}

}
