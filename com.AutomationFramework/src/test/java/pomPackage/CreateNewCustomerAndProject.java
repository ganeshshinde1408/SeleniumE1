package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class CreateNewCustomerAndProject extends baseTest {

	private static final String PROP_PATH = null;

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		baseTest bt = new baseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		
		
		String usn = flib.readPropertyData(PROP_PATH, "username");
		String pwd = flib.readPropertyData(PROP_PATH, "password");
		lp.validLoginMethod(usn, pwd);
		
		homePage hp = new homePage(driver);
		hp.getTaskModule().click();
		
		TaskPage tp = new TaskPage(driver);
		tp.createCustomer(flib.readExcelData(EXCEL_PATH, "taskspagedetails", 1, 0));
		
		tp.createProject(flib.readExcelData(EXCEL_PATH, "taskspagedetails", 1, 0), flib.readExcelData(EXCEL_PATH, "taskspagedetails", 1, 1));
		
		Thread.sleep(5000);
		tp.deleteAllCustomerAndProjects();

	}

}