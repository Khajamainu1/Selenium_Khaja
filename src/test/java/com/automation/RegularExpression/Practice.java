package com.automation.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "apple1@.";
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			System.out.println(m.group());
		}
		
	}
	

}
