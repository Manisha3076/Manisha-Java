package com.lab;

import java.io.Serializable;

public class Student extends Person {
	
	static final private String INSTITUTE_NAME="Anudip";


	private int rollno;
	private String standard;
	private String subject;
	

	public Student() {
		
		rollno=0;
		standard="MCA";
		subject="Computers";
	}
	
	public Student(String name,int age,Address address,String mob,int rollno, String standard, String subject) {
		//super();
		super(name,age,address,mob);
		this.rollno = rollno;
		this.standard = standard;
		this.subject = subject;
		
	}
	
	public String getINSTITUTE_NAME() {
		return INSTITUTE_NAME;
	}
	
	
	
	
	public void display()
	{
		
		System.out.println("Displaying Student Info");
	}
	

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
