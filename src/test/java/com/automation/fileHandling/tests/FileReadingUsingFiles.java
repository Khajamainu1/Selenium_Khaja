package com.automation.fileHandling.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadingUsingFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path path = Paths.get("fos1.txt");
		try {
		List<String> lines = Files.readAllLines(path);
		
		for(String line : lines)
		{
			System.out.println(line);
		}
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
