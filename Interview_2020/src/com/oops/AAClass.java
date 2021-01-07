package com.oops;

import java.text.DateFormat;
import java.util.Date;

public class AAClass {
	public static void main(String[] args) {
		/*
		 * StringBuffer sb = new StringBuffer("a"); sb.append("12345678912345678");
		 * System.out.println(sb.length()); System.out.println(sb.capacity());
		 */
		
		parse("invalid");
	}

	public static void parse(String str) {
		float f = 0.0f;
		try {
			 f = Float.parseFloat(str);
		}catch (NumberFormatException e) {
			f=0;
		}finally {
			System.out.println(f);
		}
	}
	
}
