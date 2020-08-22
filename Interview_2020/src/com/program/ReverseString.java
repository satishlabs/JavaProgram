package com.program;

import java.util.StringTokenizer;

public class ReverseString {
	public static void main(String[] args) {
		String input = "Hello world";
		//char[] temparray = input.toCharArray();
		String str = reverseString(input);
		System.out.println(str);
		
		StringTokenizer st = new StringTokenizer(input, " ");
		while(st.hasMoreTokens()) {
			String word = st.nextToken();
			
			char firstChar = word.charAt(0);
			String lastChar = word.substring(word.length()-1);
			System.out.println(word+" "+firstChar+" "+lastChar);
		}
		
	}
	public static String str3 = " ";
	private static String reverseString(String input) {
		String[] str2 = input.split(" "); 
		for(int i= str2.length-1;i>=0;i--){
			str3 = str3+" "+str2[i];
		}
		return str3;
	}
}
