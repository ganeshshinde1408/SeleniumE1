package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");
		//To Make File Ready To Read
	    Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");//To get into the Sheet
	    Row row = sheet.getRow(0);//To get into the Row
	    Cell cell = row.createCell(2);//To create cell into sheet
		cell.setCellValue("OWNER");
		FileOutputStream fos = new FileOutputStream("./Data/TestData.xlsx");
		wb.write(fos);
			}
	    }