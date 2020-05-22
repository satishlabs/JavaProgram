package com.company.arisglobal;

public class OverloadingDemo {
	public static void main(String[] args) {
		show(null);
	}

	public void show(Object o) {
		System.out.println("In object method");
	}
	
	public void show(String o) {
		System.out.println("In String method");
	}
	
	public void show(StringBuffer o) {
		System.out.println("In StringBuffer method");
	}
}
