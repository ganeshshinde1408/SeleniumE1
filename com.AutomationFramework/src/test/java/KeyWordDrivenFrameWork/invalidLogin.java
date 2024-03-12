package KeyWordDrivenFrameWork;

import java.io.IOException;
import org.openqa.selenium.By;

public class invalidLogin extends baseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		baseTest bt = new baseTest();
		bt.setup();
		
		Flib flib = new Flib();
		int rc = flib.getRowCount(Excel__Path,"InvalidCreads" );
		
		for(int i=1;i<=rc;i++) {
		String usnData = flib.readExcelData(Excel__Path,"InvalidCreads",i,0);
		String passData = flib.readExcelData(Excel__Path,"InvalidCreads",i,1);
		
		driver.findElement(By.name("username")).sendKeys(usnData);
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(passData);
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("username")).clear();
		}
		
	}

}