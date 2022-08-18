package org.anudip.stream;

import java.io.File;
import java.util.Scanner;

public class ScannerDemo {
	
	static void inputFromUser()
	{
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter Name--");
		 String name=sc.nextLine();
		 System.out.println("Enter Age--");
		 int age=sc.nextInt();
		 System.out.println("Welcome "+ name +"Age --"+age);
		
	}
	
	static void inputFromFile()
	{
		try
		{
		   File f=new File("E:\\IO\\test.txt");
		   Scanner sc =new Scanner(f);
		   System.out.println(sc.nextLine());
		   while(sc.hasNextLine())
		   {
			   System.out.println(sc.nextLine());
		   }
		  
		}
		catch(Exception e)
		{
			
			System.out.print(e);
		}

		
	}
	
	
	public static void main(String[] args) {
		//inputFromUser();
		inputFromFile();
		
	}

}
