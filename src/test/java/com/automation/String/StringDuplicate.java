package com.automation.String;

import java.util.HashSet;
import java.util.Set;

public class StringDuplicate {

	public static void main(String[] args) {

		String str = "Khaja";
		char [] c = str.toCharArray(); 
		
		Set<Character> chars = new HashSet<>() ;
		Set<Character> dup = new HashSet<>() ;
		
		for(char ch1 : c)
		{
//			if(!chars.add(ch1))
//					{
//				dup.add(ch1);
//					}
			
		}
		
		System.out.println("Dup :" +dup);
		System.out.println("Non Dup :" +chars);
		
		
		
//		for(char ch : c)
//		{
//			if(!chars.add(ch))
//			{
//				dup.add(ch);
//			}
//		}
//		
//		System.out.println(chars);
//		System.out.println(dup);
		
		
		
		
		
		
		
		
//		for(char ch : c) 
//		{
//			if(!chars.add(ch))
//			{
//			dup.add(ch);
//			}
//	
//		}
//		System.out.println(chars);
//		System.out.println(dup);

}}
