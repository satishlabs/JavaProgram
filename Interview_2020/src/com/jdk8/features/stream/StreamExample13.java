package com.jdk8.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample13 {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();

		productsList.add(new Product(1, "Thinkpad", 80000f));
		productsList.add(new Product(2, "Macbook", 180000f));
		productsList.add(new Product(3, "Sony", 56000f));
		productsList.add(new Product(6, "Nokia", 56000f));
		productsList.add(new Product(4, "Dell", 40000f));
		productsList.add(new Product(5, "HP", 60000f));
		
		List<Float> priceList = productsList.stream()
								.filter(prod->prod.getPrice() >50000)
								.map(prod->prod.price)
								.collect(Collectors.toList());
		System.out.println(priceList);
		
		List<Product> priceList1 = productsList.stream()
				.filter(prod->prod.getPrice() >50000)
				//.map(prod->prod.price)
				.collect(Collectors.toList());
System.out.println(priceList);
	}
}
