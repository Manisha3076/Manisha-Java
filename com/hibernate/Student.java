package com.hibernate;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	private String sname;
	private Set<String> contacts;
	private int age;
	private Map<Integer,String> courses;
	private Address address;
	
	public Student(String sname, int age) {
		super();
		this.sname = sname;
		this.age = age;
	}

	
	public Student(String sname, Set<String> contacts, int age, Map<Integer, String> courses, Address address) {
		super();
		this.sname = sname;
		this.contacts = contacts;
		this.age = age;
		this.courses = courses;
		this.address = address;
	}

	
	public Student(String sname, Set<String> contacts, int age, Map<Integer, String> courses) {
		super();
		this.sname = sname;
		this.contacts = contacts;
		this.age = age;
		this.courses = courses;
	}


	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		//System.out.println("Setting name.....");
		this.sname = sname;
	}

	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public Set<String> getContacts() {
		return contacts;
	}


	public void setContacts(Set<String> contacts) {
		this.contacts = contacts;
	}


	public Map<Integer, String> getCourses() {
		return courses;
	}


	public void setCourses(Map<Integer, String> courses) {
		this.courses = courses;
	}


	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Student [sname=" + sname + ", contacts=" + contacts + ", age=" + age + ", courses=" + courses
				+ ", address=" + address + "]";
	}


}
