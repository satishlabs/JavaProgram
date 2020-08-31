package com.comapny.paramti;

public class Test1 {
	public static void main(String[] args) {
		double d = 10.0/-0;
		if(d == Double.POSITIVE_INFINITY) {
			System.out.println("Postivie Infinity");
		}else {
			System.out.println("Negative Infinity");
		}
	}
}
