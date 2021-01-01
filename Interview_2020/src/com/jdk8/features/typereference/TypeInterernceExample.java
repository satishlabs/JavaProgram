package com.jdk8.features.typereference;

import java.util.ArrayList;
import java.util.List;

public class TypeInterernceExample {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		showList(list1);
		
		//You can left blank, compiler can infer type
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(12);
		showList(list2);
		
		//Compiler infers type of ArrayList, in Java8
		showList(new ArrayList<>());
	}

	private static void showList(List<Integer> list1) {
		if(!list1.isEmpty()) {
			list1.forEach(System.out::println);
		}else System.out.println("List is empty!");
	}
}
