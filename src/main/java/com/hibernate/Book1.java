package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book1 {
	
	@Id
	@GeneratedValue
	private int bid;
	
	@Column(name="bname")
	private String book_Title;
	
	@Column(name="bprice")
	private long price;
	
	public Book1(int bid, String book_Title, long price) {
		super();
		this.bid = bid;
		this.book_Title = book_Title;
		this.price = price;
	}
	public Book1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBook_Title() {
		return book_Title;
	}
	public void setBook_Title(String book_Title) {
		this.book_Title = book_Title;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", book_Title=" + book_Title + ", price=" + price + "]";
	}

}
