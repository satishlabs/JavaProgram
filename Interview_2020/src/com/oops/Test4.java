package com.oops;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

public class Test4 {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream pr = new PrintStream(new FileOutputStream("hello"));
		System.out.println(pr);
		//System.out = pr;
		System.out.println("Satish");
		
		//for(;;;)
			System.out.println("Test1");
		
		int i=0;
		for(i=0;i<2;i++) {
			continue;
		}
		String str="AB";
		System.out.println(str.hashCode());
	}
}
