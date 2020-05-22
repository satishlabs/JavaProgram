package com.comapny.hcl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(20);
		list.add(5);
		list.add(11);
		
		Collections.sort(list);
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
