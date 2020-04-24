package com.program.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("E:\\File\\input.txt");
			fos = new FileOutputStream("E:\\File\\output.txt");
			int c;
			while((c = fis.read()) != -1) {
				fos.write(c);
			}
		}finally {
			if(fis != null) {
				fis.close();
			}
			if(fos != null) {
				fos.close();
			}
		}
	}
}
