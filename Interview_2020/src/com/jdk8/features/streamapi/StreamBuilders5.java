package com.jdk8.features.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamBuilders5 {
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		memberNames.add("Base");
		memberNames.add("Satish");
		
		 memberNames.stream().filter((s)->s.startsWith("S"))
				.forEach(System.out::println);
		 System.out.println("=======================================");
		 memberNames.stream().filter((s)->s.startsWith("A"))
		 				.map(String::toUpperCase)
		 				.forEach(System.out::println);
		 
		 System.out.println("=========================================");
		 memberNames.stream().sorted()
		 				.map(String::toUpperCase)
		 				.forEach(System.out::println);
		 System.out.println("=====================================");
		 memberNames.forEach(System.out::println);
		 
		 System.out.println("======================================");
		 List<String> memNamesInUppercase = memberNames.stream().sorted()
				 						.map(String::toUpperCase)
				 						.collect(Collectors.toList());
		 System.out.println(memNamesInUppercase);
		 
		 System.out.println("========================================");
		 
		 boolean matchedResult = memberNames.stream().anyMatch((s)->s.startsWith("A"));
		 System.out.println(matchedResult);
		 
		 matchedResult = memberNames.stream().allMatch((S)->S.startsWith("A"));
		 System.out.println(matchedResult);
		 
		 matchedResult = memberNames.stream().noneMatch((s)->s.startsWith("A"));
		 System.out.println(matchedResult);
		 
		 long totalMatched = memberNames.stream()
				 			.filter((s)->s.startsWith("A")).count();
		 System.out.println(totalMatched);
		 
		 Optional<String> reduced = memberNames.stream().reduce((s1,s2)->s1+" # "+s2);
		 reduced.ifPresent(System.out::println);
		 System.out.println("================================================");
		 
		 boolean matched = memberNames.stream().anyMatch((s)->s.startsWith("A"));
		 System.out.println(matched);
		 
		 String firstMatchedName = memberNames.stream().filter((s)->s.startsWith("L")).findFirst().get();
		 System.out.println(firstMatchedName);
		 
		 
	}
}
