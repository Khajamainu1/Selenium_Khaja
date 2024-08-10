package com.automation.String;import org.apache.hc.client5.http.ssl.ConscryptClientTlsStrategy;

import com.beust.jcommander.internal.Console;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Khaja";
		str=str.toLowerCase();
		char[] ch = str.toCharArray();
		
		int vowels=0, conconents=0;
		for(char c : ch)
		{
			if(Character.isLetter(c))
			{
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				{
					vowels++;
				}
				else
					conconents++;
				
			}
		}
		
		System.out.println(vowels);
		System.out.println(conconents);
		

	}

}
