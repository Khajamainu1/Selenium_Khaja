package com.automation.fileHandling.tests;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_Writer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filePath = "C:\\PracticeFiles\\test1.txt";
		
		FileReader fr = new FileReader(filePath);
		
		int ch;
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		

	}

}
