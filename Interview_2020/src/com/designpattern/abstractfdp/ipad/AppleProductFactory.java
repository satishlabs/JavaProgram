package com.designpattern.abstractfdp.ipad;

public class AppleProductFactory {
	public AppleProduct createProduct(String type) {
		AppleProduct product = null;
		if(type.equalsIgnoreCase("IPhone")) {
			product = new IPhone();
		}else if(type.equalsIgnoreCase("tablet")){
			product = new IPad();
		}
		return product;
	}
}
