package com.jdk8.features.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample5 {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();

		productsList.add(new Product(1, "Thinkpad", 80000f));
		productsList.add(new Product(2, "Macbook", 180000f));
		productsList.add(new Product(3, "Sony", 56000f));
		productsList.add(new Product(4, "Dell", 40000f));
		productsList.add(new Product(5, "HP", 60000f));
		
		Float totalPrice = productsList.stream()
							.map(prod->prod.price)
							.reduce(0.0f, (sum,price)->sum+price); //accountng price
		System.out.println(totalPrice);
		
		System.out.println("===========================");
		float totalPrice2 = productsList.stream()
						.map(prod->prod.price)
						.reduce(0.0f, Float::sum);
		System.out.println(totalPrice2);
	}
}
