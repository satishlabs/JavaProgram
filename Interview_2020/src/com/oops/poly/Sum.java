package com.oops.poly;


public class Sum {
	public int sum(int x,int y) {
		return (x+y);
	}
	public int sum(int x,int y,int z) {
		return (x+y+z);
	}
	public double sun(double x, double y) {
		return (x+y);
	}
	
	public static void main(String[] args) {
		Sum s = new Sum();
		System.out.println(s.sum(10, 20));
		System.out.println(s.sum(10, 20, 30));
		System.out.println(s.sun(10.5, 12.5));
	}
}
