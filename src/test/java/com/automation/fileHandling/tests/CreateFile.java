package com.automation.fileHandling.tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) throws IOException {
		

		String directoryPath = System.getProperty("user.dir")+"\\ExcelData";
		File directory = new File(directoryPath);
		if(!directory.exists())
		{
			directory.mkdir();
		}
		
		String csvFileName = System.getProperty("user.dir")+"\\ExcelData\\Testing.csv";
		
		FileWriter fw = new FileWriter(csvFileName);
		
		fw.append("Name, Age, Salary\n");
		fw.append("Khaja, 25, 50000");
		
		fw.write("Name, Age, Salary");
		
		
		fw.close();
		
		System.out.println("File Created");
	}

}
