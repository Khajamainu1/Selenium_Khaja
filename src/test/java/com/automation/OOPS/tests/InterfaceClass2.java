package com.automation.OOPS.tests;

import org.openqa.selenium.chrome.ChromeDriver;

public class InterfaceClass2 implements Test1 {
	
	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}
	
	public void interfaceClassMethod()
	{
		System.out.println("InClass");
	}
	
	
	ChromeDriver driver = new ChromeDriver();
	driver.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Test1 t1 = new InterfaceClass2() ;
			
		t1.defaultMethod();
		t1.name();
		

	

	
	}
}
