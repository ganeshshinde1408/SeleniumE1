package pomPackage;

import java.io.IOException;

public class validLoginTestCase extends baseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		baseTest bt = new baseTest();

		bt.setUp();
        
        Flib flib = new Flib();
        
        LoginPage lp = new LoginPage(driver);
                
       lp.validLoginMethod(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"password"));
	}

}
