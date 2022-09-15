package com.lab;

import java.io.Serializable;

public class Address implements Serializable {

	

	private String houseno;
	private String area;
	private String city;
	private String pin;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String houseno, String area, String city, String pin) {
		super();
		this.houseno = houseno;
		this.area = area;
		this.city = city;
		this.pin = pin;
	}

	public String getHouseno() {
		return houseno;
	}

	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", area=" + area + ", city=" + city + ", pin=" + pin + "]";
	}

	
	
}
