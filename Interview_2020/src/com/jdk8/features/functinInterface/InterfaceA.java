package com.jdk8.features.functinInterface;

public interface InterfaceA {
	default void hello() {
		System.out.println("Interface-A");
	}
}
