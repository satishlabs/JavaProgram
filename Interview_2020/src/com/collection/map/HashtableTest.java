package com.collection.map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class HashtableTest {
	public static void main(String[] args) {
		Hashtable<String,Integer> ht=new Hashtable();
		ht.put("a",101);
		ht.put("null", 11);
		ht.put("b",102);
		ht.put("c",103);
		ht.forEach((o1,o2)->System.out.println(o1+" "+o2));
		
		
		
	}

}
