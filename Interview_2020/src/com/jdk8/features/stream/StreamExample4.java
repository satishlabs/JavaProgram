package com.jdk8.features.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample4 {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();

		productsList.add(new Product(1, "Thinkpad", 80000f));
		productsList.add(new Product(2, "Macbook", 180000f));
		productsList.add(new Product(3, "Sony", 56000f));
		productsList.add(new Product(4, "Dell", 40000f));
		productsList.add(new Product(5, "HP", 60000f));
		
		productsList.stream().filter(prod -> prod.price == 40000)
							.forEach(prod->System.out.println(prod.name));
	}
}
