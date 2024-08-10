package com.automation.RegularExpression;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mifmif.common.regex.Main;

public class Practice_1 {
	
	public static  String ExtractNumericValue(String value) {
        Pattern pattern = Pattern.compile("\\d+\\.\\d+");
        Matcher matcher = pattern.matcher(value);

        if (matcher.find()) {
            return matcher.group();
        } else {
           
            pattern = Pattern.compile("\\d+");
            matcher = pattern.matcher(value);

            if (matcher.find()) {
                DecimalFormat decimalFormat = new DecimalFormat("0.00");
                return decimalFormat.format(Double.parseDouble(matcher.group()));
            } else {
                return "Invalid";
            }
        }
  
	}
	
	public static void main(String[] args) {
		
		ExtractNumericValue("Khaja123.000");
		
	}
	

}
