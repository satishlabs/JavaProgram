package com.jdk8.features.staticIf;

interface InterfaceName{
	static void method1() {
		System.out.println("Method1 from interfaceName");
	}
}

interface InterfaceWithStaticMethod{
	static void show() {
		System.out.println("This is static default method");
	}
	void printData();
}

public class TestStatic implements InterfaceWithStaticMethod	{

	@Override
	public void printData() {
		System.out.println("Implementing abstract method in separate class");
	}
	public static void main(String[] args) {
		TestStatic t = new TestStatic();
		InterfaceWithStaticMethod.show();
		
		t.printData();
	}
}
