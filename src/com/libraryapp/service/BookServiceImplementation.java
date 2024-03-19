package com.libraryapp.service;

import java.util.List;
import com.libraryapp.dao.BookDaoImplementation;
import com.libraryapp.model.Book;

public class BookServiceImplementation implements BookService {
	BookDaoImplementation dao;
	public BookServiceImplementation(){
  	  dao=new BookDaoImplementation();
    }
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}
	//@Override
	//public Book getBook(int bookId) {
		// TODO Auto-generated method stub
	//	return null;
	//}
	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		dao.deleteBook(bookId);
		
	}
	//@Override
	//public void updateBook(int bookId) {
		//dao.deleteBook(bookId);
		// TODO Auto-generated method stub
		
	//}
	@Override
	public void addBook(Book bookId) {
		dao.addBook(bookId);
	}
	//@Override
	//public Book getBook(int bookId) {
		// TODO Auto-generated method stub
		//return null;
	//}
	@Override
	public Book getBook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateBook(Book bookId) {
		// TODO Auto-generated method stub
		
	}
	
	
}
