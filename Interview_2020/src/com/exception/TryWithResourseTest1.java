package com.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/*
 Again experienced java developers must be well versed with this exception 
 interview question. Before java 7, we used to write explicit code for closing file in finally block by using try-finally block like this >
 * */

public class TryWithResourseTest1 {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream("c:/txtFile.txt");
		}finally {
			if(inputStream != null)
				inputStream.close();
		}
		
	}
}
