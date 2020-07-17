package com.oops.random;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomIntegers2 {
	public static void main(String[] args) {
		int min=5;
		int max=10;
		System.out.println("print 3 random numbers between "+min+" and "+max);
		
		for(int i=0;i<3;i++){
			System.out.println(ThreadLocalRandom.current().nextInt(min, max+1));
		}
	}
}
