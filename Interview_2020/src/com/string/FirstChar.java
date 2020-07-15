package com.string;

public class FirstChar {
	public static void main(String[] args) {
		String str ="Hello Satish";
		firstChar(str);
	}

	private static void firstChar(String str) {
		String[] strArr = str.split(" ");
		for(String  s: strArr) {
			System.out.println(s+" : "+s.charAt(0)+" "+s.charAt(index)); 
			
			
		}
		
	}
}
