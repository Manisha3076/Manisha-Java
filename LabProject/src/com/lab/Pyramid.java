package com.lab;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		int rows;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter rows : ");
		rows=sc.nextInt();
		int k=1;
		for(int i=1;i<=rows;i++)
		{
			for(int n=rows-1;n>=i;n--)
			{
				System.out.print(" ");
				
			}
			
			for(int j=1;j<=k;j++)
			{
			   System.out.print("*");
	           
     		}
			k+=2;
		    System.out.println();
		    
			
		}
		

	}

}
