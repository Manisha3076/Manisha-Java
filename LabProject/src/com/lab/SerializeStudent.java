package com.lab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Static data members will not be serialized
//Has a Address should also be serializable
//transient keyword

public class SerializeStudent {
	
	static File f;

	public static void main(String[] args) {
		
		writeStudent();
		readStudent();
		
	}
	
	public static void writeStudent()
	{
		try {
			 f=new File("E:\\student1.txt");
			 
		    FileOutputStream fout=new FileOutputStream(f);
		    ObjectOutputStream oout=new ObjectOutputStream(fout);
		    
		    Student st=new Student();
		    
		   /* Address add=new Address();
		    add.setHouseno("a10");
		    add.setArea("ABC");
		    add.setCity("Mumbai");
		    add.setPin("1998");*/
		    
		    st.setRollno(100);
		    st.setName("Manisha");
		    st.setAge(40);
		    st.setSubject("Java");
		    //st.setAddress(add);
		   // st.setINSTITUTE_NAME("Anudip");
		    
		    
		    oout.writeObject(st);
		    
		    oout.flush();
		    oout.close();
		    fout.close();
		    System.out.println("Write Successfully...");
		    
		}catch(FileNotFoundException fe)
		{
			System.out.println(fe);
			
		}
		catch(IOException ie)
		{
			System.out.println(ie);
			
		}
		
	}
	
	
	
	public static void readStudent()
	{
		try {
		   FileInputStream fin=new FileInputStream(f);
		 
	       
		   ObjectInputStream oin=new ObjectInputStream(fin);
	       
	       Student st=(Student) oin.readObject();
	       
	       System.out.println("Roll number : "+st.getRollno());
	       System.out.println("Name : "+st.getName());
	       System.out.println("Age : "+st.getAge());
	       System.out.println("Subject : "+st.getSubject());
	       //System.out.println("Address :"+st.getAddress());
	       System.out.println("Institute :"+st.getINSTITUTE_NAME());
	       
	       oin.close();
	       fin.close();
	       
		}catch(ClassNotFoundException fe)
		{
			System.out.println(fe);
			
		}
		catch(IOException ie)
		{
			System.out.println(ie);
			
		}
		
	}

}
