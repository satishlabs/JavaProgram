package com.jdk8.features.functinInterface;

public interface MyIF {
	int add(int a,int b);
	default int multiply(int a,int b) {
		return a*b;
	}
}
