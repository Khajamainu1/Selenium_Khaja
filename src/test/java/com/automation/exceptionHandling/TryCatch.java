package com.automation.exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=0, c;
		try
		{
		c=a/b;
		}
		catch (Exception e) {
			// TODO: handle exception
		
		System.out.println("Arithmatic 1Exception");
		e.printStackTrace();
		System.out.println(e.toString());
		}
	}

}
