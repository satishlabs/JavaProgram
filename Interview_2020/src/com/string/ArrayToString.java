package com.string;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import com.google.common.base.Joiner;


public class ArrayToString {
	public static void main(String[] args) {
		
		// using  String.join
		String[] data = {"Turn","Array", "Into", "String","In", "Java", "Example"};
		String joindstr = String.join(" ", data);
		System.out.println(joindstr);
		
		CharSequence[] vowels = {"a","e","i","o","u"};
		String joinVowels = String.join(" " , vowels);
		System.out.println(joinVowels);
		
		List<String> strLis =  Arrays.asList("dev","with","us","blog");
		String joinedString = String.join(", ", strLis);
		System.out.println(joinedString);
		
		// using Arrays.toString
		String[] data2 = {"Hello","Array", "String", "Conversion", "Example"};
		String joinStr2 = Arrays.toString(data2);
		System.out.println(joinStr2);
		
		//using stringBuilder
		String[] data3 = {"Use","StringBuilder", "to", "turn", "Array","to","String","object"};
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<data3.length;i++) {
			sb.append(data3[i]+" ");
		}
		String joinStr3 = sb.toString();
		System.out.println(joinStr3);
		
		// using StringJoiner
		
		String[] data4 = {"path", "to", "devwithus.com", "blog"};
		StringJoiner joiner = new StringJoiner("");
		for(int i =0;i<data4.length;i++) {
			joiner.add(data4[i]+" ");
		}
		String joinStr4 = joiner.toString();
		System.out.println(joinStr4);
		
		// using Java 8 Stream API
		List<String> data5 = Arrays.asList("PHP", "Java", "GoLang", "Kotlin", "Perl");
		String joinStr5 = data5.stream()
						.collect(Collectors.joining(", ","[","]"));
		System.out.println(joinStr5);
		
		// using StringUtils
		String[] data6 =  { "John", "Karin", "Charles", "Lucas", "Diana" };
		//String joinStr6 = StringUtils.join(data6,"|");
		//System.out.println(joinStr6);
		
		
		// using Joiner
    	List<String> data7 = Arrays.asList("MOSCOW", "PARIS", "LONDON", "MADRID");
    	//String joinedstr7 = Joiner.on(":").join(data7);
    	//System.out.println(joinedstr7);

   	 // using custom implementation
    	String[] arr = { "United states", "Canada", "France", "United Kingdom" };
    	String joinedstr8 = ArrayToString.arrayTostring(arr);
    	System.out.println(joinedstr8);
	}

	private static String arrayTostring(String[] arr) {
		String str = "[";
		for(int i=0;i<arr.length;i++) {
			if(i > 0) {
				str = str + ",";
			}
			String item = arr[i];
			str = str + item;
		}
		str = str +"]";
		return str;
		
	}
}
