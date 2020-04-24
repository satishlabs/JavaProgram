package com.oops;

public class AClass {
	public static void main(String[] args) {
		int a=2,b=3,c=4;
		a = b++ + c;
		c+=b;
		b+=a*2;
		
		System.out.println(a+" "+b+" "+c);
	}
}
