package com.array;

public class CountCurrency {
	public static void main(String[] args) {
		int amount = 5700; 
		//System.out.println("Enter the valid amount!");
	
			if(amount%500 == 0 || amount%100==0) {
				countCurrency(amount); 
			}else {
				System.out.println("InValid Entry");
			}
	}

	private static void countCurrency(int amount) {
		int[] notes = new int[] {2000,500,200,100,50,20,10,5,2,1};
		int[] noteCounter = new int[10];
		
		for(int i=0;i<10;i++) {
			if(amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount - noteCounter[i]*notes[i];
			}
			
		}
		System.out.println("Currency Notes");
		for(int i=0;i<10;i++) {
			if(noteCounter[i] != 0) {
				System.out.println(notes[i]+" : "+noteCounter[i]);
			}
		}
	}
}
