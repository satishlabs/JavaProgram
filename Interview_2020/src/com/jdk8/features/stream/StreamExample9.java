package com.jdk8.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample9 {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();

		productsList.add(new Product(1, "Thinkpad", 80000f));
		productsList.add(new Product(2, "Macbook", 180000f));
		productsList.add(new Product(3, "Sony", 56000f));
		productsList.add(new Product(6, "Nokia", 56000f));
		productsList.add(new Product(4, "Dell", 40000f));
		productsList.add(new Product(5, "HP", 60000f));
		
		//Converting product List into Set
		Set<Float> productPriceSet = productsList.stream()
							.filter(prod ->prod.price < 60000) //Filter product on the base of price
							.map(prod->prod.price)
							.collect(Collectors.toSet()); //collect it as Set(remove duplicate elements)
		
		System.out.println(productPriceSet);
	}
}
