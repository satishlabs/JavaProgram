package com.program;

import java.io.IOException;

class AAA{
	AAA(){
		System.out.println("In class AAA's constructor");
	}
	static void m1() throws IOException{
		System.out.println("In Method m1 of class AAA");
	}
	
}
class BBB extends AAA{
	BBB(){
		System.out.println("In class BBB's construcotr");
	}
	static void m1() throws Exception{
		System.out.println("In method m1 of class BBB");
	}
	void m2() {
		System.out.println("In method m2 of class BBB");
	}

}
public class Test1 {
	public static void main(String[] args) throws Exception {
		AAA a = new BBB();
		a.m1();
		System.out.println("--------------------------------------------");
		BBB b = new BBB();
		b.m1();
	}
}
