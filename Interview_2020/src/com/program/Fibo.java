package com.program;

public class Fibo {
	public static void main(String[] args) {
		int a=0,b=1,c=0,n=6;
		while(a<n){
			System.out.print(" "+a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
