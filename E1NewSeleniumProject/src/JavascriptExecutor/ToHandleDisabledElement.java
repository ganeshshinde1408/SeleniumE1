package JavascriptExecutor;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledElement {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		 driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		 Thread.sleep(2000);
		 
		 WebElement disabledTB = driver.findElement(By.id("name"));
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;//To Typecast from webDriver To JavaScriptExecutor
       
		 js.executeScript("document.getElementById('name').value='admin'");
		 Thread.sleep(2000);
		// js.executeScript("document.getElementById('name').value=''");//to clear textbox
	    js.executeScript("arguments[0].value=''",disabledTB);
	}
}