package com.jdk8.features.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LanbdaExpressionExample10 {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		
		//adding product
		list.add(new Product(1, "Thinkpad", 80000f));
		list.add(new Product(2, "Keyboard", 1200f));
		list.add(new Product(3, "Dell Mouse", 300f));
		
		System.out.println("Sorting on the based on name");
		
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for(Product p:list) {
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
	}
}
