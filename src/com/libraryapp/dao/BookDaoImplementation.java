package com.libraryapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.libraryapp.model.Book;

public class BookDaoImplementation implements BookDao {
	List<Book> books;
	public BookDaoImplementation() {
		books=new ArrayList<Book>();
		Book book1=new Book(0, "Comics",101);
		Book book2=new Book(1, "Horror",102);
		books.add(book1);
		books.add(book2);
	}
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return books;
	}
	@Override
	public Book getBook(int bookId) {
		// TODO Auto-generated method stub
		return books.get(bookId);
	}
	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		System.out.println("updated book"+book);
		books.get(book.getBookId()).setBookName(book.getBookName());
		System.out.println("Book: book Id "+book.getBookId()+"updated with name"+book.getBookName()+"Complete Java reference");
	}
	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		books.remove(bookId);
	}
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		books.add(book);
	}
}