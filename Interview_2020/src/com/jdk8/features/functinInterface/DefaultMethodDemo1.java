package com.jdk8.features.functinInterface;

public class DefaultMethodDemo1 {
	public static void main(String[] args) {
		MyIF obj = new MyClass();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.multiply(5, 10));
	}
}
