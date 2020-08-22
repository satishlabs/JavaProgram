package com.collection.set;

import java.util.HashSet;

//HashSet object by default initialized with 16 size and load factor of HashSet is 0.75.

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet();
		hs.add("Sonu");
		hs.add("Monu");
		hs.add("Zzz");
		hs.add("Golu");
		for(String s : hs){
			System.out.println(s);
		}
		System.out.println("=========JDK8============");
		hs.forEach(set->System.out.println(set));
	}
}
