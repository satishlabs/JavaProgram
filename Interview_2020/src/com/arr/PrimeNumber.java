package com.arr;

public class PrimeNumber {
	public static void main(String[] args) {
		int m=1,n=25,count=0;
		for(int j=m;j<=n;j++) {
			count=0;
			for(int i=2; i<=j/2;i++) {
				if(j%i == 0) {
					count++;
					break;
				}
			}
			if(count ==0) {
				System.out.println(j);
			}
		}
	}
}
