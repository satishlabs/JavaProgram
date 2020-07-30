package com.string;

import java.util.Arrays;

public class CheckStringContains {
	public static void main(String[] args) {
		//Write a java code that checks the following:
		String str1 = "Facebook";
		String str2 = "book"; //or bkoo or oobk;
		
		char[] charArray = str2.toCharArray();
		Arrays.sort(charArray);
		String str3 = String.valueOf(charArray);
		
		System.out.println(str1.contains(str2));
		
		String string = "Madam, I am Adam";
		
		// Starts with
		 boolean b = string.startsWith("Mad");
		 System.out.println("// Starts with : "+b);
		 
		// Ends with
		 b = string.endsWith("dam");
		 System.out.println("// Ends with : "+b);
		 
		// Anywhere
		 b = string.indexOf("I am") >=0;
		 System.out.println("// Anywhere : "+b);
		 
		// To ignore case, regular expressions must be used

		// Starts with
		 b = string.matches("(?i)mad.*");
		 System.out.println("// Starts with :"+b);
		 
		// Ends with
		 b = string.matches("(?i).*adam");
		 System.out.println("// Ends with :"+b);
		 // Anywhere
		 b = string.matches("(?i).*i am.*");
		 System.out.println(" // Anywhere :"+b);
	}
}
