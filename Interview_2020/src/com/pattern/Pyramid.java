package com.pattern;
/*
      1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
 * */
public class Pyramid {
	public static void main(String[] args) {
		int n=5;
		int rowCount=1;
		for(int i=n;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=rowCount;j++) {
				System.out.print(rowCount+" ");
			}
			System.out.println();
			rowCount++;
		}
	}
}
