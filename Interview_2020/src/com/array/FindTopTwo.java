package com.array;

public class FindTopTwo {
	public static void main(String[] args) {
		int num[] = {4,23,67,1,98,13};
		FindTopTwo obj = new FindTopTwo();
		obj.findTwoMaxNumbers(num);
		
		
		
	}

	private void findTwoMaxNumbers(int[] num) {
		int maxOne =0;
		int maxTwo = 0;
		
		for(int i : num) {
			if(maxOne < i) {
				maxTwo = maxOne;
				maxOne = i;
			}else if(maxTwo < i) {
				maxTwo =  i;
			}
		}
		System.out.println("MaxOne: "+maxOne);
		System.out.println("MaxTwo: "+maxTwo);
	}
}
