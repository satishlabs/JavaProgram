package com.company.smiths;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	public static void main(String[] args) {
		String str= "She Sells Sea shells";
		String rex ="SsS";
		String replace = "x";
		
		Pattern p = Pattern.compile(rex);
		System.out.println("p "+p);
		Matcher m = p.matcher(str);
		System.out.println("m "+m);
		String val = m.replaceAll(replace);
		System.out.println(val);
	}
}
