package com.libraryapp.model;

public class BookAuthorDTO {
	String bookName;
	int bookPrice;
	String authorName;
	public BookAuthorDTO(String bookName, int bookPrice, String authorName) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.authorName = authorName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "BookAuthorDTO [bookName=" + bookName + ", bookPrice=" + bookPrice + ", authorName=" + authorName + "]";
	}
	
	
	
	

}
