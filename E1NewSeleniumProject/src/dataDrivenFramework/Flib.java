package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public String readExcelData(String excelPath,String sheetName,int rowNo,int cellNo ) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream(excelPath);//To provide the path of excel file
		 Workbook wb = WorkbookFactory.create(fis);//To make the file ready to read
	     Sheet sheet = wb.getSheet(sheetName);//To get into the desired sheet
	     Row row = sheet.getRow(rowNo);//To get into the desired row
	     Cell cell = row.getCell(cellNo);//To get into the desired cell
	     String data = cell.getStringCellValue();//To read the data from the cell
	     return data;
		
	}
	public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream(excelPath);//To provide the path of excel file
		Workbook wb = WorkbookFactory.create(fis);//To make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);//To get into the desired sheet
	    int rc = sheet.getLastRowNum();//To get no of rows from sheet
	    return rc;

	}
	public void writeExcelData(String excelPath,String sheetName,int rowNo,int cellNO,String data) throws EncryptedDocumentException, IOException {
	    FileInputStream fis= new FileInputStream(excelPath);//To provide the path of excel file
	    Workbook wb = WorkbookFactory.create(fis);//To make the file ready to read
	    Sheet sheet = wb.getSheet(sheetName);//To get into the desired sheet
	    Row row = sheet.getRow(rowNo);//To get into the desired row
        Cell cell = row.getCell(cellNO);//To get into the desired cell
        cell.setCellValue(data);
    
        FileOutputStream fos = new FileOutputStream(excelPath);
        wb.write(fos);
	}
}