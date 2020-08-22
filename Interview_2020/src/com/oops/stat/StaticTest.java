package com.oops.stat;
class Test{
	int a=10;
	int b=20;
	static int c=30;
	
	public Test(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void show() {
		System.out.print("A: "+a+" B: "+b+" C: "+c);
	}
	public static void show1() {
		System.out.print(" C: "+c);
	}
}
public class StaticTest {
	public static void main(String[] args) {
		Test t = new Test(100,200);
		//t.a=50;
		//t.b=60;
		//t.c=70;
		t.show();
		System.out.println();
		System.out.println("=========================");
		Test.show1();
	}
}
