package com.oops.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieTest {
	public static void main(String[] args) {
		List<Movie> list = new ArrayList<>();
		list.add(new Movie(9.0, "Dabang", 2011));
		list.add(new Movie(10, "Sing is King", 2012));
		list.add(new Movie(9.2, "Namste Londan", 2007));
		list.add(new Movie(7.0, "Baby", 2014));
		list.add(new Movie(10, "Indian", 2007));
		list.add(new Movie(9.2, "Gadder Ek Prem Katha", 2005));
		
		Collections.sort(list);
		
		  System.out.println("Movies after sorting : "); 
		  for(Movie movie : list) {
			  System.out.println("---------------------------------------");
			  System.out.println(movie.getName()+" || "+movie.getRating()+" || "+movie.getYear());
		  }
		  
		 
		  System.out.println("@@@@@@@@@#################################@@@@@@@@@@@@@@@@@@@@@@");
		  System.out.println("Sorted by rating"); 
		  RatingCompare ratingCompare = new RatingCompare();
		  Collections.sort(list, ratingCompare);
		  for(Movie movie : list) {
			  System.out.println("---------------------------------------");
			  System.out.println(movie.getName()+" || "+movie.getRating()+" || "+movie.getYear());
		  }
		  
		  System.out.println("@@@@@@@@@#################################@@@@@@@@@@@@@@@@@@@@@@");
		  System.out.println("\nSorted by name"); 
		  NameCompare nameCompare = new NameCompare();
		  Collections.sort(list, nameCompare);
		  for(Movie movie : list) {
			  System.out.println("---------------------------------------");
			  System.out.println(movie.getName()+" || "+movie.getRating()+" || "+movie.getYear());
		  }
	}
}
