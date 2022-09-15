package com.lab;

import java.util.Scanner;

public class NewSwitch {

	public static void main(String[] args) {
	String yn="yes";
	Scanner sc=new Scanner(System.in);
	
	while(yn.equals("yes"))
	{
		
	System.out.println("Enter Year:");
	 int year=sc.nextInt();
	
	System.out.println("Enter Month:");
	
	String s=sc.next();
	
	
	int noOfDays=switch(s)
	{
	  case "Jan","March","May","July","Aug","Oct","Dec"->{ 
		                                        
		                                             System.out.println("Odd Months");
		    
		                                              yield 31;
		                                              }
	  
	  case "April","June","Sep","Nov"-> { 
          
          System.out.println("Even Months");

           yield 30;
           }
	  
	  case "Feb" -> {
		  
		     if(year%4==0)
		    	 
		    	 yield 29;
		     
		     else 
		    	  yield 28;
    
		          
		   
	               }
	  default ->0;
	
	};
      System.out.println("No. Of Days in "+s+"  is" + noOfDays  );
      System.out.println("Do You Want To Continue (yes/no):");
      yn=sc.next().toLowerCase();
     
	}
  }
}
