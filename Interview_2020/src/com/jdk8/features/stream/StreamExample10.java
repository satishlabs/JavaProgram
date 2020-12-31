package com.jdk8.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample10 {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();

		productsList.add(new Product(1, "Thinkpad", 80000f));
		productsList.add(new Product(2, "Macbook", 180000f));
		productsList.add(new Product(3, "Sony", 56000f));
		productsList.add(new Product(6, "Nokia", 56000f));
		productsList.add(new Product(4, "Dell", 40000f));
		productsList.add(new Product(5, "HP", 60000f));
		
		//Converting Product List into a Map
		Map<Integer, String> productPriceMap = productsList.stream()
											.collect(Collectors.toMap(p->p.id, p->p.name));
		System.out.println(productPriceMap);
	}
}
