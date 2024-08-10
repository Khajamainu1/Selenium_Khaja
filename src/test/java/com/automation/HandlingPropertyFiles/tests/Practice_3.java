package com.automation.HandlingPropertyFiles.tests;

import java.io.FileInputStream;
import java.util.Properties;

public class Practice_3 {
	
	public static void main(String[] args) {
		
	
	Properties prop= null;
	
	try(FileInputStream fis = new FileInputStream("C:\\Users\\khaja.mohinuddin\\eclipse-workspace\\SeleniumJavaLearning\\src\\test\\resources\\config\\test_ConfigProperties")) 
	{
		prop = new Properties();
		prop.load(fis);
		
		for(Object key : prop.keySet())
		{
			System.out.println(String.valueOf(key)+""+String.valueOf(false));
		}
		
	}
	
	catch (Exception e) {
		// TODO: handle exception
	}

}
