package com.jdk8.features.functinInterface;
interface A{
	public void add();
}
interface B{
	public void add();
}
public class Test implements A, B{

	public static void main(String[] args) {
		Test t = new Test();
		t.add();
	}

	@Override
	public void add() {
		System.out.println("AAA+BBB");
		
	}
	
}
