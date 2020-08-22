package com.jdk8.features;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Parcel {
	 String name;
	 List<String> itmes;
	 
	 public Parcel(String name, String...items) {
		 this.name = name;
		 this.itmes = Arrays.asList(items);
	 }

	 public List<String> getItems(){
		 return itmes;
	 }
	
	public static void main(String[] args) {
		 Parcel amazon = new Parcel("amazon", "Laptop", "Phone");
		 Parcel ebay = new Parcel("ebay", "Mouse", "Keyboard");
		 
		 List<Parcel> parcel = Arrays.asList(amazon, ebay);
		 
		System.out.println(parcel);
		 System.out.println("-------- Without flatMap() ---------------------------");
		 List<List<String>> mapReturn = parcel.stream().map(Parcel::getItems)
				 						.collect(Collectors.toList());
		 System.out.println("\t collect() returns: "+mapReturn);
		 
		 System.out.println("\n-------- With flatMap() ------------------------------");
		 
		 List<String> flatMapReturn = parcel.stream().map(Parcel::getItems)
				 					.flatMap(Collection::stream)
				 					.collect(Collectors.toList());
		 System.out.println("\t collect() returns: " + flatMapReturn);
	}
}
