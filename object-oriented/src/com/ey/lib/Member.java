package com.ey.lib;
public class Member {
	
	private String name;
	private Book book;
	
	public Member(String name) {
		this.name = name;
	}

	public void status() {
		if(book==null)
			System.out.println(name+"has not isuued a book");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
}
