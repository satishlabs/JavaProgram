package com.oops.cons;

public class Temp {
	 // block to be executed before any constructor. 
    { 
        System.out.println("init block"); 
    } 
  
    // no-arg constructor 
    Temp() 
    { 
        System.out.println("default"); 
    } 
  
    // constructor with one arguemnt. 
    Temp(int x) 
    { 
        System.out.println(x); 
    } 
    static{
    	System.out.println("Static");
    }
    { 
        System.out.println("second"); 
    } 
    public static void main(String[] args) 
    { 
        // Object creation by calling no-argument  
        // constructor. 
        new Temp(); 
  
        // Object creation by calling parameterized  
        // constructor with one parameter. 
        new Temp(10); 
    } 
}
