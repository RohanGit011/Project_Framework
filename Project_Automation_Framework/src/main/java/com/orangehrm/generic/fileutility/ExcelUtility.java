package com.orangehrm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getDataFromExcelFile(String sheetName,int rowNum,int cellNum) throws IOException
	{
		FileInputStream file = new FileInputStream("./src/main/resources/File.properties");
		
		Workbook wb = WorkbookFactory.create(file);
		
		Sheet sh = wb.getSheet(sheetName);
		
		Row row = sh.getRow(rowNum);
		
		Cell cell = row.getCell(cellNum);
		
		return cell.getStringCellValue();
	}
	
	public void getDataFromExcelFile(String sheetName,int rowNum,int cellNum,String value) throws IOException
	{
		FileInputStream file = new FileInputStream("./src/main/resources/File.properties");
		
		Workbook wb = WorkbookFactory.create(file);
		
		Sheet sh = wb.getSheet(sheetName);
		
		Row row = sh.getRow(rowNum);
		
		Cell cell = row.createCell(cellNum);
		
		cell.setCellType(CellType.STRING);
		
		cell.setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream(" ");
		
		wb.write(fos);
	}

}
