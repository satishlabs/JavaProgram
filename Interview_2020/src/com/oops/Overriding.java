package com.oops;
class Test1{
	Test1(){
		System.out.println("Test1------------");
	}
	public void method1() {
		System.out.println("Method1() -- Test1");
	}
}

class Test2 extends Test1{
	Test2(){
		System.out.println("Test2------------");
	}
	public void method1() {
		System.out.println("Method1() -- Test2");
	}
}
public class Overriding {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		Test1 t3 = new Test2();
		
		t1.method1();
		t2.method1();
		t3.method1();
	}
}
