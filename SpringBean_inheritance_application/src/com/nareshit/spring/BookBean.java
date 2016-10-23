package com.nareshit.spring;

public class BookBean {
	String title;
	String version;
	String price;
	String isbn;
	public void setTitle(String title) {
		this.title = title;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void displayBookDetails()
	{
		System.out.println("Book Title"+title+"   Book Version::"+version+"  Book Price"+price+"  Book Isbn"+isbn);
	}
	

}
