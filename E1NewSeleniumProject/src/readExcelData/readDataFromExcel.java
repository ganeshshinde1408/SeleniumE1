package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readDataFromExcel {
	public static void main(String[]args) throws EncryptedDocumentException, IOException{
		//To Specify The path Of The Excel File
		FileInputStream fis= new FileInputStream("./Data/TestData.xlsx");
		//To Make File Ready To Read
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");//To get into the Sheet
		Row row = sheet.getRow(4);//To get into the Row
		Cell cell = row.getCell(0);//To get into the Cell
		String data = cell.getStringCellValue();//To read the data from the cell
		System.out.println(data);
	}
}
