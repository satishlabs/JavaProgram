package com.comapny.hcl;

import java.util.Scanner;

//Wap 1*2*3*4	

public class PrintStartAndNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		StringBuffer sb = new StringBuffer();
		int n = sc.nextInt();
		int a=1;
		for(int i=1;i<=n;i++) 
			for(int j=1;j<i;j++) 
				System.out.print((a++)+"*");
			
			System.out.println(a++);
		
	}

}
