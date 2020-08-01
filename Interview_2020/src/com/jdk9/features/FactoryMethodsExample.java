package com.jdk9.features;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethodsExample {
	  public static void main(String[] args) {  
	        List<String> list = List.of("Java","JavaFX","Spring","Hibernate","JSP");  
	      //  List listl = List.of(1,2,4,"sat",3.5);
	       // System.out.println(listl);
	       list.forEach(l->System.out.println(l)); 
	       System.out.println("=======================================");
	       Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");  
	       set.forEach(s->System.out.println(s));
	       
	       System.out.println("========================================");
	       
	       Map<Integer,String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC");  
	        for(Map.Entry<Integer, String> m : map.entrySet()){    
	            System.out.println(m.getKey()+" "+m.getValue());  
	        }  
	        
	        System.out.println("=========================================");
	        // Creating Map Entry  
	        Map.Entry<Integer, String> e1 = Map.entry(101, "Java");  
	        Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");  
	        // Creating Map using map entries  
	        Map<Integer, String> map1 = Map.ofEntries(e1,e2);  
	        // Iterating Map   
	        for(Map.Entry<Integer, String> m : map1.entrySet()){    
	            System.out.println(m.getKey()+" "+m.getValue());  
	        }  

	    }  
}	
