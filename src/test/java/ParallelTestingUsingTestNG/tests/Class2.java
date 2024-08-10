package ParallelTestingUsingTestNG.tests;

import org.testng.annotations.Test;

public class Class2 {
	
	
		
		@Test
		public void method4()
		{
			System.out.println("Class2 >> Method4 >>" +Thread.currentThread().getId());
			
		}
		
		@Test
		public void method5()
		{
			System.out.println("Class2 >> Method5 >>" +Thread.currentThread().getId());
			
		}
		
	

}
