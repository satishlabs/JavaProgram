package com.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Integer[] arrayInteger = {1,2,3,4,3,2,4,6,7,8,9,9,10};

	    String value ="";

	    for(Integer i:arrayInteger)
	    {
	        if(!value.contains(Integer.toString(i))){
	            value +=Integer.toString(i)+",";
	        }

	    }
	    System.out.print(value+" ");
	    System.out.println();
	    System.out.println("--------------------------");
	    Set set = new HashSet();
	    for(Integer i:arrayInteger)
	    set.add(i);

	    System.out.print(set);
	}
}
