package com.jdk8.features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
	public static void main(String[] args) {
        List<String> countries = Arrays.asList("Australia","Brazil", "China","Denmark","England","France","Germany");
        long count = countries.stream().filter(countryName -> countryName.startsWith("A")).count();
        System.out.println("Country name starting with A = "+count);
        
        //Map method
        countries.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
        
        //collect() method
        System.out.println("===========================================");
        countries.stream().map(name -> name.toUpperCase()).collect(Collectors.toList())
        									.forEach(System.out::println);
        //sorted() method
        System.out.println("===================================================");
        countries.stream().sorted().forEach(System.out::println);
        
        System.out.println("================================================");
        
	}
}
