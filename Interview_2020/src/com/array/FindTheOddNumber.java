package com.array;

import java.util.stream.IntStream;

public class FindTheOddNumber {
	public static void main(String[] args) {
		int l=1;
		int r=20;
		int[] oddNum = oddNumbers(l,r);
		for(int i=0;i<oddNum.length;i++) {
			System.out.print(oddNum[i]+" ");
		}
		//System.out.println("OddNumbers: "+oddNum);
	}

	private static int[] oddNumbers(int l, int r) {
		 return IntStream.rangeClosed(l, r).filter(num -> num % 2 == 1).toArray();
	}
}
