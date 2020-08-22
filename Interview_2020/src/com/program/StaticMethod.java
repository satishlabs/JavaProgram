package com.program;

public class StaticMethod {
	// static block execution without main method in JDK 1.6. 
    static
    { 
        System.out.println("Inside Static Block."); 
        System.exit(0); 
    } 
}
