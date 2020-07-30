package com.comapny.sap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class OutOfMemoryError {
	 
	  
	 public static void main(String args[]) throws Exception 
	     { 
		 	Map m = new HashMap(); 
	        m = System.getProperties(); 
	        Random r = new Random(); 
	        while (true) { 
	            m.put(r.nextInt(), "randomValue"); 
	        } 
	     } 
}
