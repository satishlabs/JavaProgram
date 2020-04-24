package com.collec;

import java.util.HashMap;
import java.util.Iterator;

public class HashmapTest {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("key1", "value1");
		hashMap.put("key2", "value2");
		hashMap.put("key3", "value3");
		hashMap.put("key4", "value4");
		
		Iterator<String> itr = hashMap.keySet().iterator();
		while(itr.hasNext()){
			itr.next();
			System.out.println("Next: "+hashMap);
			itr.remove();
			System.out.println("Remove: "+hashMap);
		}
	}
}
