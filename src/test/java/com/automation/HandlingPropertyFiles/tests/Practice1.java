package com.automation.HandlingPropertyFiles.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.automation.enums.Config_Prop;

public class Practice1 {
	static Map<String , String> map = new HashMap<String, String>();
	
	
	public static void main(String[] args) {
		
        Properties properties = new Properties();
        
        try (FileInputStream input = new FileInputStream("C:\\Users\\khaja.mohinuddin\\eclipse-workspace\\SeleniumJavaLearning\\src\\test\\resources\\config\\test_ConfigProperties")) {
            // Load properties from the file
        	
        	
            properties.load(input);
            
          
            
            // Retrieve a Set of all keys
            Set<Object> keys = properties.keySet();
            
            System.out.println("set values :" + keys);
            
            // Iterate over the Set of keys
            System.out.println("Keys in properties file:");
            for (Object key : keys) {
            	
//            	map.put(String.valueOf(key), String.valueOf(properties.get(key)));
            	map.put((String) key, String.valueOf(properties.get(key)));
           
                // Convert key to String
                String keyString = (String) key;
                // Print key
                System.out.println(keyString);
            }
            
            
            //get method 
           System.out.println("Enum :"+ get(Config_Prop.NAME));
        }   
        
        catch (FileNotFoundException e) {
            // Handle the specific case where the file is not found
            System.err.println("Error: The specified file was not found.");
            e.printStackTrace(); // Print the stack trace for debugging

        } catch (IOException e) {
            // Handle other IO exceptions, such as reading errors
            System.err.println("Error: An I/O error occurred while processing the file.");
            e.printStackTrace(); // Print the stack trace for debugging
        }
        
 
       
    }
	
	
	public static String get(Config_Prop key)
	{
		return map.get(key.name().toLowerCase());
	}
	
	
	
}