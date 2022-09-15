package com.lab;

import java.io.Serializable;

//serialization and deserialization

class Person implements Serializable {
	
	
	//final double PI=3.14;
	
	
	private String  name;
	

	private int age;
	private Address address;
	private String mob;


	public Person()
	{
		//super();
		//Object obj=new Object();
		name="ABC";
		age=0;
		address=null;
		mob="000-000-0000";
	
	}
	
	public Person(String name, int age, Address address, String mob) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mob = mob;
	}
	
	 public void display()
	{
		
	     System.out.println("Displaying Person Info");
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getMob() {
		return mob;
	}
	
	public void setMob(String mob) {
		this.mob = mob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", Address=" + address + ", mob=" + mob + "]";
	}
	


}



