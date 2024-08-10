package com.automation.String;

import java.util.Arrays;

public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "khaja";
		
		String[] s = name.split("\\s");
		System.out.println(Arrays.toString(s));

		
		int ind = name.length()-1;
		System.out.println(name.charAt(ind));
		
		System.out.println(name.indexOf('a'));
		
		System.out.println(name.substring(1, 4));
		
		
//		System.out.println(name.length());
		
	}

}
