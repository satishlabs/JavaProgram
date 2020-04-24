package com.string;

public class SelectionSortReverseOnString {
	 static String stringToBeSorted= "java";      
	    //static String stringToBeSorted= "javaMadeSoEasy"; //Test String
	    
	    static char[] ar = stringToBeSorted.toCharArray();  
	
	public static void main(String[] args) {
		 selectionSort();
         System.out.println(ar);
		
	}

	public static void selectionSort() {
		int outer, inner, minimum;
        for (outer = 0; outer < ar.length - 1; outer++) // outer loop
        {
               minimum = outer;
               for (inner = outer + 1; inner < ar.length; inner++)// inner loop
                     if (ar[inner] > ar[minimum]) // if minimum greater,
                            minimum = inner; // we have a new minimum

               swap(outer, minimum); // swap them
        }
		
	}
	 private static void swap(int pos1, int pos2) {
         char temp = ar[pos1];
         ar[pos1] = ar[pos2];
         ar[pos2] = temp;
  }
  
	
}
