package com.automation.Arrays.tests;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		int largest = arr[0];
		
		for(int number : arr)
		{
			if(number>largest)
			{
				largest=number;
			}
		}
		System.out.println(largest);

	}

}
