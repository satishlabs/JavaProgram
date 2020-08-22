package com.comapny.hcl;

import java.util.HashSet;

public class FindMissingNumber {
	public static void main(String[] args) {
		int []a = {1,2,6,3,4,5};
		int []b = {2,4,3,1};
		
		int n = a.length;
		int m = b.length;
		
		//findMissing(a, b, n, m); 
        findMissingWithHashset(a, b, n, m); 
	}

	public static void findMissingWithHashset(int[] a, int[] b, int n, int m) {
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<m;i++) 
			set.add(b[i]);
		
		System.out.println(set);
		
		for(int i=0;i<n;i++) {
			  if (!set.contains(a[i])) 
				System.out.print(a[i] + " ");  
			
		}
		
	}
	public static void findMissing(int[] a, int[] b, int n, int m) {
		for(int i=0;i<n;i++) {
			int j;
			for( j=0;j<m;j++) 
				if(a[i] == b[j]) 
					break;
				
				if(j==m) 
					//System.out.println();
					System.out.print(a[i]+" ");
				
			
		}
		
	}
}
