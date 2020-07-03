package com.string;

public class SpecificString {
	public static void main(String[] args) {
		String str="satish";
		System.out.println(str.substring(1, 4));
		
		System.out.println(str.substring(1,Math.min(str.length(), 4)));
	}
}
