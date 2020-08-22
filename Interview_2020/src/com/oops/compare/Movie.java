package com.oops.compare;

public class Movie implements Comparable<Movie>{
	private double rating;
	private String name;
	private int year;
	

	public Movie(double rating, String name, int year) {
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	@Override
	public int compareTo(Movie o) {
		return this.year - o.year;
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}

}
