package com.program;
class Base{
	 public Base() {
		System.out.println("Base");
	}
}
class Derived extends Base{
	public Derived() {
		System.out.println("Drived");
	}
}
class DerDerived extends Derived{
	public DerDerived() {
		System.out.println("DerDerived");
	}
}
public class Test3 {
	public static void main(String[] args) {
		Derived d = new DerDerived();
		
	}
}
