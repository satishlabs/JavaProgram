package com.program.compostion;

import java.util.ArrayList;
import java.util.List;

public class BL {
	public static void main(String[] args) {
		Book b1 = new Book("JAVA", "Satish");
		Book b2 = new Book("C++", "MS");
		Book b3	= new Book("C#", "Kohli");
		Book b4 = new Book("Rohit", "Spring");
		
		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		
		Library library = new Library(books);
		
		List<Book> bs = library.getTotalBooksInLibrary();
		for(Book b : bs) {
			System.out.println("Titile: "+b.title+" and "+" Author is: "+b.author);
		}
	}
}
