package com.jdk11.features;

import java.util.stream.Collectors;

public class StringFeatures {
	

	public static void main(String[] args) {
		String str1 = ""; 
		//isBlank(): This is a boolean method. It just returns true when a string is empty and vice-versa.
        System.out.println(str1.isBlank()); 
  
        String str2 = "GeeksForGeeks"; 
        System.out.println(str2.isBlank()); 
        
        String str = "Geeks\nFor\nGeeks"; 
        //lines(): This method is to return a collection of strings which are divided by line terminators.
        //System.out.println(str.lines().collect(Collectors.toList())); 
        System.out.println(str.lines().collect(Collectors.toList()));
        
        String str3 = "GeeksForGeeks"; 
        System.out.println(str3.repeat(4)); 
	}
}
