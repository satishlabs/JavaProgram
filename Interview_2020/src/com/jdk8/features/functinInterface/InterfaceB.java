package com.jdk8.features.functinInterface;

public interface InterfaceB {
	default void hello() {
		System.out.println("Interface-B");
	}
}
