package com.automation.String;

import java.util.HashSet;
import java.util.Set;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello Iraa";
		String str1 = str.toLowerCase();
		char[] ch = str1.toCharArray();
		
		int vowels =0, consonents =0;
		
		Set<Character> countVowels = new HashSet<>();
		Set<Character> countConsonents = new HashSet<>();

		
		for(char c : ch)
		{
			//this is is checking 
//			if(c<'a' || c>'z') 
//			{
		if( c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			if(!countVowels.contains(c))
			{
			vowels++;
			countVowels.add(c);
			}
		}
			else
			{
				if(!countConsonents.contains(c))
				{
					consonents++;
					countConsonents.add(c);
				}
			}
		}
	
		//}
		
		
		
System.out.println("Vowels :"+vowels);
System.out.println("consonents :" + consonents);
	}
}