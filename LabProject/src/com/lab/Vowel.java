package com.lab;

import java.util.Scanner;

public class Vowel {
	
	static public int countVowel()
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :  ");
		s=sc.nextLine();
		s=s.toLowerCase();
		char ca[]=s.toCharArray();
		int counter=0;
		for(int i=0;i<ca.length;i++)
		{
			switch(ca[i])
			{
			case 'a','e','i','o','u'->counter++;
			case 'x'->{
				           try{
				                 throw new Exception();
				                 
			                  }catch(Exception e)
			                  {
				                 System.out.println("X is a invalid character.");
				                 
			                  }
			           }
			default->System.out.println();
			
			}
			    
			
		   }
			
		return counter;
	}
	
	public static void main(String... args)
	{
		
		
		  		
		    System.out.println("Number of Vowel ==" + countVowel());
		
	}

}
