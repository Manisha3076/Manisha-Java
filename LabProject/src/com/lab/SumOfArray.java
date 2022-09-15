package com.lab;

import java.util.Scanner;

public class SumOfArray {
	
  static  int sum(int[] arr,int start,int end)
  {
	  int sum=0;
	 try
	 {
	  if(arr.length==0)
		  throw new IllegalArgumentException();
	  
	  if(arr==null)
		  throw new NullPointerException();
	  
	  if(start<=0 || end >= arr.length || start>end)
		  throw new ArrayIndexOutOfBoundsException();
	  
	  for(int i=start-1;i<end;i++)
	  {
		sum+=arr[i];  
	  }
	  
	  if (sum==0)
		  throw new Exception(); 
	  
	  
	  
	}catch(IllegalArgumentException ie)
	 {
		
		System.out.println("Please enter values in array.");
		
	 }
	 catch(NullPointerException ne)
	 {
		
		System.out.println("Array can't have null value.");
		
	 }
	 catch(ArrayIndexOutOfBoundsException ae)
	 {
		
		System.out.println("Enter valid values of start and end.");
		
	 }
	 catch(Exception e)
	 {
		 System.out.println("Sum Sould not be 0.");
		 
	 }
	 return sum;
	 
	
  }
  
  static int[] fillArray()
  {
	  
	  Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter Size of array : ");
		size = sc.nextInt();
		int arr[] =new int[size];
//		Accepting array values from user
		for(int i=0;i<size;i++)
		{
			System.out.println("enter value of ["+i+"] index");
			arr[i]=sc.nextInt();
		}

		
		return arr;

  }
  
  public static void main(String...args)
  {
	 int[] a= fillArray();
	 int start,end;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Start index of array : ");
		start = sc.nextInt();

	  System.out.println("Enter End index of array : ");
		end = sc.nextInt();
	 int res=sum(a,start,end);
	 
	 System.out.println("Sum - "+res);
	  
  }
  

}
