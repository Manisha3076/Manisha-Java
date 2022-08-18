package org.anudip.stream;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharArray {
	
	static void writeFile() throws IOException
	{
		CharArrayWriter cw=new CharArrayWriter();
		cw.write("Testing Char Array Writer");
		FileWriter f1=new FileWriter("E:\\IO\\File1.txt");
		FileWriter f2=new FileWriter("E:\\IO\\File2.txt");
		FileWriter f3=new FileWriter("E:\\IO\\File3.txt");
		cw.writeTo(f1);
		cw.writeTo(f2);
		cw.writeTo(f3);
		f1.close();
		f2.close();
		f3.close();
		cw.close();
		
		
	}
	
	
	static  void  readFile()throws IOException
	{
		char ar[]="Testing Char Array Reading".toCharArray();
		CharArrayReader cr=new CharArrayReader(ar);
		int i=cr.read();
		while(i!=-1)
		{
		   System.out.print((char)i);
		   i=cr.read();
		}
		
	}

	public static void main(String... args)
	{
		try {
		   //writeFile();
			readFile();
		}
		catch(IOException ie)
		{
			
			System.out.println(ie);
		}
		
		System.out.println("Done..");
	}
}