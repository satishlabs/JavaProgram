package com.jdk10.features;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		var str ="Satish Prasad";
		String str1 = "Hello world";
		System.out.println("[ "+str+" ] "+"[ "+str1+" ]");
		
		var list = List.of(1, 2.0, "satish");
		System.out.println(list);
		
		
	}
}
