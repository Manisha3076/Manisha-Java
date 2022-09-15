package com.lab;

import java.util.Arrays;
import java.util.Scanner;

public class LoopClass {

	public static void main(String[] args) {
		
		char[] ca= {'a','c','v','n'}; 
				
		Arrays.sort(ca);
		
		for(char c:ca)
		  {
			System.out.println(c);
			
		  }
		
		
		/*Scanner sc=new Scanner(System.in);
		
		
		do
		
		{
		  System.out.println("Enter the number :");
		  int n=sc.nextInt();
		  for(int i=1;i<=10;i++)
		  {
			System.out.println(n*i);
			
		  }
		  System.out.println("Do you want to continue(yes/no) :");
		  c=sc.next().toLowerCase(); 
		 
		  
		}while(c.equals("yes"));	
		*/
	}

}
