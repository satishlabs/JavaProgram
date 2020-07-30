package com.collection.map;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> premiumPhone = new ConcurrentHashMap<>();
		premiumPhone.put("Apple", "iPhone6");
		premiumPhone.put("HTC", "HTC one");
		premiumPhone.put("Samsung", "A50S");
		
		Iterator itr = premiumPhone.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(premiumPhone.get(itr.next()));
			
			premiumPhone.put("Sony", "Xperia Z");
			
			
			//System.out.println(premiumPhone.get(itr.next()));
			
		}
		
	}
}
