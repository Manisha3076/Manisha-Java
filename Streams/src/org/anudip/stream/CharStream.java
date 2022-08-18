package org.anudip.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharStream {
	
	static void writeFile() throws IOException
	{
		
		  Writer fw=new FileWriter("E:\\IO\\test.txt");
		  BufferedWriter bw=new BufferedWriter(fw); 
		  bw.write("This is a test string");
		  bw.append("Appending");
		  bw.flush();
		  fw.close();
		  bw.close();

   }
	
	
	static void readFile() throws IOException
	{
       FileReader fr=new FileReader("E:\\IO\\test.txt");	
       BufferedReader br=new BufferedReader(fr);
       System.out.println(br.readLine());
       br.close();
       fr.close();
       
		
	}
	
	
	
	public static void main(String[] args) {
		
		try
		{
		  writeFile();
		  readFile();
		}
		catch(IOException ie)
		{
			
			System.out.println(ie);
		}
		
		System.out.println("Done....");
  
	}

}
