package com.oops;

public class Parent1 {
	protected Object connect(String s1){
		System.out.println("Doing in connection");
		return null;
	}
	 protected Object connect1(String s1) throws NullPointerException{  
		  System.out.println("Doing connection in Parent way"); 
		  return null;
		 }
}
