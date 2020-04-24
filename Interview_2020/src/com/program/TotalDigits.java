package com.program;

public class TotalDigits {
	public static void main(String[] args) {
		int n = 13 ; 
        System.out.println(totalDigits(n)); 
	}

	public static int totalDigits(int n) {
		int count=0;
		for(int i=1;i<=n;i*=10) {
			count+=(n-i+1);
		}
		return count;
	}
}
