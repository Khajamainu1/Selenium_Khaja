package com.automation.String;

public class Practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n="khaja";

		StringBuilder b = new StringBuilder(n);
		String rev=b.reverse().toString();
		
		if(b.equals(rev))
		{
			System.out.println("Is a palindrome");
		}
		else
			System.out.println("Not a palindrome");
		
		
		
		
		
		
		
//
//		String sub =b.substring(3);
//		System.out.println(sub);
//		System.out.println(b);
//		
//		
////		System.out.println(b.reverse());
//		b.append("Moin");
//		System.out.println(b);
////		b.replace(1, 4, str);
	}

}
