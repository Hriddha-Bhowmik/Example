package com.libraryapp.service;
import java.util.*;

import com.libraryapp.model.Book;

public interface BookService {
	public List<Book>getAllBooks();
	
	public Book getBook(int bookId);
	
	public void deleteBook(int bookId);
	
	public void updateBook(Book bookId);
	
	public void addBook(Book bookId);
}
