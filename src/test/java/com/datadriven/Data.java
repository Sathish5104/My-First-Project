package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {
	public static void main(String[] args) throws Throwable {
//		File f = new File("C:\\Users\\asus\\eclipse-workspace\\Pomframe\\Excel\\Data Driven.xlsx");
//		FileInputStream fis = new FileInputStream(f);
//		Workbook w = new XSSFWorkbook(fis);
//		Sheet s = w.getSheet("value");
//		Row r = s.getRow(5);
//		Cell c = r.getCell(3);
//		System.out.println(c);
		
////////////////////////////////////////////////////////////////////////////////////////////////////////
		//to get particular row in  all data 
		
//			Row r = s.getRow(0);
//		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {
//		Cell sr = r.getCell(i);
//			System.out.println(sr);
//			}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////
		// does not arrange properly order So Arrange properly
//		
//	for( int i=0; i<s.getPhysicalNumberOfRows(); i++) {
//				Row r = s.getRow(i);
//	for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
//				Cell c = r.getCell(j);
//				System.out.println(c);
//  }		
//			}

////////////////////////////////////////////////////////////////////////////////////////////////////////
	// does not arrange properly order So Arrange properly
	
//		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
//			Row r = s.getRow(i);
//
//			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
//				Cell cell = r.getCell(j);
//
//				int ecell = cell.getCellType();
//
//				if (ecell == 1) {
//					String st = cell.getStringCellValue();
//					System.out.println(st);
//					
//				} else if (DateUtil.isCellDateFormatted(cell)) {
//					Date dt = cell.getDateCellValue();
//					SimpleDateFormat st = new SimpleDateFormat("dd/MM/yyy");
//					String date = st.format(dt);
//					System.out.println(date);
//				} 
//				
//				else {
//					double num = cell.getNumericCellValue();
//					long l = (long) num;
//					String no = String.valueOf(l);
//					System.out.println(no);
//
//				}}}
////////////////////////////////////////////////////////////////////////////////////////////////////////
// create a new File inn excel And Attached Some New Value 
	
	File f= new File("C:\\Users\\asus\\eclipse-workspace\\Pomframe\\Excel\\WriteTesting.xlsx");
	FileOutputStream fos= new FileOutputStream(f);

			Workbook w = new XSSFWorkbook();
			
			Sheet s = w.createSheet("SATHISH");
	     Row r = s.createRow(1);
		Cell C = r.createCell(1);
		C.setCellValue("SELENIUM");
	     w.write(fos);
	
	System.out.println("done");
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////			
				
			//if REwrite  In Method we HAve Follw 	
				
//	File f = new File("C:\\Users\\asus\\eclipse-workspace\\Pomframe\\Excel\\WriteTesting.xlsx");
//	
//		FileOutputStream fos = new FileOutputStream(f);
//		
//				Workbook w =new XSSFWorkbook();
//				Sheet s = w.getSheet("SATHISH");
//				Row r = s.getRow(1);
//				Cell c = r.getCell(1);
//				String sc = c.getStringCellValue();
//				if (sc.startsWith("sel")) {
//					c.setCellValue("JAVAsELENIUM");
//				}
//				else {
//					c.setCellValue("python");
//				}
//				w.write(fos);
//				
//			System.out.println("done");
		
		
		
		
		
		
		
		
		
		
}}
		