package com.automation.fileHandling.tests;

import java.io.File;

public class CreateFileWithFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			File f = new File("file1.txt");
		if(f.createNewFile())
		{
			System.out.println("File Created :" + f.getName());
		
		}
		else
		{
			System.out.println("File already exists");
		}
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
