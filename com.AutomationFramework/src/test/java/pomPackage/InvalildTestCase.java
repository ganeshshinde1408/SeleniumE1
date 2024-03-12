package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

public class InvalildTestCase extends baseTest {

	public static void main(String[] args, WebDriver driver) throws IOException, EncryptedDocumentException, InterruptedException {
		baseTest bt = new baseTest();
		bt.setUp();
		
		Flib flib = new Flib();

       LoginPage lp = new LoginPage(driver);
       
       int rc = flib.getRowCount(EXCEL_PATH,"InvalidCreads");
       System.out.println(rc);
       for(int i=1;i<=rc;i++) {
    	   lp.invalidLoginMethod(flib.readExcelData(EXCEL_PATH, "InvalidCreads", i, 0),flib.readExcelData(EXCEL_PATH, "InvalidCreads", i, 1));
       }
       
       
	}

}
