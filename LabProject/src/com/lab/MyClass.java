package com.lab;

import java.io.Serializable;

public class MyClass implements Cloneable,Serializable{

	int a;
	int b;
	
	public MyClass() {
		a=10;
		b=20;
		System.out.println("My Class");
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "MyClass [a=" + a + ", b=" + b + "]";
	}

}
