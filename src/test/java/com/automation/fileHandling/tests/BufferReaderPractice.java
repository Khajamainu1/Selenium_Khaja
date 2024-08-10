package com.automation.fileHandling.tests;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderPractice {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new FileReader("fos1.txt")))
		{
			String line=br.readLine();
			if (line!=null)
			{
				System.out.println(line);
			}
			
		}

	}

}
