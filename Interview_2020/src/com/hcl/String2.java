package com.hcl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class String2 {
	 public static void main(String[] args) {
	        String str = "Satish Prasad";
	        Map<Character, Integer> items = new HashMap<Character, Integer>();
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (items.containsKey(c)) {
	                int cnt = items.get(c);
	                items.put(c, ++cnt);
	            } else {
	                items.put(c, 1);
	            }
	        }
	       // System.out.println("itmes : " + items);
	        Set<Character> keys = items.keySet();
	        for (Character ch : keys) {
	            if (items.get(ch) > 1) {
	                str = str.replaceAll(ch.toString(), "*");
	            }
	        }

	        System.out.println("Output : " + str);
	    }
}
