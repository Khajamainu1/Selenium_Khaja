package com.automation.String;

public class Reverse_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Ranju";
//		StringBuilder builder = new StringBuilder(name);
//		
//		
//		String rev = builder.reverse().toString();
//		
//		if(name.equals(rev))
//		{
//			System.out.println("Its a Palindrome");
//		}
//		else
//			System.out.println("Not a Palindrome");
//		
//		
		
	//}
	
	
	System.out.println(name.length());
	String rev = ""; 
	

	for(int i = name.length()-1; i>=0; i--)
	{
	rev+=name.charAt(i);	
	}
	
	System.out.println(rev);

	if(name.equals(rev))
		{
			System.out.println("Its a Palindrome");
		}
		else
			System.out.println("Not a Palindrome");
}
}