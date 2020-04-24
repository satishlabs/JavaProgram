package com.program;

public class PrintStartAndNumber {
	public static void main(String[] args) {
		 int n=3;
		StringBuffer sb = new StringBuffer();
	
		int a=1;
		for(int i=1;i<=n;i++) 
			for(int j=1;j<i;j++) 
				System.out.print((a++)+"*");
			
			System.out.println(a++);
		
	}
}
