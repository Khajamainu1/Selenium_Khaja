package com.automation.fileHandling.tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileWithFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Path path = Paths.get("src/test/resources/testdirec");
		
		try {
		Files.createDirectory(path);
		System.out.println("File Directory :" + path.getFileName());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
