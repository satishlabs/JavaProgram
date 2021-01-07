package com.string;

import java.util.ArrayList;
import java.util.List;


public class WordrapTest {
	public static void main(String[] args) {
		String str = "Hello World HelloWorld This Is a a Tesco Interview aa aaa";

		int size = 17;
		 
		 List<String> tokens = new ArrayList<>();
		 
	        for (int i = 0; i < str.length(); i += size) {
	            tokens.add(str.substring(i, Math.min(str.length(), i + size)));
	        }
	 
	        tokens.forEach(System.out::println);
	}
}
