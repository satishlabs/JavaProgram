package com.jdk8.features.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample1 {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		
		productsList.add(new Product(1, "Thinkpad", 80000f));
		productsList.add(new Product(2, "Macbook", 180000f));
		productsList.add(new Product(3, "Sony", 56000f));
		productsList.add(new Product(4, "Dell", 40000f));
		productsList.add(new Product(5, "HP", 60000f));
		
		List<Float> productPriceList = new ArrayList<Float>();
		for(Product prod : productsList) {
			if(prod.price <60000) {
				productPriceList.add(prod.price);
			}
		}
		System.out.println(productPriceList);
	}
}
