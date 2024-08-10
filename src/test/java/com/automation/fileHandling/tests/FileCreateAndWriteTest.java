package com.automation.fileHandling.tests;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreateAndWriteTest {

	 public static void main(String[] args) throws IOException {
	        String filePath = "C:\\PracticeFiles\\test1.txt";
	        String direcPath = "C:\\PracticeFiles";

	        try {
	            File directory = new File(direcPath);

	            if (!directory.exists()) {
	                if (directory.mkdirs()) {
	                    System.out.println("Directory Created");
	                } else {
	                    System.out.println("Failed to create directory");
	                }
	            } else {
	                System.out.println("Directory already exists");
	            }

	            File file = new File(filePath);
	            if (file.createNewFile()) {
	                System.out.println("File Created");
	            } else {
	                System.out.println("File already exists");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        try (FileWriter fw = new FileWriter(filePath)) {
	            fw.write("Welcome to Bangalore");
	        }
	    }
	}