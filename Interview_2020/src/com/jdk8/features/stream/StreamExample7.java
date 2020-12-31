package com.jdk8.features.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample7 {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();

		productsList.add(new Product(1, "Thinkpad", 80000f));
		productsList.add(new Product(2, "Macbook", 180000f));
		productsList.add(new Product(3, "Sony", 56000f));
		productsList.add(new Product(4, "Dell", 40000f));
		productsList.add(new Product(5, "HP", 60000f));
		
		//max() method to get max Product price
		Product productA = productsList.stream()
							.max((prod1,prod2)->prod1.price > prod2.price ?1:-1).get();
		System.out.println(productA.price);
		
		//min() method to get min Product price
		Product productB = productsList.stream()
							.max((prod1,prod2)->prod1.price < prod2.price ?1:-1).get();
		System.out.println(productB);
	}
}
