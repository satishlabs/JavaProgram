package com.jdk8.features.lambda;

import java.util.ArrayList;
import java.util.List;

public class LanbdaExpressionExample7 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Dhoni");
		list.add("Virat");
		list.add("Rahul");
		list.add("Rohit");
		
		list.forEach(
				(n)->System.out.println(n)
				);
		
		System.out.println("-------------------------");
		System.out.println();
		list.forEach(s->System.out.println(s));
	}
}
