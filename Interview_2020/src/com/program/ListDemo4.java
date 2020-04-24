package com.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListDemo4 {
	public static void main(String[] args) {
		List numList = new ArrayList<>();
	    numList.add(10);
	    numList.add(20);
	    numList.add(10);
	    numList.add(20);
	    numList.add(15);
	    System.out.println("Duplicate List elements: "+numList);
	    
	    Set mySet = new HashSet<>(numList);
	    System.out.println("Set numList: "+mySet);
	    TreeSet<Integer> ts = new TreeSet<>(mySet);
	    System.out.println("Tree set :"+ts);
	     
	    List numlist2 = new ArrayList<>();
	    numlist2.add(ts);
	    System.out.println("Sorted numlist2: "+numlist2);
	}
}
