package com.automation.OOPS.tests;

public interface Test1 {
	
	 void name();
	
	 default void defaultMethod()
	{
		System.out.println("Test1");
	}
	 
	 
}




