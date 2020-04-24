package com.program;

public class CheckSparseMatrix {
	public static void main(String[] args) {
		int array[][] = {
							{18,0,3},
							{0,0,5},
							{1,0,0}
							
		                 };
		int m=3,n=3;
		if(isSpares(array,m,n)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
   // static int MAX=100;
	public static boolean isSpares(int[][] array, int m, int n) {
		int counter=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(array[i][j] == 0){
					counter++;
				}
			}
		}
		return (counter>((m*n)/2));
	}
}
