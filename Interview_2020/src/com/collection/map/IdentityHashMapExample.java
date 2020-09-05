package com.collection.map;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
/*
 IdentityHashMap when comparing keys (and values) performs reference-equality in place of object-equality. 
 In an IdentityHashMap, two keys k1 and k2 are equal if and only if (k1==k2). 
 (In normal Map implementations (like HashMap) two keys k1 and k2 
 are considered equal if and only if (k1==null ? k2==null : k1.equals(k2)).)
 * */
import java.util.Set;

public class IdentityHashMapExample {
	public static void main(String[] args) {
		 Map<Integer,String> identityHashMap=new IdentityHashMap<Integer,String>();
		 identityHashMap.put(11, "audi");
		    identityHashMap.put(21, "bmw");
		    identityHashMap.put(31, "ferrari");
		 
		 System.out.println(identityHashMap.get(2));
		 identityHashMap.remove(1);
		 System.out.println(identityHashMap);
		 System.out.println(identityHashMap.size());
		 
		 Iterator<Integer> keyItr = identityHashMap.keySet().iterator();
		 while(keyItr.hasNext()) {
			 System.out.println(keyItr.next());
		 }
		 System.out.println("Iteration using enhanced for loop.=====");
		 Set<Integer> keySet=identityHashMap.keySet();
		 for(Integer key :keySet){
		   System.out.println(key);
		 }
		 
		/*
		 * System.out.println("iterator returned is fail fast==============");
		 * Iterator<Integer> iterator=identityHashMap.keySet().iterator();
		 * while(iterator.hasNext()){ System.out.println(iterator.next());
		 * identityHashMap.put(4, "d"); }
		 */
		 System.out.println("IdentityHashMap.values().iterator() method returns iterator to iterate over keys in IdentityHashMap.\r\n" + 
		 		"");
		 Iterator<String> valueIterator=identityHashMap.values().iterator();
		 while(valueIterator.hasNext()){
		   System.out.println(valueIterator.next());
		 }
	}
}
