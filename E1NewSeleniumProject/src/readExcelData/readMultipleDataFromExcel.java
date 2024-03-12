package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		for(int i = 1;i<=9;i++) {
		FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");
		//To Make File Ready To Read
	    Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");//To get into the Sheet
	    Row row = sheet.getRow(i);//To get into the Row
	    Cell cell = row.getCell(0);//To get into the Cell
		String data = cell.getStringCellValue();//To read the data from the cell
		System.out.println(data);
			}
	    }
	}
