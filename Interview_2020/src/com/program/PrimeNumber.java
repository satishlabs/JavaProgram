package com.program;

public class PrimeNumber {
		public static void main(String[] args) {
			int m=5,n=21;
			int count;
			for(int j=m;j<=n;j++) {
				count=0;
				for(int i=2;i<=j/2;i++) {
					if(j%i==0) {
						count++;
						break;
					}
				}
				if(count==0) {
					System.out.print(j+" ");
				}

			}
					}
}
