package com.company.arisglobal;
class Hello{
	public static void m1() {
		System.out.println("M1 in Hello");
	}
}

class Hi extends Hello{
	public static void me() {
		System.out.println("M1 in Hi");
	}
}
public class qq31 {
	public static void main(String[] args) {
		Hello h = new Hi();
		h.m1();
	}
}
