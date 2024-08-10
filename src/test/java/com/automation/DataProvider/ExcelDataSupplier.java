package com.automation.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;



public class ExcelDataSupplier {
    
	@DataProvider(name = "dataProviderName", indices = {0})
		public Object[][] getData() throws IOException {
        File excelFile = new File("./src/test/resources/ExcelData/Data.xlsx");
        System.out.println(excelFile.exists());
        
        FileInputStream fis = new FileInputStream(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet =workbook.getSheet("Sheet1");
        
        System.out.println(sheet.getPhysicalNumberOfRows());
     
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfColumns = sheet.getRow(0).getLastCellNum();
        

        Object[][] data = new Object[noOfRows-1][noOfColumns];
        
        
        for (int i=1; i<noOfRows; i++){
        	
        		DataFormatter df = new DataFormatter();
        		
          	String parameter1 = df.formatCellValue(sheet.getRow(i).getCell(0));
        		String parameter2 =df.formatCellValue(sheet.getRow(i).getCell(1));
        		data[i-1][0] = parameter1;
        		data[i-1][1]= parameter2;
        	}
        
        
        workbook.close();
        fis.close();
      return data;
        }
		
    }

