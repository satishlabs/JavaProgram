package com.jdk8.features.functinInterface;

public interface InterfaceBB  extends InterfaceA{
	default void hello() {
		System.out.println("Interface - BB");
	}
}
