package com.string;

public class DuplStr {
	public static void main(String[] args) {
		String str = "Satish Prasad";
		int count=0;
		char[] charCount = str.toCharArray();
		System.out.println("Duplicates characters are: ");
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(charCount[i] == charCount[j]) {
					System.out.println(charCount[j]);
					count++;
					break;
				}
			}
		}
	}
}
