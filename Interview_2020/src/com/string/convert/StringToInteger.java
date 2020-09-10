package com.string.convert;

public class StringToInteger {
	public static void main(String[] args) {
		String s="2020";
		int i = Integer.valueOf(s);
		int j = Integer.parseInt(s);
		System.out.println(i+" "+j);
	}
}
