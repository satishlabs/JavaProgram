package com.oops;

public class AClass {
	public static void main(String[] args) {
		int a=2,b=3,c=4;
		a = b++ + c; //7
		c+=b; //8
		b+=a*2; //b = b+14 ==18
		
		System.out.println(a+" "+b+" "+c);
	}
}
