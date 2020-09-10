package com.string;

public class CountCharacterOccurence {
	public static void main(String[] args) {
		String str = "Java Hello Java";
		char c='a';
		int count = str.length()-str.replaceAll("a", "").length();
		System.out.println("Number of occurrance of 'a' in "+str+" : "+count);
		
		System.out.println(str.substring(3, 6));
	}
}
