package com.jdk8.features.functinInterface;

public class MultipleDefaultdemo2 implements InterfaceA,InterfaceB{
	public static void main(String[] args) {
		new MultipleDefaultdemo2().hello();
	}
	
	public void hello() {
		InterfaceA.super.hello();
		InterfaceB.super.hello();
	}
}

