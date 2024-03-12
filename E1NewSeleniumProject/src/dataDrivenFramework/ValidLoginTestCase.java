package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("http://127.0.0.1/login.do;jsessionid=77bv8ti1bp6jd");
			
			Flib flib = new Flib();
			
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./Data/TestData.xlsx","ValidCread",1,0));
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./Data/TestData.xlsx","ValidCread",1,1));
			driver.findElement(By.id("loginButton")).click();
			
	 }
 }
