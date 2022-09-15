package com.lab;

public interface Bank {
	
	static public final int MIN_BALANCE=1000;
	
	
	abstract public  double getRateOfInterest();
	
	private void privateMethod()
	{
		
		System.out.println("I m private method in Bank.");
	}
	
	default void defaultMethod()
	{
		System.out.println("I m default method in Bank.");
		
	}
	
	static void staticMethod()
	{
		System.out.println("I m static method in Bank.");
		
	}
	
	
     public static void main(String[] args) {
		
		Bank b =new SBI();
		
		//System.out.println("SBI INteres = t"+b.getRateOfInterest());
		b.defaultMethod();
		b.privateMethod();
		
		
		//b=new Axis();
		//System.out.println("Axis INterest = "+b.getRateOfInterest());
		//b.defaultMethod();
	}


}
