package com.automation.fileHandling.tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		try(FileOutputStream fos = new FileOutputStream("Excel1.xlsx"))
		{
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("Data");
			
			Row row = sheet.createRow(0);
			XSSFCell cell = row.createCell(0);
			cell.setCellValue("Hello");
			
			
			XSSFCell cell1 = row.createCell(1);
			cell1.setCellValue("World");
			
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
//		
//		try(FileOutputStream fos = new FileOutputStream("Excel.xlsx"))
//		{
//
//		XSSFWorkbook workbook = new XSSFWorkbook();
//		XSSFSheet sheet = workbook.createSheet();
//		
//		XSSFRow row = sheet.createRow(0);
//		XSSFCell cell =row.createCell(0);
//		
//		cell.setCellValue("Hello");
//		
//		XSSFCell cell1 =row.createCell(1);
//		cell1.setCellValue("world");
//		
//		workbook.write(fos);
//		
//		
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
//		
//		
//				

	}

}
