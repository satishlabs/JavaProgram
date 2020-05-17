package com.designpattern.abstractfdp.ipad;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		//Create Factory
		AppleProductFactory factory = new AppleProductFactory();
		
		   //Create product using Factory
		AppleProduct product  = factory.createProduct("Iphone");
		product.prepare();
		
		//Create product using Factory
		
		product = factory.createProduct("tablet");
		product.prepare();
	}
}
