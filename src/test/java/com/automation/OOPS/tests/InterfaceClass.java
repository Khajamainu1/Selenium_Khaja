package com.automation.OOPS.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterfaceClass implements Test1, Test2 {
	
	@Override
	public void age() {
		// TODO Auto-generated method stub
		
		System.out.println("Age -Test2");
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Name - Test1");
	}

	
	  public void defaultMethod() {
	        Test2.super.defaultMethod();
	    }
	  
	  ChromeDriver driver = new ChromeDriver();
	  
	  driver.
	 
	public static void main(String[] args) {
		
	Test1 t1 = new InterfaceClass();
	
	t1.defaultMethod();
}
}