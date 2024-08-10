package com.automation.JavaPractice;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonObject {

	public static void main(String[] args) {
		
	String data = "[\r\n"
			+ "        {\r\n"
			+ "            \"packageId\": \"1101357\",\r\n"
			+ "            \"productGroupId\": \"1101358\",\r\n"
			+ "            \"productId\": \"1101270\",\r\n"
			+ "            \"price\": \"87.72\",\r\n"
			+ "            \"displayName\": \"CSMART Prepaid Premium Plan\",\r\n"
			+ "            \"qty\": \"1\",\r\n"
			+ "            \"isInventory\": \"0\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"packageId\": \"1101357\",\r\n"
			+ "            \"productGroupId\": \"1101358\",\r\n"
			+ "            \"productId\": \"967635\",\r\n"
			+ "            \"price\": \"0.00\",\r\n"
			+ "            \"displayName\": \"SIM\",\r\n"
			+ "            \"qty\": \"1\",\r\n"
			+ "            \"isInventory\": \"1\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"packageId\": \"1101357\",\r\n"
			+ "            \"productGroupId\": \"1101358\",\r\n"
			+ "            \"productId\": \"968018\",\r\n"
			+ "            \"price\": \"0.00\",\r\n"
			+ "            \"displayName\": \"MSISDN\",\r\n"
			+ "            \"qty\": \"1\",\r\n"
			+ "            \"isInventory\": \"1\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"packageId\": \"1101357\",\r\n"
			+ "            \"productGroupId\": \"1101358\",\r\n"
			+ "            \"productId\": \"1101275\",\r\n"
			+ "            \"price\": \"0.00\",\r\n"
			+ "            \"displayName\": \"Premium_Data_30GB\",\r\n"
			+ "            \"qty\": \"1\",\r\n"
			+ "            \"isInventory\": \"0\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"packageId\": \"1101357\",\r\n"
			+ "            \"productGroupId\": \"1101358\",\r\n"
			+ "            \"productId\": \"1101272\",\r\n"
			+ "            \"price\": \"0.00\",\r\n"
			+ "            \"displayName\": \"Premium_Voice_1000Minutes\",\r\n"
			+ "            \"qty\": \"1\",\r\n"
			+ "            \"isInventory\": \"0\"\r\n"
			+ "        },\r\n"
			+ "        {\r\n"
			+ "            \"packageId\": \"1101357\",\r\n"
			+ "            \"productGroupId\": \"1101358\",\r\n"
			+ "            \"productId\": \"1101268\",\r\n"
			+ "            \"price\": \"0.00\",\r\n"
			+ "            \"displayName\": \"Premium_SMS_1000\",\r\n"
			+ "            \"qty\": \"1\",\r\n"
			+ "            \"isInventory\": \"0\"\r\n"
			+ "        }\r\n"
			+ "    ]";
	
	JSONArray js = new JSONArray(data);
	
	
	
	for(int i=0; i<js.length(); i++)
	{
		JSONObject obj =  js.getJSONObject(i);
		
		if(obj.getString("displayName").equalsIgnoreCase("MSISDN"))
		
		System.out.println(obj);
	}

	}

}
