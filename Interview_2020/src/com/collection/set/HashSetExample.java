package com.collection.set;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Audi");
		
		//fail-fast
		Iterator<String> itr = hashSet.iterator();
		while(itr.hasNext()) {
			//hashSet.add("Maruti"); //unComment to avoid ConcurrentModificationException
			System.out.println(itr.next());
		}
		
		//fail-fast
		Enumeration<String> enumList = Collections.enumeration(hashSet);
		while(enumList.hasMoreElements()) {
		//	hashSet.add("Honda");
			System.out.println(enumList.nextElement());
		}
		
		//enhanced for loop is fail-fast
	    for(String string:hashSet){
	           hashSet.add("newElement3"); //unComment to avoid ConcurrentModificationException
	           System.out.println(string);
	    }
	}
}
