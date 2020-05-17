package com.oops;

import java.io.IOException;
import java.sql.SQLException;

class AT{
	protected  void m1(int a,int b) {
		System.out.println("AT");
		System.out.println(a+b);
	}
}
class BT extends AT{
	public  void m1(int a, int b) throws IOException{
		System.out.println("BT");
		System.out.println(a+b);
	}
}

static int fun() {
	
}

public class Test9 {
	public void add(int a) {
		System.out.println(a);
	}
	
	public void add(Integer a) {
		System.out.println(a);
	}
	
	public void add(Object a) {
		System.out.println(a);
	}
	public static void main(String[] args) throws Exception {
		Test9 t = new Test9();
		t.add(10);
		//t.add(10);
		//t.add(10);
		
		AT a = new BT();
		a.m1(10, 20);
	}
}
