package com.automation.JavaPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowels {
	

	
	public static void main(String[] args) {
	String str = "welcome";
	

	str = str.toLowerCase();
	
	
	if(str.matches("*"))
	{
		System.out.println("True");
	}
	else
		System.out.println("False");
	
//	Pattern p = Pattern.compile(".");
//	Matcher m = p.matcher(str);
//	
//	if(m.find())
//	{
//		count++;
//		System.out.println(m.start()+"-------"+m.group());
//		System.out.println(count);
//	}
}}
