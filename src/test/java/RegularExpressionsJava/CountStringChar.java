package RegularExpressionsJava;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountStringChar {
	
	public static void main(String[] args) {
		String str = "khajaa";
		System.out.println("Length" +str.length());
		
		Map<Character, Integer> map = new HashMap<>();
		int count =0;
		Pattern p = Pattern.compile(".");
		Matcher m = p.matcher(str);
		
		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			map.put(c, map.get(c)+1);
		}
		
		
		
		 for (char c : map.keySet()) {
	            System.out.println("'" + c + "': " + map.get(c));
	        }
		
		
		
//		System.out.println(count);
		
//		for(char c : str.toCharArray())
//		{
//			
//			System.err.println();
//		}
//	}

}}
