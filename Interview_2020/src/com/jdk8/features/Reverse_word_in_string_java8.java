package com.jdk8.features;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Reverse_word_in_string_java8 {
	public static void main(String[] args) {
		Reverse_word_in_string_java8 obj = new Reverse_word_in_string_java8();
		obj.reverse_words_in_String("Satish Prasad");
	}

	public void reverse_words_in_String(String str) {
		String[] words = str.split(" ");
		
		StringBuilder sb = new StringBuilder();
		Stream<String> stream = Arrays.stream(words);
		stream.forEach(w ->{
			Function<String, String> reverse = s->new StringBuilder(s).reverse().toString();
			String  reveserWord = reverse.apply(w);
			sb.append(reveserWord+" ");
		});
		
		System.out.println("Original String: "+str);
		System.out.println("Reversed String: "+sb);
	}
}
