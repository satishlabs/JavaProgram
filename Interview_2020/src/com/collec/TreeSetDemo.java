package com.collec;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<>();
		tset.add("geeks");
		tset.add("for");
		tset.add("practice");
		tset.add("contribute");
		
		tset.add("geeks");
		
		for(String temp: tset){
			System.out.println(temp);
		}
	}
}
