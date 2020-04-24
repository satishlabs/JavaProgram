package com.oops;

public class Child1 extends Parent1{
	 @Override
	 public Integer connect(String s2) throws RuntimeException, NullPointerException{ 
	  System.out.println("Doing connection in Child way");
	  return null;
	 }
	 
	 @Override
	 protected Object connect1(String s1) throws RuntimeException{  
	  System.out.println("Doing connection in Parent way"); 
	  return null;
	 }
	 public static void main(String[] args) {
		Parent1 p = new Child1();
		p.connect("Hello");
	}
}
