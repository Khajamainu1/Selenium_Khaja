package com.automation.String;

public class Amstrong {

	
	//n=153  --- 1*1*1 + 5*5*5 + 3*3*3 = 153
	//n=23   --- 2^2 + 3^2 = 13
	//n=1234 --- 1^4 + 2^4 + 3^4 4^4
	public static void main(String[] args) {
	
		int num = 153;
		int originalNum =num;
		int digit = String.valueOf(num).length();
	
		
		int sum=0;
		
		while(num!=0)
		{
			int numDigits = num%10;
			sum+=Math.pow(numDigits, digit);
			num = num/10;
			
		}
		
		if(originalNum==sum)
		{
			System.out.println("Is a Amstrong");
		}
		else
			System.out.println("Not a Amstrong");
		
	}

}
