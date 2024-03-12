package pomPackage;

import java.io.IOException;

public class CreateUserManager  extends baseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		baseTest bt = new baseTest();
		bt.setUp();
		
		Flib flib = new Flib();

		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
		
		 homePage hp = new homePage(driver);
		 hp.getUsersMOdule().click();
		 
		UsersPage up = new UsersPage(driver);
		up.getCreateNewUserButtons();
		
		Worklib wl = new Worklib();
		int no = wl.randomNo();
		
		String usn = flib.readExcelData(EXCEL_PATH,"managercreads", 1, 0);
		String pwd = flib.readExcelData(EXCEL_PATH,"managercreads", 1, 1);
		String fname = flib.readExcelData(EXCEL_PATH,"managercreads", 1, 2);
		String lname = flib.readExcelData(EXCEL_PATH,"managercreads", 1, 3);
		
		up.CreateUserMethod(usn+no, pwd+no, fname+no, lname+no);
	}

}
