package com.lab;

import java.util.Arrays;

public class PrintArrayTable {
	
	public static void printArray(String[] arrStr,int[] arrInt)
	{
		Arrays.sort(arrStr);
		Arrays.sort(arrInt);
		System.out.println("Name\t\tValue\n");
		
		for(int i=0;i<arrStr.length;i++)
		{
			System.out.println(arrStr[i]+"\t\t"+arrInt[i]);
			
		}
		
	}

	public static void main(String[] args) {
		
		String[] strings= {"Peter" , "Amy", "John" ,"Boyd","Cathy"};
		int[] values= {15,9, 14, 10, 12};
		
		 printArray(strings,values);
		
	}

}
