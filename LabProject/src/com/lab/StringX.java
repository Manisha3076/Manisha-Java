package com.lab;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringX {
	
	public static void main(String[] args) {
		String s,lstr="",sstr="";
		int minlength=Integer.MAX_VALUE,maxlength=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		
		String str=sc.nextLine();
		
		StringTokenizer sToken=new StringTokenizer (str);
		
		
		while(sToken.hasMoreTokens())
		{
		  s=sToken.nextToken();//class
		  
		  if(s.length()>maxlength)//5>4
		  {
			  maxlength=s.length();//5
			  lstr=s;				//class
		  }
		  
		  if(s.length()<minlength) //5<4
		  {
			  minlength=s.length(); //1
			  sstr=s;		//a
			  
		  }
			  
		}
		
		System.out.println("Largest String ="+ lstr );
		
		System.out.println("Smallest String ="+ sstr );
		
      }
	
}