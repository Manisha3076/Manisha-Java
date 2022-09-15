package com.lab;

public class ConcatString {
	
	public static String concatStr (String[] sa)
	{
		if (sa==null)
		{
			System.out.println("Array can't be null");
			return null;
		}
		
		String finalStr="";
		
		for(String s:sa)
		{
			 finalStr = finalStr+s;	
		}
		
		return finalStr;
		
	}
	
	
	public static void main(String...args)
	{
		String[] arr1= {"This","is","a","java","class."};
		String[] arr2= {"By","Manisha","Agrawal"};
		String[] arr3=null;
		System.out.println(concatStr(arr1));
		System.out.println(concatStr(arr2));
		System.out.println(concatStr(arr3));
		
		
	}

}
