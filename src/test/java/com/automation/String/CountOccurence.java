package com.automation.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//	String str = "Khaja";
//	char[] ch = str.toCharArray();
//	
//	Map<Character, Integer> map = new HashMap<Character, Integer>();
//	
//	for(char c : ch)
//	{
//		if(map.containsKey(c))
//		{
//			map.put(c, map.get(c)+1);
//		}
//		else
//			map.put(c, 1);
//	}
//	
//	for(Map.Entry<Character, Integer> entry : map.entrySet())
//	{
//		System.out.println(entry.getKey() +":"+ entry.getValue());
//	}
//
//	}
//
//}



		String s = "Khaja";
		char[] c = s.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (char ch : c)
		{
			if (map.containsKey(ch))
			{
				
			map.put(ch, map.get(ch)+1);
			}
			else
				map.put(ch, 1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + " : "+ entry.getValue());
		}







	}}
