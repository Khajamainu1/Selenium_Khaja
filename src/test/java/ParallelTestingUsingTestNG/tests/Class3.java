package ParallelTestingUsingTestNG.tests;

import org.testng.annotations.Test;

public class Class3 {

	
	@Test
	public void method6()
	{
		System.out.println("Class3 >> Method6 >>" +Thread.currentThread().getId());
		
	}
}
