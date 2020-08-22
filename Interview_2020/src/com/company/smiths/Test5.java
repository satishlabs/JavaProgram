package com.company.smiths;

public class Test5 {
	public static void main(String[] args) {
		Test5 t = new Test5();
		t.foo(false, true);
	}
	public void foo(boolean a, boolean b) {
		if(a) {
			System.out.println("A");
		}else if( a && b) {
			System.out.println("A && B");
		}else {
			if(!b) {
				System.out.println("notB");
			}else {
				System.out.println("ELSE");
			}
		}
	}
}
