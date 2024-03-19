package com.libraryapp.main;

//import com.libraryapp.dao.BookDaoImplementation;
import com.libraryapp.model.Book;
import com.libraryapp.service.*;
//import com.libraryapp.dao.*;
import com.libraryapp.model.*;
import java.util.*;


public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService libservice = new BookServiceImplementation();
		List<Book> librarylist = libservice.getAllBooks();
		
		for(Book book : librarylist) {
			System.out.println("Library: [BookId : " + book.getBookId() + ", BookName : " + book.getBookName() + " ]");
		}
		/*Book b =libservice.getAllBook().get(0);
	    System.out.println(b);
	    b.setBookName("Mahabaratha");
	    libservice.updateBook(b);
 
	    //get the student
	   // studentService.getStudent(0);
	   // System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");		
	   */
 
	    Book s1=new Book(104, "Victory City", 500);
	    libservice.addBook(s1);
	    System.out.println("After calling add");
	    for (Book std : libservice.getAllBooks()) {
		       System.out.println("Library: [BookId : " + std.getBookId() + ", Name : " + std.getBookName() + " ]");
		   }

	    System.out.println("After Deleting");
	    int id = 0;
	    libservice.deleteBook(id);
	    List<Book> booklist=libservice.getAllBooks();
	    for(Book books : booklist) {
			System.out.println("Library: [BookId : " + books.getBookId() + ", BookName : " + books.getBookName() + " ]");
		}
	    Author name1 = new Author("Ruskin Bond");
	    Author name2 = new Author("Arthur Conan Doyle");
	    List<Author> authorlist = new ArrayList<Author>();
	    authorlist.add(name1);
	    authorlist.add(name2);
	    List<BookAuthorDTO> newlist = new ArrayList<BookAuthorDTO>();
	    newlist.add(new BookAuthorDTO(librarylist.get(0).getBookName(),librarylist.get(0).getBookPrice(),authorlist.get(0).getAuthorName()));
	    newlist.add(new BookAuthorDTO(librarylist.get(1).getBookName(),librarylist.get(1).getBookPrice(),authorlist.get(1).getAuthorName()));
	    for(BookAuthorDTO dtodata:newlist) {
			   System.out.println(dtodata.getBookName() + " "+dtodata.getBookPrice() + " " + dtodata.getAuthorName());
		   }	    
	}

	

}
