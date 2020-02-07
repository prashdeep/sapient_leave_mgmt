package com.sapient.lms.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(new File("E:\\test.xlsx")));
		XSSFSheet myExcelSheet = myExcelBook.getSheet("content");
		XSSFRow row = myExcelSheet.getRow(0);
		String name = row.getCell(0).getStringCellValue();
		System.out.println("name : " + name);

		String value2 = row.getCell(1).getStringCellValue();
		System.out.println("value :" + value2);
		
		XSSFRow row1 = myExcelSheet.getRow(1);
		String name1 = row.getCell(0).getStringCellValue();
		System.out.println("name : " + name1);

		String value22 = row1.getCell(1).getStringCellValue();
		System.out.println("value :" + value22);

		myExcelBook.close();
	}

}
