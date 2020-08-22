package com.oops;
class A{
	int i;
	static{
		System.out.println("class A SIB");
	}
	{
		System.out.println("class A IIB");
	}
	A(int i){
		System.out.println("class A Constructor: "+i);
		
	}
}
class B extends A{
	int j;
	public B(){
		super(10);
		System.out.println("Class B Constructor");
	}
}
public class TestClass {
	public static void main(String[] args) {
		B b= new B();
	}
}
