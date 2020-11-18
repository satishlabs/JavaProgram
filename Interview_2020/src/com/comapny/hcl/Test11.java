package com.comapny.hcl;

public class Test11 {
	public static void main(String[] args) {
		int a[] = new int[]{3,4,5,6,7};
	      for(int i=0;i<a.length;i++){
	       //   System.out.println(a[i]);
	       //   break;
	          //System.out.println(a[i]);//Unreachable code
	        }
	      for(int i=0;i<a.length;i++){
	          System.out.println(a[i]);
	          continue;
	          }
	}
}
