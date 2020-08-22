package com.comapny.hcl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookCollection {
	ArrayList<Book> bookCollection = new ArrayList<>();
	
	private ArrayList<Book> createBooKList(){
		Book book1 = new Book(1, "Maths", 129.00);
		bookCollection.add(book1);
		Book book2 = new Book(2, "English", 179.00);
		bookCollection.add(book2);
		Book book3 = new Book(3, "Hindi", 325.00);
		bookCollection.add(book3);
		Book book4 = new Book(4, "History", 237.00);
		bookCollection.add(book4);
		
		return bookCollection;
	}
	
	@SuppressWarnings("unused")
	private void printCollectionDescending(){
		PriceComparator priceCompare = new PriceComparator();
		Collections.sort(bookCollection, priceCompare);
		System.out.println(bookCollection);
	}
	private boolean add(Book bookToAdd) {
		boolean flag = true;
		if(bookCollection.isEmpty()) {
			return flag;
		}else {
			for(int i=0; i<bookCollection.size(); i++) {
				Book old = bookCollection.get(i);
				if(old.hashCode() == bookToAdd.hashCode() && old.equals(bookToAdd)) {
					flag = false;
					return flag;
				}
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		BookCollection collection = new BookCollection();
		collection.createBooKList();
		
		for(Book book : collection.createBooKList()) {
			System.out.println(book);
		}
		Book book = new Book(3, "Hindi", 325.00);
		// Verifying whether to add or not
		if(!collection.add(book)) {
			System.out.println("Should not be added");
		}
		// Printing descending order
		collection.printCollectionDescending();

	}
}
