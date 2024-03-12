package ToHandlePopups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadpopup {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
	    Thread.sleep(2000);
	   WebElement uploadfile = driver.findElement(By.id("uploadfile"));
	   Actions act = new Actions(driver);
	   act.click(uploadfile).perform();
	   Thread.sleep(1000);
	   Runtime.getRuntime().exec("./autoitPrograms/FileUpload.exe");
	
	}
}
