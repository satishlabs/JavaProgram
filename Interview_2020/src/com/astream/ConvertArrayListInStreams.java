package com.astream;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListInStreams {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Satish");
		list.add("Ms");
		list.add("Virat");
		list.add("Shikhar");
		list.add("Sanjay");
		// In one line display all records that start with 's' in stringList
        System.out.println("\n1. Use stream for filtering and display");
        
        list.stream().filter(e ->e.startsWith("S")).forEach(System.out::println);
        
     // In one line display all records (in sorted manner - ASCENDING) that start with 's' in stringList
        System.out.println("\n2. Use stream for filtering, sorting and display (in sorted manner - ASCENDING order )");
        list.stream().filter(e ->e.startsWith("S")).sorted().forEach(System.out::println);
        
        // In one line display all records (in sorted manner - DESCENDING) that start with 's' in stringList
        System.out.println("\n3. Use stream for filtering, sorting and display(in sorted manner - DESCENDING order)");
        list.stream().filter(e->e.startsWith("S")).sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
        
        // In one line display all records (in sorted manner) in UPPERCASE that start with 's' in stringList
        System.out.println("\n4. Use stream for filtering, UPPERCASE conevrsion, sorting and display");
        list.stream().filter(e->e.startsWith("S")).map(String::toUpperCase).sorted().forEach(System.out::println);
        
        System.out.println("");
        
        
        // In one line find whether any record start with 's' in stringList
        boolean anyRecordsStartWithA = list.stream().anyMatch((s)->s.startsWith("S"));
        System.out.println("any Record Starts With 's'  = "+anyRecordsStartWithA);
        
        // In one line find whether all records start with 's' in stringList
        boolean allRecordsStartWithA = list.stream().allMatch((s)->s.startsWith("S"));
        System.out.println("all Record Starts With 's'  = "+allRecordsStartWithA);
        
        //In one line find whether none of the records start with 'b' in stringList
        boolean nonRecordsStartWithB = list.stream().noneMatch((b)->b.startsWith("B"));
        System.out.println("none Record Starts With 'B' = "+nonRecordsStartWithB);
        
     // In one line count records start with 's' in stringList
        long countOfRecordsStartsWithA = list.stream().filter(e->e.startsWith("S")).count();
        System.out.println("countOfRecordsStartsWithA = "+countOfRecordsStartsWithA);
        
        
	}
}
