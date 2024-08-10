package com.automation.RegularExpression;

import java.util.regex.Pattern;

import org.hamcrest.Matcher;



public class Dot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Apple";

		
		Pattern p = Pattern.compile(".*[aeiou]*.");
		java.util.regex.Matcher matcher = p.matcher(s);
		
		if(matcher.find())
		{

			System.out.println("vowels are present");
			
		}
		else 
			System.out.println("Vowels are not present");
	
		

	}

}

//String str = "Khaja Moin";
//
//String[] split = str.split("\\s");
//
//
//System.out.println(split[0]);
//System.out.println(split[1]);
//
////System.out.println(split);
////for(String sp : split)
////{
////	System.out.println(sp);
////	
////}
