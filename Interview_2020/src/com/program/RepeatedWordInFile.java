package com.program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWordInFile {
	public static void main(String[] args) {
		HashMap<String, Integer> wordCoutMap = new HashMap<>();
		BufferedReader br =null;
		try{
			br = new BufferedReader(new FileReader("D:/File/testFile4.txt"));
			String currentLine = br.readLine();
			while(currentLine != null){
				String[] words = currentLine.toLowerCase().split(" ");
				
				//iterating each word
				for(String word: words){
					if(wordCoutMap.containsKey(word)){
						wordCoutMap.put(word, wordCoutMap.get(word)+1);
					}else{
						wordCoutMap.put(word, 1);
					}
				}
				//reading next line
				currentLine = br.readLine();
			}
			//System.out.println("wordCoutMap :"+wordCoutMap);
			String mostRepeatedWord = null;
			int count=0;
			Set<Entry<String, Integer>> entrySet = wordCoutMap.entrySet();
			for(Entry<String, Integer> entry : entrySet){
				if(entry.getValue()>count){
					mostRepeatedWord = entry.getKey();
					count = entry.getValue();
				}
			}
			System.out.println("Most repeated word in file: "+mostRepeatedWord);
			System.out.println("Number of occurence :"+count);
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try{
				br.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
