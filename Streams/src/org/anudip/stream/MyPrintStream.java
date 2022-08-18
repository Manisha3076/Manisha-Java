package org.anudip.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class MyPrintStream {
	
	static void write()//throws FileNotFoundException
	{
		PrintStream ps=new PrintStream(System.out);
		ps.print("Hello.....");
		ps.close();
	
		
	}

	public static void main(String[] args) {
		
		  write();
	
		
	}

}
