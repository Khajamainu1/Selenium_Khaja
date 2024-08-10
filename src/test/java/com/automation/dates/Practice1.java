package com.automation.dates;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> data = new ArrayList<>();
		 data.add("20");
		 data.add("30");
		 data.add("-10");
		 data.add("50");
		 

		 if(data.contains("-"))
		 {
			 System.out.println("Negative value is present");
		 }
	}

}
