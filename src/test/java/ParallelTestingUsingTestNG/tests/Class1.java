package ParallelTestingUsingTestNG.tests;

import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	public void method1()
	{
		System.out.println("Class1 >> Method1 >>" +Thread.currentThread().getId());
		
	}
	
	@Test
	public void method2()
	{
		System.out.println("Class1 >> Method2 >>" +Thread.currentThread().getId());
		
	}
	
	@Test
	public void method3()
	{
		System.out.println("Class1 >> Method3 >>" +Thread.currentThread().getId());
		
	}

}
