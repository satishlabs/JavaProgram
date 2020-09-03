package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//we need not to write explicit code for closing file.
public class TryWithResourseTest2 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(InputStream inputStream = new FileInputStream("c:/txtFile.txt")){
			
		}
	}
}
