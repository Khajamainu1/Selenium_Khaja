package com.automation.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSuppliers {
public static void main(String[] args) {
	
}

	public Object[] getData() throws IOException {
		// TODO Auto-generated method stub
		
		String filePath = "./src/test/resources/ExcelData/Data.xlsx";
		File file = new File(filePath);
		
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfColumns = sheet.getLastRowNum();
		
		Object[] data = new Object[noOfRows-1];
	    Map<String, String> map = new LinkedHashMap<>();

        for (int i = 1; i < noOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {
                DataFormatter df = new DataFormatter();
                String key = df.formatCellValue(sheet.getRow(i).getCell(0));
                String value = df.formatCellValue(sheet.getRow(i).getCell(1));
                map.put(key, value);
                data[i-1]= map;
                

            }
        }
		
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
     
        }
		return data;
     

	}

}
