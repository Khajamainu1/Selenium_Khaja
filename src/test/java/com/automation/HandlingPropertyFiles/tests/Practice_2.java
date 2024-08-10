package com.automation.HandlingPropertyFiles.tests;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.automation.enums.Config_Prop;

public class Practice_2 {
	
//	private Practice_2()
//	{
//		
//	}
	
	static Properties prop ;
public static void main(String[] args) {
	
	
 prop = new Properties();
 Map<Object, Object> map = new HashMap<>();

//	private static Properties prop = new Properties();
//	private static final Map<Object, Object> map = new HashMap<>();
	
//	static {
		
		try(FileInputStream file = new FileInputStream("C:\\Users\\khaja.mohinuddin\\eclipse-workspace\\SeleniumJavaLearning\\src\\test\\resources\\config\\test_ConfigProperties"))
	{
	
			prop.load(file);
			for(Object key : prop.keySet())
			{
				map.put(key, prop.get(key));
			}
			
			System.out.println(map);
			
	}
	 catch (Exception e) {
		// TODO: handle exception
	}
	get(Config_Prop.NAME);
	
}


public static String get(Config_Prop key)
{
	
	return (String) prop.get(key.name());
}
}