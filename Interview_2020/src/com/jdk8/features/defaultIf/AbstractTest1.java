package com.jdk8.features.defaultIf;
abstract class AbstractClass{
	public AbstractClass() {
		System.out.println("You can create construcotr in abstract class");
	}
	
	abstract int add(int a,int b); //abstract method
	int sub(int a, int b) {
		return a-b;
	}
	
	static int multiply(int a,int b) {
		return a*b;
	}
}
public class AbstractTest1 extends AbstractClass{

	@Override
	int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		AbstractClass ab = new AbstractTest1();
		int res1 = ab.add(10, 20);
		int res2 = ab.sub(20, 30);
		//int res3 = ab.multiply(10, 5);
		int res3 = AbstractTest1.multiply(10, 5);
		System.out.println("Addition : "+res1);
		System.out.println("Subtraction : "+res2);
		System.out.println("Multiply : "+res3);
	}
}
