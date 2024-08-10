package com.automation.String;

public class AmstrongPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153;
		int originalNum = num;
		int power = String.valueOf(num).length();
		
	
		
		int sum =0;
		while(num!=0)
		{
			int digits =num%10;
			sum+=Math.pow(digits, power);
			num=num/10;
		}
		
		if(originalNum==sum)
		{
			System.out.println("Its a amstrong");
		}
		else
			System.out.println("Not a amstrong");
	}

}
