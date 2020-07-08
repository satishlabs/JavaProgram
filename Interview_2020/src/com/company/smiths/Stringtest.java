package com.company.smiths;

public class Stringtest {
	public static void main(String[] args) {
		String a = "ABCD";
		a = a.replace('A', 'D');
		System.out.println(a);
		System.out.println();
		
		a.replace('B', 'C');
		
		System.out.println(a);
	}
}
