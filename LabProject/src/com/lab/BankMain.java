package com.lab;

public class BankMain {

	public BankMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		MyClass m=new MyClass();
		m.setA(50);
		m.setB(70);
		System.out.println("m="+m);
		try
		{
		  MyClass m2=(MyClass)m.clone();
		  System.out.println("m2 ="+m2);
		}catch(Exception e)
		{
		    System.out.println(e);	
		}
		
	}

}
