package com.jdk8.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();

		productsList.add(new Product(1, "Thinkpad", 80000f));
		productsList.add(new Product(2, "Macbook", 180000f));
		productsList.add(new Product(3, "Sony", 56000f));
		productsList.add(new Product(4, "Dell", 40000f));
		productsList.add(new Product(5, "HP", 60000f));
		
		List<Product> productPriceList = productsList.stream()
					.filter(p->p.price>60000)
					//.map(p->p.price)
					.collect(Collectors.toList());
		
		System.out.println(productPriceList);
		System.out.println("=============================");
		List<Float> productPriceList1 = productsList.stream()
					.filter(p->p.price>60000)
					.map(p->p.price)
					.collect(Collectors.toList());
		
		System.out.println(productPriceList1);
		
	}
}
