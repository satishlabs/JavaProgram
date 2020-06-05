package com.serialization.scenario2;

import java.io.Serializable;

public class B extends A implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int j;
	   B(int i , int j) {
	      super(i);
	      this.j=j;
	   }
}
