package com.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hibernate.Address;

public class Student {
	
	private int id;
	private String sname;
	
	//@Autowired
	//@Qualifier("address2")
	private Address address;
	
	
	public Student(int id, String sname, Address address) {
		super();
		this.id = id;
		this.sname = sname;
		this.address = address;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Setting Id");
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		System.out.println("Setting Name");
		this.sname = sname;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("Setting  Address");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", address=" + address + "]";
	}
	
	public void myInit()
	{
		System.out.println("Init Method is called.......");
		
	}
	
	
	public void myDestroy()
	{
		
		 System.out.println("Destroy Method is called.......");
		
	}
	
	
	

}
