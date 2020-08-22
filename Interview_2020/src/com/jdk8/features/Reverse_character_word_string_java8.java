package com.jdk8.features;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Reverse_character_word_string_java8 {
	public static void main(String[] args) {
		Reverse_character_word_string_java8 obj = new Reverse_character_word_string_java8();
		obj.reverse_charahter_in_words("Satish Prasad");
	}

	public void reverse_charahter_in_words(String str) {
		String[] words = str.split(" ");
		
		Stream<String> streamofWords = Arrays.stream(words);
		streamofWords.forEach(w ->{
			Function<String, String> reverse = s->new StringBuilder(s).reverse().toString();
			String reverseWord = reverse.apply(w);
			System.out.println("Reverse word: "+reverseWord+" \n");
		});
		
	}
}
