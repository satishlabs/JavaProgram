package com.program;

public class TestSparse {
	public static void main(String[] args) {
		int array[][] = {
							{18,0,3},
							{0,0,5},
							{0,0,1}	
		                 };
		isSpares(array);		
	}
    public static void isSpares(int[][] array) {
		int m=3,n=3;
		int countZero=0;
		int countNonZero=0;
    	for(int i=0;i<m;i++){
    		for(int j=0;j<n;j++){
    			if(array[i][j] ==0){
    				countZero++;
    			}else{
    				countNonZero++;
    			}
    		}
    	}
    	if(countZero>countNonZero){
    		System.out.println("Yes");
    	}else{
    		System.out.println("No");
    	}
	}
}
