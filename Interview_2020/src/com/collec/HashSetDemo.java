package com.collec;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<>();
		 //add elements to HashSet
	     hset.add("Abhijeet");
	     hset.add("Ram");
	     hset.add("Kevin");
	     hset.add("Singh");
	     hset.add("Rick");
	     // Duplicate removed
	     hset.add("Ram");
	     
	     for(String str:hset){
	    	 System.out.println(str);
	     }
	}
}
