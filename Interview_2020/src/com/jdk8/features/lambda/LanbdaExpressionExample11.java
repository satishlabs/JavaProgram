package com.jdk8.features.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LanbdaExpressionExample11 {
	public static void main(String[] args) {
		//adding product
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product(1, "Thinkpad", 80000f));
		list.add(new Product(4, "Keyboard", 1200f));
		list.add(new Product(3, "Dell Mouse", 300f));
		list.add(new Product(6, "Samsung A50S", 23000f));
		list.add(new Product(5, "Nokia6", 250000f));
		list.add(new Product(2, "IPhoneX", 120000));
		
		//Using lambda to filter data
		Stream<Product> filterd_data = list.stream().filter(p->p.price>20000);
		
		filterd_data.forEach(p ->System.out.println(p.name+" : "+p.price));
	}
}
