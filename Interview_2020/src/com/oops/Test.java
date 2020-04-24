package com.oops;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
		
		public static void main(String[] args) {
			List<String> list1 = new ArrayList<>();
			list1.add("foo");
			
			List<String> list2 =list1;
			List<String> list3 = new ArrayList<String>(list2);
			
			list1.clear();
			list2.add("bar");
			list3.add("baz");
			
			System.out.println(list1);
			System.out.println(list2);
			System.err.println(list3);
			
			List<Integer> list4 = new ArrayList<Integer>();
			list4.add(33);
			list4.add(44);
			List<Integer> list5 = new ArrayList<Integer>();
			list5.add(22);
			list5 = list4;
			System.out.println(list5);
			
			List list6 = new ArrayList<>();
			list6.add(333);
			list6.add("test");
			System.out.println(list6);
			String s1 = (String)list6.get(0); 
	        String s2 = (String)list6.get(1); 
	        
	        List list = new ArrayList();    
	        list.add("hello");    
	        String s = (String) list.get(0);//typecasting    
	}

		
}

