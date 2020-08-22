package com.string;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortTheString {
	public static void main(String[] args) {
		String str="edcba";
		char[] strAr = str.toCharArray();
		Arrays.sort(strAr);
		System.out.println(strAr);
		
		String s = str.chars()
				.sorted()
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
		System.out.println("S   :"+s);
		
		String sorted = Stream.of(str.split(" "))
				.sorted()
				.collect(Collectors.joining());
		System.out.println(sorted);
		
		for(int i=0;i<strAr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				char temp =strAr[j-1];
				strAr[j-1]=strAr[j];
				strAr[j] = temp;
			}
		}
		str = String.valueOf(strAr);
		System.out.println(str);
	}
}
