package JavascriptExecutor;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenWebElement {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		
		WebElement hiddenTB = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		//hiddenTB.sendKeys("hii");
		JavascriptExecutor js=(JavascriptExecutor)driver;//To Typecast from webDriver To JavaScriptExecutor
	     js.executeScript("arguments[0].value='hii'",hiddenTB);
	}

}
