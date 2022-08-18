package org.anudip.stream;

import java.io.Console;

public class ConsoleDemo {
	public static void main(String... args)
	{
		Console con=System.console();
		//System.out.print(con.getClass());
		System.out.println("Enter Name:");
		String name=con.readLine();
		System.out.println("Enter Password:");
		String pass=con.readPassword().toString();
		System.out.println("Name :"+name+"   Password"+pass);
		
	}

}
