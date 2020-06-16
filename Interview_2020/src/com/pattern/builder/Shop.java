package com.pattern.builder;

public class Shop {
	public static void main(String[] args) {
		//Phone p = new Phone("Android", 6, "Qualcomm", 5.5, 4200);
		//Phone p = new Phone("Android", 6, "Qualcomm", 5.5, 4200);
		Phone p = new PhoneBuilder().setOs("Android").setRam(6).getPhone();
		System.out.println(p);
	}
}
