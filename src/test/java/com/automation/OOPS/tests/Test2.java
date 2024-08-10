package com.automation.OOPS.tests;

public interface Test2 extends Test1 {
	
	abstract void age();
	
	default void defaultMethod()
	{
		System.out.println("Test2");
	}

}
