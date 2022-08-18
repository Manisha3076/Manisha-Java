package org.anudip.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFile {

	public static void main(String[] args)throws IOException {
		File f=new File("E:\\IO\\File1.txt");
		System.out.println("Can Read :"+f.canRead());
		System.out.println("Path :"+f.getPath());
		System.out.println("Absolute path "+f.getAbsolutePath());
		System.out.println("Parent file :" +f.getParent());
		//String []str=f.list();
		//System.out.print(str[0]);
		f.setReadOnly();
		System.out.println("Can Write :"+f.canWrite());
		FileWriter fw=new FileWriter(f);
		fw.append("Hello...");
		
		
	}

}
