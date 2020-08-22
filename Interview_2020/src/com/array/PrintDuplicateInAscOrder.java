package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

//Speaker Mute kar do

public class PrintDuplicateInAscOrder {
	public static void main(String[] args) {
        int[] numbers = { 4, 1, 3, 4, 5, 3, 4, 1, 4 };
        Arrays.sort(numbers);
        //System.out.println("Sorted Array is :: = " + Arrays.toString(numbers));

       // int count = 0;
        int tempCount = 0; // to keep local count of matched numbers
        ArrayList<Integer> duplicates = new ArrayList<>();
        int j=0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                if ((tempCount == 0)) { // If same number is repeated more than
                                        // two times, like 444, 7777
                   // count = count + 1;
                    tempCount = tempCount + 1;
                    duplicates.add(numbers[i]);
                    
                }
            } else {
                tempCount = 0;
            }
        }
        Collections.reverse(duplicates);
        System.out.println(duplicates);
        
        
    }

	
	
}
