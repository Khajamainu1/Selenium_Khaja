package com.automation.fileHandling.tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_BufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filePath = "C:\\PracticeFiles\\test1.txt";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		while((line=br.readLine()) != null)
		{
			System.out.println(line);
		}
		br.close();

	}

}
