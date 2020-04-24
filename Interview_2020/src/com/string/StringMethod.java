package com.string;

public class StringMethod {
	public static void main(String[] args) {
		  String str = "GeeksforGeeks is a computer science portal";
		  
		  int firstIndex = str.indexOf('s');
		  System.out.println("First occurrence of char 's'"+" is found at: "+firstIndex);
		  
		  int lastIndex = str.lastIndexOf('s');
		  System.out.println("Last occurrence of char 's' is" + " found at : " + lastIndex); 
		  
		  int first_in = str.indexOf('s', 10);
		  System.out.println("First occurrence of char 's'" + " after index 10 : " + first_in); 
	}
}
