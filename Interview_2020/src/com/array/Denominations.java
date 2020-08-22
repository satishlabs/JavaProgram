package com.array;

public class Denominations {
	public static void main(String[] args) {
		int[] notes = {2000,500,200,100,50,20,10,5,2,1};
		int amount = 2724;
		
		int copy = amount;
		int totalNotes=0;
		int count=0;
		
		System.out.println("\nATM CASH DENOMINATIONS: \n");
		
		for(int i=0;i<10;i++) {
			count = amount/notes[i];
			if(count != 0) {
				System.out.println(notes[i]+"\tx\t"+count+"\t= "+notes[i]*count);
			}
			totalNotes = totalNotes+count;
			amount = amount%notes[i];
					
		}
		System.out.println("--------------------------------");
		 System.out.println("TOTAL\t\t\t= "+copy); //printing the total amount
		 System.out.println("--------------------------------");
		 System.out.println("Total Number of Notes\t= "+totalNotes); //printing the total number of notes
	}
}
