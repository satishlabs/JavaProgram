package com.oops.random;

import java.util.Random;

public class GenerateRandomIntegers1 {
	public static void main(String[] args) {
		int min=5;
		int max=10;
		
		Random rand = new Random();
		System.out.println("print 3 random numbers between "+min+" and "+max);
		
		for(int i=0; i<3; i++)
			System.out.println(rand.nextInt((max-min)+1)+min);
	}
}
