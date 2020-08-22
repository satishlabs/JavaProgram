package com.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet();
		lhs.add("Sonu");
		lhs.add("Monu");
		lhs.add("Zzz");
		lhs.add("Golu");
		for(String s : lhs){
			System.out.println(s);
		}
	}
}
