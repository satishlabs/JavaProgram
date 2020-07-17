package com.oops.random;

import java.util.Random;

public class GenerateRandomIntegers3 {
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("Print 3 numbers between 0 to 5");
		
		for(int i=0;i<3;i++)
			System.out.println(rand.nextInt(5+1));
	}
}
