package com.oops;

public class Overloading {
	public int sum(int a,float b) {
		return (int) (a+b);
	}
	public int sum(Integer s,Double s1) {
		return (int) (s+s1);
		
	}
	public int sum(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Overloading o1 = new Overloading();
		System.out.println(o1.sum(10, 10.5));
		System.out.println(o1.sum(20, 30));
		System.out.println(o1.sum(30, 40));
	}
}
