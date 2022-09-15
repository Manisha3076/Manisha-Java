package com.lab;

public class MyGen <T> {
	
	

	public <T> void setObj(T obj) {
		System.out.println("This is generic object :"+obj);
	}
	

	
	public static void main(String...args)
	{
		MyGen  mg=new MyGen();
		
		mg.setObj(10);
		
		//System.out.println(mg);
		
	}
	
	

}
