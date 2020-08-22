package com.string;

public class FirstAndLastChar {
	public static void main(String[] args) {
		 String str = "Satish for Prasad"; 
	     FirstAndLast(str); 
	}

	private static void FirstAndLast(String str) {
		int i;
		for( i=0; i<str.length();i++) {
			// If it is the first word 
            // of the string then print it. 
			if(i == 0)
				System.out.print(str.charAt(i));
			
			 // If it is the last word of the string 
            // then also print it. 
			if(i == str.length()-1)
				System.out.print(str.charAt(i));
			
			if(str.charAt(i) == ' ') {
				System.out.print(str.charAt(i-1)+" "+str.charAt(i+1));
			}
		}
	}
}
