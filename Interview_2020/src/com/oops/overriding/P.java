package com.oops.overriding;

import java.io.IOException;
//Exception IOException is not compatible with throws clause in P.m1(char)
/*
 If an overridden method does not throw an exception then the overriding method cannot throw any checked or 
 compile-time exception. IOException is a compile-time exception.
For more details, go to this link:  
 */
public class P {
	public Object m1(char c) {
		return null;
	}
}
class Q extends P{
	public String m1(char c) throws IOException {
		return null;
	}
}