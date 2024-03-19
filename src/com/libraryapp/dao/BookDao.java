package com.libraryapp.dao;

import java.util.*;

import com.libraryapp.model.Book;


public interface BookDao {
	public List<Book> getAllBooks();
	public Book getBook(int bookId);
	public void updateBook(Book book);
	public void addBook(Book book);
	public void deleteBook(int bookId);
	
}
