package org.anudip.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TestStream {

	
	public static void writeToFile()
	{
	    try
	    {
	    	ByteArrayOutputStream bout=new ByteArrayOutputStream();
		    bout.write(65);
		    FileOutputStream f1=new FileOutputStream("E:\\File1.txt");
		    FileOutputStream f2=new FileOutputStream("E:\\File2.txt");
		    FileOutputStream f3=new FileOutputStream("E:\\File3.txt");
		    bout.writeTo(f1);
		    bout.writeTo(f2);
		    bout.writeTo(f3);
		  System.out.println("Done Successfully......");
	    }
	    catch(IOException ie)
	    {
	    	System.out.println(ie);
	    }
	}
	

	public static void readFromFile()
	{
	   try {
		      FileReader fr=new  FileReader("E:\\\\FileWriter1.txt");
		      int i=fr.read();
		      while(i!=-1)
		      {
		    	  System.out.print((char)i);
		    	  i=fr.read();
             		    	  
		      }
	   }
	   catch(IOException ie)
	   {
		   
		   System.out.println(ie);  
	   }
	}
	
	
	public static void main(String[] args) {
		
	   writeToFile();
		//readFromFile();
       
       
		
   }
}
