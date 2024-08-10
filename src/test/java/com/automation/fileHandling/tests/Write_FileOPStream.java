package com.automation.fileHandling.tests;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write_FileOPStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		try(FileOutputStream fos = new FileOutputStream("fos1.txt"))
				{
					System.out.println("file is created");
					String content = "FileOutputStream";
				     byte[] data = {01, 02, 90};
				     fos.write(data);
					fos.write(content.getBytes());
				}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
