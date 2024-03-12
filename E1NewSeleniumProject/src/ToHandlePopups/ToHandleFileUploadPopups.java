package ToHandlePopups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUploadPopups {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		
	    Thread.sleep(2000);
	   WebElement uploadfile = driver.findElement(By.id("fileInput"));
	  uploadfile.sendKeys("C:\\Users\\Akshay\\Downloads\\Shreya Dhande.docx");
}
}