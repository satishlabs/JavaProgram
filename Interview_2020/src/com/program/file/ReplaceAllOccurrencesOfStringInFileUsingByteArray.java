package com.program.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReplaceAllOccurrencesOfStringInFileUsingByteArray {
	public static void main(String[] args) throws IOException {
		String fileName = "E://File//Sample.txt";
		String searchWord = "abc";
		String replaceWord = "xyz";
		
		try {
			 //1) Read file in String (i.e. in fileDataInString).
			FileInputStream fis = new FileInputStream(fileName);
			byte[] b = new byte[fis.available()]; //use byte Array
			fis.read(b);
			String fileDataInString = new String(b);
			fis.close();
			
			 //By now, String fileDataInString contains all the data of file.
			System.out.println(fileDataInString);
			
			fileDataInString = fileDataInString.replaceAll(searchWord, replaceWord);
			
			//Now, write fileDataInString in file
			FileOutputStream fos = new FileOutputStream(fileName,false);
			fos.write(fileDataInString.getBytes());
			fos.close();
			 System.out.println("all occurrences of "+searchWord+" has been replaced with "
                     +replaceWord+" in "+fileName);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
