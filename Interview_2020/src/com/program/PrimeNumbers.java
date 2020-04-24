package com.program;

public class PrimeNumbers {
	public static void main(String[] args) {
		int n=15;
		int count=0;
		int x=0;
		for(int i=2;i<=n/2;i++) {
			x++;
			if(n%i==0) {
				count++;
				break;
			}
		}
		System.out.println("Prime: "+x);
		if(count==0) {
			System.out.println(n+ " Prime number");
		}else {
			System.out.println(n+ " Not prime");
		}
	}
}
