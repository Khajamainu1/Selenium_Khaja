package com.automation.Arrays.tests;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 123;
		int sum =0;
		
		while(n>0)
		{
			int dig = n%10;
			sum=sum+dig;
			n=n/10;
		}
		System.out.println(sum);

	}

}
